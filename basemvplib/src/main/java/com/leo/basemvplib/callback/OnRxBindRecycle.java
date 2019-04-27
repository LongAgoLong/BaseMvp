package com.leo.basemvplib.callback;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;

import com.trello.rxlifecycle2.LifecycleTransformer;

/**
 * Create by LEO
 * on 2018/3/19
 * at 11:52
 */
public interface OnRxBindRecycle {
    @NonNull
    @CheckResult
    <T> LifecycleTransformer<T> bindUntilEvent();
}
