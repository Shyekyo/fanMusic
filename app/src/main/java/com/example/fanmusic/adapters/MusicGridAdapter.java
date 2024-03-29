package com.example.fanmusic.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.fanmusic.R;

/**
 * Created by zhangxiaofan on 2019/9/24.
 */
public class MusicGridAdapter extends RecyclerView.Adapter<MusicGridAdapter.ViewHolder> {

    private Context mContext;
    //private List<AlbumModel> mDataSource;

    /*public MusicGridAdapter (Context context, List<AlbumModel> dataSource) {
        mContext = context;
        this.mDataSource = dataSource;
    }*/
    public MusicGridAdapter (Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_grid_music, viewGroup, false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
       /* final AlbumModel albumModel = mDataSource.get(i);

        Glide.with(mContext)
                .load(albumModel.getPoster())
                .into(viewHolder.ivIcon);

        viewHolder.mTvPlayNum.setText(albumModel.getPlayNum());
        viewHolder.mTvName.setText(albumModel.getName());

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, AlbumListActivity.class);
                intent.putExtra(AlbumListActivity.ALBUM_ID, albumModel.getAlbumId());
                mContext.startActivity(intent);
            }
        });
*/
    }

    @Override
    public int getItemCount() {
        return 6;//mDataSource.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivIcon;
        View itemView;
        TextView mTvPlayNum, mTvName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            this.itemView = itemView;
            ivIcon = itemView.findViewById(R.id.iv_icon);
            mTvPlayNum = itemView.findViewById(R.id.tv_play_num);
            mTvName = itemView.findViewById(R.id.tv_name);
        }
    }
}
