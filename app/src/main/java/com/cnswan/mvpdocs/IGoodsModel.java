package com.cnswan.mvpdocs;

import java.util.List;

/**
 * Created by 00013259 on 2017/9/26.
 */

public interface IGoodsModel extends BaseModel {

    /*
    获取网络数据
     */
    void requestGoodsList(EveryCallback<List<GoodsBean>> callback);

    /*
    获取本地数据
     */
    List<GoodsBean> getAdapterGoodList();

}
