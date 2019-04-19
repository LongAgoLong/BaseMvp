package com.leo.basemvplib.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.leo.basemvplib.presenter.IPresenter;
import com.leo.basemvplib.view.IView;

public abstract class MvpBaseActivity<P extends IPresenter<V>, V extends IView> extends AppCompatActivity {
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
