package com.zhwts.fcy.androidgallery;

import android.app.Application;

import org.xutils.x;

/**
 * Created by fcy on 2017/11/20.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}
