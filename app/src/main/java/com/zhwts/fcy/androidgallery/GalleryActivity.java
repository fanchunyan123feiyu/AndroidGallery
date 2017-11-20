package com.zhwts.fcy.androidgallery;

import android.widget.BaseAdapter;

import com.zhwts.fcy.androidgallery.adapter.WGalleryAdapter;

/**
 * Created by fcy on 2017/11/20.
 * 库演示
 */

public class GalleryActivity extends BaseWGalleryActivity {
    @Override
    protected BaseAdapter initGalleryAdapter() {
        return new WGalleryAdapter();
    }
}
