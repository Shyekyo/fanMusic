package com.example.fanmusic.activitys;

import android.os.Bundle;

import android.util.Log;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.fanmusic.R;
import com.example.fanmusic.adapters.MusicGridAdapter;
import com.example.fanmusic.adapters.MusicListAdapter;


public class MainActivity extends BaseActivity {

    private RecyclerView mRvGrid, mRvList;
    private MusicGridAdapter mGridAdapter;
    private MusicListAdapter mListAdapter;
    //项目
    //模块
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView () {
        initNavBar(false, "fanMusic", true);
        mRvGrid = fd(R.id.rv_grid);
        mRvGrid.setLayoutManager(new GridLayoutManager(this, 3));
        //mRvGrid.addItemDecoration(new GridSpaceItemDecoration(getResources().getDimensionPixelSize(R.dimen.albumMarginSize), mRvGrid));
       // mRvGrid.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL));
        mRvGrid.setNestedScrollingEnabled(false);
        mGridAdapter = new MusicGridAdapter(this);
        mRvGrid.setAdapter(mGridAdapter);

        mRvList = fd(R.id.rv_list);
        mRvList.setLayoutManager(new LinearLayoutManager(this));
        mRvList.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        mRvList.setNestedScrollingEnabled(false);
        mListAdapter = new MusicListAdapter(this, mRvList);//, mMusicSourceModel.getHot());
        mRvList.setAdapter(mListAdapter);
    }
}
