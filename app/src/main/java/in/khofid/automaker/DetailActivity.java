package in.khofid.automaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_PHOTO = "extra_photo";

    TextView tvName, tvDetail;
    ImageView imgPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        
        this.setTitle("Detail");

        tvName = findViewById(R.id.tv_item_name);
        tvDetail = findViewById(R.id.tv_item_detail);
        imgPhoto = findViewById(R.id.img_item_photo);

        tvName.setText(getIntent().getStringExtra(EXTRA_NAME));
        tvDetail.setText(getIntent().getStringExtra(EXTRA_DETAIL));

        Glide.with(this)
                .load(getIntent().getStringExtra(EXTRA_PHOTO))
                .apply(new RequestOptions().override(500,500))
                .into(imgPhoto);
    }
}
