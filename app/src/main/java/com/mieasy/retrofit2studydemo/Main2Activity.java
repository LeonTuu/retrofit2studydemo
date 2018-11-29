package com.mieasy.retrofit2studydemo;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;


import com.mieasy.retrofit2studydemo.module.MeiZi;
import com.mieasy.retrofit2studydemo.module.NormalAdapter;
import com.mieasy.retrofit2studydemo.net.RetrofitHelper;
import com.mieasy.retrofit2studydemo.net.common.DefaultObserver;
import com.mieasy.retrofit2studydemo.utils.RxUtil;
import com.mieasy.retrofit2studydemo.utils.ToastUtils;

import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

public class Main2Activity extends BaseActivity {

    @BindView(R.id.recycle)
    RecyclerView recycle;

    @BindView(R.id.ppp)
    Button ppp;
    NormalAdapter normalAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main2;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        initView();

    }



    private void initView() {
        getData();
    }


    @OnClick({R.id.ppp})
    public void clickLogin(View view) {
        switch (view.getId()) {
            case R.id.ppp:
                break;
            default:
                break;
        }
    }

    void getData() {
        RetrofitHelper.getApiService()
                .getMezi()
                .compose(RxUtil.<List<MeiZi>>rxSchedulerHelper(this))
                .subscribe(new DefaultObserver<List<MeiZi>>() {
                    @Override
                    public void onSuccess(List<MeiZi> response) {
                        normalAdapter = new NormalAdapter(response, getBaseContext());
                        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getBaseContext());
                        recycle.setLayoutManager(linearLayoutManager);
                        linearLayoutManager.setOrientation(OrientationHelper.VERTICAL);
                        recycle.setAdapter(normalAdapter);
                    }
                });

    }
}
