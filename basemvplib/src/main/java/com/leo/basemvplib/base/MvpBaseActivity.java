package com.leo.basemvplib.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.leo.basemvplib.presenter.IPresenter;
import com.leo.basemvplib.view.IView;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

public abstract class MvpBaseActivity<P extends IPresenter<V>, V extends IView> extends RxAppCompatActivity {
    private P presenter;

    protected MvpBaseActivity() {
        presenter = createPresenter();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.onUiReady(getUi());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onUiDestroy(getUi());
    }

    protected abstract P createPresenter();

    protected abstract V getUi();

    public P getPresenter() {
        return presenter;
    }
}
