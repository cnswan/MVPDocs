package com.cnswan.mvpdocs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 00013259 on 2017/9/26.
 */

public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity {

    protected T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mPresenter = initPresenter();
        initView();
    }

    /*
    初始化Presenter
     */
    public abstract T initPresenter();

    /*
    提供布局id
     */
    public abstract int getLayoutId();

    /*
    初始化布局
     */
    public abstract void initView();


}
