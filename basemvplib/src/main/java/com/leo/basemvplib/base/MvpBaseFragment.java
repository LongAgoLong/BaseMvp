package com.leo.basemvplib.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leo.basemvplib.presenter.IPresenter;
import com.leo.basemvplib.view.IView;
import com.trello.rxlifecycle2.components.support.RxFragment;

public abstract class MvpBaseFragment<P extends IPresenter<V>, V extends IView> extends RxFragment {
    private P presenter;

    public MvpBaseFragment() {
        this.presenter = createPresenter();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        presenter.onUiReady(getUi());
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        presenter.onUiDestroy(getUi());
    }

    protected abstract P createPresenter();

    protected abstract V getUi();

    public P getPresenter() {
        return presenter;
    }
}
