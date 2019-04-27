package com.example.basemvp;

import android.support.annotation.NonNull;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.basemvp.Presenter.MainPresenter;
import com.leo.basemvplib.base.MvpBaseActivity;
import com.leo.basemvplib.callback.OnRxBindRecycle;
import com.leo.basemvplib.view.IView;
import com.trello.rxlifecycle2.LifecycleTransformer;
import com.trello.rxlifecycle2.android.ActivityEvent;

/**
 * Demo
 */
public class MainActivity extends MvpBaseActivity<MainPresenter, MainActivity>
        implements IView, OnRxBindRecycle, View.OnClickListener {

    private Button button;
    private TextView resultTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(this);
        resultTv = findViewById(R.id.resultTv);
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected MainActivity getUi() {
        return this;
    }

    public void update(String s) {
        if (null == resultTv) {
            return;
        }
        resultTv.append(s);
        resultTv.append("\n");
    }

    @NonNull
    @Override
    public <T> LifecycleTransformer<T> bindUntilEvent() {
        return this.bindUntilEvent(ActivityEvent.DESTROY);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                getPresenter().getTimeStr();
                break;
        }
    }
}
