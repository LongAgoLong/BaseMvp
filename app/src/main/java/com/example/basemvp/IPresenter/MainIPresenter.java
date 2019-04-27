package com.example.basemvp.IPresenter;

import android.support.annotation.NonNull;

import com.example.basemvp.MainActivity;
import com.leo.basemvplib.callback.OnRxBindRecycle;
import com.leo.basemvplib.presenter.IPresenter;

/**
 * 定义规范
 * 如果需要自己设置可以按这种方式写
 * 不然直接复用onCommandExecute方法就可以了
 * 直接继承IPresenter重写就可以了，不需要再多一层抽象
 */
public abstract class MainIPresenter extends IPresenter<MainActivity> {
    public MainIPresenter(@NonNull OnRxBindRecycle onRxBindRecycle) {
        super(onRxBindRecycle);
    }

    public abstract void getTimeStr();
}
