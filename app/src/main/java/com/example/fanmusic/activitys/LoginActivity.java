package com.example.fanmusic.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.fanmusic.R;
import com.example.fanmusic.helps.UserHelper;
import com.example.fanmusic.utils.UserUtils;
import com.example.fanmusic.views.InputView;

public class LoginActivity extends BaseActivity {
    private InputView mInputPhone, mInputPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    /**
     * 初始化view
     */
    private void initView(){
        initNavBar(false,"登陆",false);
        mInputPhone = fd(R.id.input_phone);
        mInputPassword = fd(R.id.input_password);
    }
    /**
     * 跳转注册页面点击事件
     */
    public void onRegisterClick (View v) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
    /*
     * 登录
*/
    public void onCommitClick (View v) {
        String phone = mInputPhone.getInputStr();
        String password = mInputPassword.getInputStr();
        UserHelper.getInstance().setPhone(phone);
//        验证用户输入是否合法
//        if (!UserUtils.validateLogin(this, phone, password)) {
 //           return;
 //       }
//        跳转到应用主页
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
