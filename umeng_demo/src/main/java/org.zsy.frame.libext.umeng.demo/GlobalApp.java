package org.zsy.frame.libext.umeng.demo;

import android.app.Application;

import com.umeng.socialize.PlatformConfig;


public class GlobalApp extends Application {

    //各个平台的配置，建议放在全局Application或者程序入口
    {
        PlatformConfig.setWeixin("wx2a8b068eba991e59", "c24fbbd6b1b5e43892261c87c6b1a51e");
        //新浪微博
        PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad");
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");//跟AndroidManifest中配置对应上
        PlatformConfig.setTwitter("3aIN7fuF685MuZ7jtXkQxalyi", "MK6FEYG63eWcpDFgRYw4w9puJhzDl0tyuqWjZ3M7XJuuG7mMbO");
        //豆瓣RENREN平台目前只能在服务器端配置
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }


}
