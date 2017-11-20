package com.zhwts.fcy.androidgallery;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.BaseAdapter;
import android.widget.RadioGroup;
import android.widget.SeekBar;

import com.zhwts.fcy.gallery.WGallery;


/**
 * @author wuzhen
 * @version Version 1.0, 2016-05-10
 */
public class BaseWGalleryActivity extends BaseActivity
        implements RadioGroup.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    WGallery gallery;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wgallery);

        gallery = (WGallery) findViewById(R.id.wgallery);
        gallery.setAdapter(initGalleryAdapter());

        RadioGroup rg = (RadioGroup) findViewById(R.id.rg);
        rg.check(R.id.rbtn3);
        rg.setOnCheckedChangeListener(this);

        ((SeekBar) findViewById(R.id.seekbar1)).setOnSeekBarChangeListener(this);
        ((SeekBar) findViewById(R.id.seekbar2)).setOnSeekBarChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case R.id.rbtn1:
                gallery.setScalePivot(WGallery.SCALE_PIVOT_CENTER);
                break;

            case R.id.rbtn2:
                gallery.setScalePivot(WGallery.SCALE_PIVOT_TOP);
                break;

            case R.id.rbtn3:
                gallery.setScalePivot(WGallery.SCALE_PIVOT_BOTTOM);
                break;

            default:
                break;
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        switch (seekBar.getId()) {
            case R.id.seekbar1:
                gallery.setSelectedScale(0.8f + 0.1f * progress);
                break;

            case R.id.seekbar2:
                gallery.setUnSelectedAlpha(progress * 1.f / 10);
                break;

            default:
                break;
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    protected BaseAdapter initGalleryAdapter() {
        throw new RuntimeException("必须重写该方法");
    }
}
