package com.cnswan.mvpdocs;

import java.util.List;

/**
 * Created by 00013259 on 2017/9/26.
 */

public interface IGoodsView extends BaseView {

    void showToast(String msg);

    void onLoadSuccess(List<GoodsBean> list);

    void onLoadFail(int code);

}
