package com.example.fanmusic.activitys;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.IdRes;

import com.example.fanmusic.R;

public class BaseActivity extends Activity {
    private ImageView mIvBack;
    private TextView mTvTitle;
    private ImageView mTvMe;
    protected <T extends View>T fd(@IdRes int id){
        return findViewById(id);
    }

    protected void initNavBar(boolean isShowBack, String titile, boolean isShowPandas){
        mIvBack = fd(R.id.iv_back);
        mTvTitle = fd(R.id.iv_title);
        mTvMe = fd(R.id.iv_pandas);
        mIvBack.setVisibility(isShowBack?View.VISIBLE:View.GONE);
        mTvTitle.setText(titile);
        mTvMe.setVisibility(isShowPandas?View.VISIBLE:View.GONE);
        mIvBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        mTvMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(BaseActivity.this, MeActivity.class));
            }
        });
    }
}
