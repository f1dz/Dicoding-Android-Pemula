package in.khofid.automaker;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridAutoMakerAdapter extends RecyclerView.Adapter<GridAutoMakerAdapter.GridViewHolder> {

    private Context context;
    private ArrayList<AutoMaker> autoMakers;

    public GridAutoMakerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_item, viewGroup, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder gridViewHolder, int i) {
        Glide.with(context)
                .load(getAutoMakers().get(i).getPhoto())
                .apply(new RequestOptions().override(350, 550).fitCenter())
                .into(gridViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getAutoMakers().size();
    }

    public ArrayList<AutoMaker> getAutoMakers() {
        return autoMakers;
    }

    public void setAutoMakers(ArrayList<AutoMaker> autoMakers) {
        this.autoMakers = autoMakers;
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
