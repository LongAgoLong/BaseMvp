package com.example.basemvp.Presenter;

import android.support.annotation.NonNull;

import com.example.basemvp.IPresenter.MainIPresenter;
import com.leo.basemvplib.callback.OnRxBindRecycle;

/**
 * 具体实现
 * 如果需要自己设置可以按这种方式写
 * 不然直接复用onCommandExecute方法就可以了
 * 直接继承IPresenter重写就可以了，不需要再多一层抽象
 */
public class MainPresenter extends MainIPresenter {
    public MainPresenter(@NonNull OnRxBindRecycle onRxBindRecycle) {
        super(onRxBindRecycle);
    }

    @Override
    public void getTimeStr() {
        getUi().update(String.valueOf(System.currentTimeMillis()));
    }

    @Override
    public void onCommandExecute(String cmd, String extra) {

    }
}
