package com.cnswan.mvpdocs;

/**
 * Created by 00013259 on 2017/9/26.
 */

public interface EveryCallback<T> {

    void onSuccess(T t);

    void onFail(int code, String msg);

}
