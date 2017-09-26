package com.cnswan.mvpdocs;

import java.util.List;

/**
 * Created by 00013259 on 2017/9/26.
 */

public class GoodsPresenter extends IGoodsPresenter<GoodsActivity> {

    private IGoodsModel mGoodsModel;
    private IGoodsView  mGoodsView;

    public GoodsPresenter(IGoodsView goodsView) {
        this.mGoodsView = goodsView;
        this.mGoodsModel = new GoodsModel();
    }

    @Override
    public void initViewData() {
        mGoodsModel.requestGoodsList(new EveryCallback<List<GoodsBean>>() {
            @Override
            public void onSuccess(List<GoodsBean> goodsBeen) {
                mGoodsView.onLoadSuccess(goodsBeen);
            }

            @Override
            public void onFail(int code, String msg) {
                mGoodsView.onLoadFail(code);
                mGoodsView.showToast(msg);
            }
        });
    }

    @Override
    public List<GoodsBean> getAdapterGoodsList() {
        return mGoodsModel.getAdapterGoodList();
    }
}
