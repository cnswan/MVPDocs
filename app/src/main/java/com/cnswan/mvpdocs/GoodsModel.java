package com.cnswan.mvpdocs;

import android.os.Handler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by 00013259 on 2017/9/26.
 */

public class GoodsModel implements IGoodsModel {

    List<GoodsBean> mData;

    public GoodsModel() {
        mData = new ArrayList<>();
    }

    @Override
    public void requestGoodsList(final EveryCallback<List<GoodsBean>> callback) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                ArrayList<GoodsBean> list = new ArrayList<GoodsBean>();
                list.add(new GoodsBean(1, "牙膏", "2017-09-09"));
                list.add(new GoodsBean(2, "毛巾", "2017-09-09"));
                list.add(new GoodsBean(3, "衣服", "2017-09-09"));
                list.add(new GoodsBean(4, "水果", "2017-09-09"));
                list.add(new GoodsBean(5, "蔬菜", "2017-09-09"));
                Random rd = new Random();
                int N = rd.nextInt(10);
                if (N > 5) {
                    callback.onSuccess(list);
                } else {
                    callback.onFail(-1, "拒绝请求");
                }
            }
        }, 2000L);
    }

    @Override
    public List<GoodsBean> getAdapterGoodList() {
        return mData;
    }
}
