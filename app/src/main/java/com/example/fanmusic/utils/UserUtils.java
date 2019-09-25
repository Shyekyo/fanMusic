package com.example.fanmusic.utils;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

import com.blankj.utilcode.util.EncryptUtils;
import com.blankj.utilcode.util.RegexUtils;
import com.blankj.utilcode.util.SPUtils;

public class UserUtils {
    /**
     * 验证登录用户
     */
    public static boolean validateLogin(Context context, String phone, String password) {
//        简单的
//        RegexUtils.isMobileSimple(phone);
//        精确地
        if (!RegexUtils.isMobileExact(phone)) {
            Toast.makeText(context, "无效手机号", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(password)) {
            Toast.makeText(context, "请输入密码", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
    /**
     * 退出登录
     */
    public static void logout (Context context) {
//        删除sp保存的用户标记
       /* boolean isRemove = SPUtils.removeUser(context);

        if (!isRemove) {
            Toast.makeText(context, "系统错误，请稍后重试", Toast.LENGTH_SHORT).show();
            return;
        }

//        删除数据源
        RealmHelper realmHelper = new RealmHelper();
        realmHelper.removeMusicSource();
        realmHelper.close();

        Intent intent = new Intent(context, LoginActivity.class);
//        添加intent标志符，清理task栈，并且新生成一个task栈
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
//        定义Activity跳转动画
        ((Activity)context).overridePendingTransition(R.anim.open_enter, R.anim.open_exit);
    */
    }
    /**
     * 修改密码
     * 1、数据验证
     *      1、原密码是否输入
     *      2、新密码是否输入并且新密码与确定密码是否相同
     *      3、原密码输入是否正确
     *          1、Realm 获取到当前登录的用户模型
     *          2、根据用户模型中保存的密码匹配用户原密码
     * 2、利用 Realm 模型自动更新的特性完成密码的修改
     */
    public static boolean changePassword (Context context, String oldPassword, String password, String passwordConfirm) {

       /* if (TextUtils.isEmpty(oldPassword)) {
            Toast.makeText(context, "请输入原密码", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (TextUtils.isEmpty(password) || !password.equals(passwordConfirm)) {
            Toast.makeText(context, "请确认密码", Toast.LENGTH_SHORT).show();
            return false;
        }

//        验证原密码是否正确
        RealmHelper realmHelper = new RealmHelper();
        UserModel userModel = realmHelper.getUser();
        if (!EncryptUtils.encryptMD5ToString(oldPassword).equals(userModel.getPassword())) {
            Toast.makeText(context, "原密码不正确", Toast.LENGTH_SHORT).show();
            return false;
        }

        realmHelper.changePassword(EncryptUtils.encryptMD5ToString(password));

        realmHelper.close();*/

        return true;
    }

}

