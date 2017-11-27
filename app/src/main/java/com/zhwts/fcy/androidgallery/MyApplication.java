package com.zhwts.fcy.androidgallery;

import org.litepal.LitePal;
import org.litepal.LitePalApplication;
import org.xutils.x;

/**
 * Created by fcy on 2017/11/20.
 */

public class MyApplication extends LitePalApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        LitePal.initialize(this);

    }
}
