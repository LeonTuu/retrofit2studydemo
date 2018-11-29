package com.mieasy.retrofit2studydemo;

import android.os.Bundle;
import android.support.annotation.LayoutRes;

import com.mieasy.retrofit2studydemo.utils.ToastUtils;
import com.trello.rxlifecycle2.components.support.RxAppCompatActivity;

import butterknife.ButterKnife;

public abstract class BaseActivity extends RxAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        init(savedInstanceState);
        ButterKnife.bind(this);
    }
    protected void showToast(String msg) {
        ToastUtils.show(msg);
    }
    protected abstract @LayoutRes int getLayoutId();
    protected abstract void init(Bundle savedInstanceState);


}
