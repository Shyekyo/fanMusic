package com.example.fanmusic.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.annotation.RequiresApi;

import com.example.fanmusic.R;

/**
 * 1 input_icon 输入框图标
 * 2 input_hint 输入框提示内容
 * 3 is_password 是否密码展示
 */
public class InputView extends FrameLayout
{
    private int input_icon;
    private String input_hint;
    private boolean is_password;

    private View mView;
    private ImageView mIvIcon;
    private EditText mEtInput;

    public InputView(Context context) {
        super(context);
        init(context,null);
    }

    public InputView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public InputView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public InputView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs);
    }

    /**
     * 初始化
     */
    private void init(Context context,AttributeSet attrs){
        if(attrs == null) return;
        //获取自定义属性
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.inputView);
        input_icon = typedArray.getResourceId(R.styleable.inputView_input_icon,R.mipmap.logo);
        input_hint = typedArray.getString(R.styleable.inputView_input_hint);
        is_password = typedArray.getBoolean(R.styleable.inputView_is_password,false);
        typedArray.recycle();

        //绑定layout布局
        mView = LayoutInflater.from(context).inflate(R.layout.input_view,this,false);
        mIvIcon = mView.findViewById(R.id.iv_icon);
        mEtInput= mView.findViewById(R.id.et_input);
        //布局关联属性
        mIvIcon.setImageResource(input_icon);
        mEtInput.setHint(input_hint);
        mEtInput.setInputType(
                is_password?
                        InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD:
                        InputType.TYPE_CLASS_PHONE);
        addView(mView);
    }

    /**
     * 返回输入的内容
     * @return
     */
    public String getInputStr(){
        return mEtInput.getText().toString().trim();
    }
}
