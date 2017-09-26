package com.cnswan.mvpdocs;

import java.util.List;

/**
 * Created by 00013259 on 2017/9/26.
 */

public abstract class IGoodsPresenter<T extends BaseActivity> extends BasePresenter {

    public abstract List<GoodsBean> getAdapterGoodsList();

}
