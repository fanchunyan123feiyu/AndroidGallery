package com.zhwts.fcy.androidgallery.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.zhwts.fcy.androidgallery.R;


/**
 * Created by fcy on 2017/11/20.
 */

public class WGalleryAdapter extends BaseAdapter {

    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_sample,
                    parent, false);

        }

        ImageView iv = (ImageView) convertView.findViewById(R.id.iv);
        iv.setImageResource(
                parent.getContext().getResources().getIdentifier("pic" + position, "drawable",
                        parent.getContext().getPackageName()));
        return convertView;
    }
}

