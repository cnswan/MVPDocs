package com.cnswan.mvpdocs;

import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class GoodsActivity extends BaseActivity<GoodsPresenter> implements IGoodsView {

    ListView     mListView;
    GoodsAdapter mAdapter;

    @Override
    public GoodsPresenter initPresenter() {
        return new GoodsPresenter(this);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_goods;
    }

    @Override
    public void initView() {
        mListView = (ListView) findViewById(R.id.list_goods);
        mAdapter = new GoodsAdapter(mPresenter.getAdapterGoodsList());
        mListView.setAdapter(mAdapter);
        mPresenter.initViewData();
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onLoadSuccess(List<GoodsBean> list) {
        mAdapter.setNewData(list);
    }

    @Override
    public void onLoadFail(int code) {
        mAdapter.setNewData(null);
    }

}
