package com.leo.basemvplib.presenter;

import android.os.Bundle;

import com.leo.basemvplib.view.IView;

import java.lang.ref.WeakReference;

public abstract class IPresenter<V extends IView> {

    private WeakReference<V> mUi;

    public IPresenter() {
    }

    public abstract void onCommandCallback(String cmd, String extra);

    /**
     * @param ui The Ui implementation that is now ready to be used.
     */
    public void onUiReady(V ui) {
        mUi = new WeakReference<>(ui);
    }


    public final void onUiDestroy(V ui) {
        onUiUnready(ui);
        if (mUi != null) {
            mUi.clear();
        }
    }

    public void onUiUnready(V ui) {
    }

    public void onSaveInstanceState(Bundle outState) {
    }

    public void onRestoreInstanceState(Bundle savedInstanceState) {
    }

    public V getUi() {
        return mUi.get();
    }
}
