package com.zhwts.fcy.androidgallery;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.zhwts.fcy.androidgallery.adapter.DiscoverAdapter;
import com.zhwts.fcy.androidgallery.bean.DiscoverResult;
import com.zhwts.fcy.gallery.WGallery;


/**
 * Created by fcy on 2017/11/20.
 */

public class DiscoverActivity extends AppCompatActivity{
    private  WGallery wgallery;
    private String data="{\n" +
            "    \"code\": 1,\n" +
            "    \"message\": \"成功\",\n" +
            "    \"data\": {\n" +
            "    \n" +
            "        \"guider\": [\n" +
            "            {\n" +
            "                \"id\": \"011C290C-2213-77C0-BC4C-971AAA249970\",\n" +
            "                \n" +
            "                \"backgroundimg\": \"http://gs.sxzhwts.com/uploads/58d21ea8c10db.jpeg\",\n" +
            "                \"signature\": \"真诚对待每一位朋友\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"030742E1-95C1-B85F-0E2D-979D69E92ED9\",\n" +
            "               \n" +
            "                \"backgroundimg\": \"http://gs.sxzhwts.com/uploads/58e5e76d0bac3.jpeg\",\n" +
            "                \"signature\": \"邢永锋\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"id\": \"27454D87-9273-C1A1-8CE5-C6935DF796E7\",\n" +
            "               \n" +
            "                \"backgroundimg\": \"http://gs.sxzhwts.com/uploads/58d4786b1e648.jpeg\",\n" +
            "                \"signature\": \"保护好自己，才有能力去善待别人！\"\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);
        wgallery=(WGallery)findViewById(R.id.gallery);

        final DiscoverResult discoverResult=new Gson().fromJson(data, DiscoverResult.class);
        Log.e("TAG",discoverResult.toString());
        wgallery.setAdapter(new DiscoverAdapter(discoverResult.getData().getGuider()));
/*        wgallery
wgallery.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Log.e("TAG",discoverResult.getData().getGuider().get(getC).getId());
    }
});*/
        center();
    }

    /**
     * 使放大的图片默认居中显示
     */
    private void center() {
        wgallery.setSelectedPositionInt(1);
        wgallery.setNextSelectedPositionInt(1);
        wgallery.setSelectionToCenterChild();
        wgallery.myonUp();
    }
}
