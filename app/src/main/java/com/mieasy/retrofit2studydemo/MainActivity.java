package com.mieasy.retrofit2studydemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Looper;
import android.support.v4.content.FileProvider;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.mieasy.retrofit2studydemo.download.DownloadListener;
import com.mieasy.retrofit2studydemo.download.DownloadUtils;
import com.mieasy.retrofit2studydemo.module.DaggerPlatform;
import com.mieasy.retrofit2studydemo.module.Niting;
import com.mieasy.retrofit2studydemo.module.ReportListBean;
import com.mieasy.retrofit2studydemo.net.RetrofitHelper;
import com.mieasy.retrofit2studydemo.net.common.Constants;
import com.mieasy.retrofit2studydemo.net.common.DefaultObserver;
import com.mieasy.retrofit2studydemo.utils.LogUtils;
import com.mieasy.retrofit2studydemo.utils.RxUtil;
import com.mieasy.retrofit2studydemo.utils.ToastUtils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;
import okhttp3.ResponseBody;


public class MainActivity extends BaseActivity {
    @BindView(R.id.bbb)
    Button bbb;
    @BindView(R.id.aaa)
    Button aaa;
    @BindView(R.id.img)
    ImageView img;
    @BindView(R.id.load)
    Button load;
    @BindView(R.id.load11)
    Button load11;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    @BindView(R.id.tv_percent)
    TextView mTvPercent;
    private DownloadUtils downloadUtils;
    final   Niting  niting = DaggerPlatform.builder().build().waimai();
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void init(Bundle savedInstanceState) {
        downloadUtils = new DownloadUtils();
    }

    @OnClick({R.id.bbb, R.id.aaa, R.id.load,R.id.load11})
    public void clickLogin(View view) {
        switch (view.getId()) {
            case R.id.bbb:
                break;
            case R.id.aaa:
                getMeiZi();
                break;
            case R.id.load:
                download();
                break;
            case R.id.load11:
                ToastUtils.show(""+niting.eat());
                break;
            default:
                break;
        }
    }


    private void getData() {
//        RetrofitHelper.getApiService().getDriverNum("李志成")
//                .compose(RxUtil.<List<ReportListBean>>rxSchedulerHelper(this))
//                .subscribe(new DefaultObserver<List<ReportListBean>>() {
//                               @Override
//                               public void onSuccess(List<ReportListBean> response) {
//                                   if (response != null && response.size() > 0) {
//                                       ToastUtils.show("可以点击么？？？？" + response.get(0).getViModel());
//                                   } else {
//                                       ToastUtils.show("你不知道没有值么？？？？");
//                                   }
//                               }
//
//                           }
//                );
//        DefaultObserver<List<ReportListBean>> defaultObserver = DaggerPlatform.builder().build().waimai()
        RetrofitHelper.getApiService().getDriverNum("李志成")
                .compose(RxUtil.<List<ReportListBean>>rxSchedulerHelper(this))
                .subscribe(new DefaultObserver<List<ReportListBean>>() {
                               @Override
                               public void onSuccess(List<ReportListBean> response) {
                                   if (response != null && response.size() > 0) {
                                       ToastUtils.show("可以点击么？？？？" + response.get(0).getViModel());
                                   } else {
                                       ToastUtils.show("你不知道没有值么？？？？");
                                   }
                               }

                           }
                );
    }


    private void getMeiZi() {
//        RetrofitHelper.getApiService()
//                .getMezi()
//                .compose(RxUtil.<BasicResponse<List<MeiZi>>>rxSchedulerHelper(this))
//                .subscribe(new DefaultObserver<BasicResponse<List<MeiZi>>>() {
//                    @Override
//                    public void onSuccess(BasicResponse<List<MeiZi>> response) {
//                        ToastUtils.show("可以点击么？？？？" + response.getResults().size());
//                        Picasso
//                                .with(MainActivity.this)
//                                .load(response.getResults().get(0).getUrl())
//                                .into(img);
//                    }
//                });
        startActivity(new Intent(this, Main2Activity.class));
    }


    /**
     * 下载文件
     */
    public void download() {
        load.setClickable(false);
        downloadUtils.download(Constants.DOWNLOAD_URL, new DownloadListener() {
            @Override
            public void onProgress(int progress) {
                LogUtils.e("--------下载进度：" + progress);
                Log.e("onProgress", "是否在主线程中运行:" + String.valueOf(Looper.getMainLooper() == Looper.myLooper()));
                progressBar.setProgress(progress);
                mTvPercent.setText(String.valueOf(progress) + "%");
            }

            @Override
            public void onSuccess(ResponseBody responseBody) {  //  运行在子线程
                saveFile(responseBody);
                Log.e("onSuccess", "是否在主线程中运行:" + String.valueOf(Looper.getMainLooper() == Looper.myLooper()));
            }

            @Override
            public void onFail(String message) {
                load.setClickable(true);
                ToastUtils.show("文件下载失败,失败原因：" + message);
//                Log.e("onFail", "是否在主线程中运行:" + String.valueOf(Looper.getMainLooper() == Looper.myLooper()));
                Log.e("message_onFail", "文件下载失败:" + message);
            }

            @Override
            public void onComplete() {  //  运行在主线程中
                load.setClickable(true);
                ToastUtils.show("文件下载成功");
            }
        });
    }


    private void saveFile(ResponseBody body) {
        String fileName = "oitsme.apk";
        String fileStoreDir = Environment.getExternalStorageDirectory().getAbsolutePath();
        Log.e("fileStoreDir", "目录" +Environment.getExternalStorageDirectory().getAbsolutePath());
        try {
            InputStream is = body.byteStream();
            File file = new File(fileStoreDir + "/" + fileName);
            FileOutputStream fos = new FileOutputStream(file);
            BufferedInputStream bis = new BufferedInputStream(is);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
                fos.flush();
            }
            fos.close();
            bis.close();
            is.close();
            installApk(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void installApk(File file) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.N) {
            Uri contentUri = FileProvider.getUriForFile(this,"com.mieasy.retrofit2studydemo.fileProvider",file);
            intent.setDataAndType(contentUri,"application/vnd.android.package-archive");
        }else {
            intent.setDataAndType(Uri.fromFile(file),
                    "application/vnd.android.package-archive");
        }
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }


    /**
     * 取消下载
     *
     * @param view
     */
    public void cancelDownload(View view) {
        if (downloadUtils != null) {
            downloadUtils.cancelDownload();
        }
    }
}
