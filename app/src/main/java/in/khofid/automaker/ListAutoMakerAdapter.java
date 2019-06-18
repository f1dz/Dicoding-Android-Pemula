package in.khofid.automaker;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListAutoMakerAdapter extends RecyclerView.Adapter<ListAutoMakerAdapter.CategoryViewHolder> {

    private Context context;
    private ArrayList<AutoMaker> listAutomaker;

    public ListAutoMakerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int i) {
        AutoMaker maker = getListAutomaker().get(i);
        categoryViewHolder.tvName.setText(maker.getName());
        categoryViewHolder.tvDetail.setText(maker.getDetail());
        Glide.with(context)
                .load(maker.getPhoto())
                .apply(new RequestOptions().override(150,150))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListAutomaker().size();
    }

    public ArrayList<AutoMaker> getListAutomaker() {
        return listAutomaker;
    }

    public void setListAutomaker(ArrayList<AutoMaker> listAutomaker) {
        this.listAutomaker = listAutomaker;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        TextView tvDetail;
        ImageView imgPhoto;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
