package in.khofid.automaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvAutoMaker;
    private ArrayList<AutoMaker> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAutoMaker = findViewById(R.id.rv_main);
        rvAutoMaker.setHasFixedSize(true);

        list.addAll(AutoMakerData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                showRecycleCardView();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showRecyclerList() {
        rvAutoMaker.setLayoutManager(new LinearLayoutManager(this));
        final ListAutoMakerAdapter listAutoMakerAdapter = new ListAutoMakerAdapter(this);
        listAutoMakerAdapter.setListAutomaker(list);
        rvAutoMaker.setAdapter(listAutoMakerAdapter);

        ItemClickSupport.addTo(rvAutoMaker).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedMaker(list.get(position));
            }
        });
    }

    private void showRecyclerGrid() {
        rvAutoMaker.setLayoutManager(new GridLayoutManager(this, 2));
        GridAutoMakerAdapter gridAutoMakerAdapter = new GridAutoMakerAdapter(this);
        gridAutoMakerAdapter.setAutoMakers(list);
        rvAutoMaker.setAdapter(gridAutoMakerAdapter);

        ItemClickSupport.addTo(rvAutoMaker).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedMaker(list.get(position));
            }
        });
    }

    private void showRecycleCardView() {
        rvAutoMaker.setLayoutManager(new LinearLayoutManager(this));
        CardViewAutoMakerAdapter adapter = new CardViewAutoMakerAdapter(this);
        adapter.setAutoMakers(list);
        rvAutoMaker.setAdapter(adapter);
    }

    private void showSelectedMaker(AutoMaker maker){
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra(DetailActivity.EXTRA_NAME, maker.getName());
        intent.putExtra(DetailActivity.EXTRA_DETAIL, maker.getDetail());
        intent.putExtra(DetailActivity.EXTRA_PHOTO, maker.getPhoto());
        startActivity(intent);
    }
}
