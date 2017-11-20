package com.zhwts.fcy.androidgallery.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.zhwts.fcy.androidgallery.R;
import com.zhwts.fcy.androidgallery.bean.DiscoverResult;

import org.xutils.x;

import java.util.List;


/**
 * Created by fcy on 2017/11/20.
 */

public class DiscoverAdapter extends BaseAdapter

    {
    List<DiscoverResult.DataEntity.GuiderEntity> guiderEntity;
    public DiscoverAdapter(List<DiscoverResult.DataEntity.GuiderEntity> guiderEntity) {
        this.guiderEntity=guiderEntity;
    }

    @Override
    public int getCount() {
        return guiderEntity.size();
    }

    @Override
    public Object getItem(int position) {
        return guiderEntity.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_gallery,
                    parent, false);
        }

        ImageView iv = (ImageView) convertView.findViewById(R.id.iv);
        x.image().bind(iv,guiderEntity.get(position).getBackgroundimg());
        // iv.setImageResource(parent.getContext().getResources().getIdentifier("pic" + position, "drawable", parent.getContext().getPackageName()));
        return convertView;
    }
}

