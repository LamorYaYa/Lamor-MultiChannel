package com.example.master.lamor_multichannel;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.master.lamor_multichannel.abcde.HttpReseult;
import com.example.master.lamor_multichannel.abcde.IHttpManager;
import com.example.master.lamor_multichannel.abcde.IRetrofit;
import com.example.master.lamor_multichannel.abcde.RetrofitService;
import com.example.master.lamor_multichannel.bean.AppBean;
import com.example.master.lamor_multichannel.bean.InitBean;
import com.example.master.lamor_multichannel.bean.MovieSubject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView iRecyclerView;
    private TextView dataTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
//        initRecyclerView();
        try {
            ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(getPackageName(), PackageManager.GET_META_DATA);
            String channel = applicationInfo.metaData.getString("CHANNEL");
            Toast.makeText(this, channel, Toast.LENGTH_SHORT).show();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }

    private void initRecyclerView() {
        iRecyclerView = findViewById(R.id.recycler_view);
        iRecyclerView.setVisibility(View.VISIBLE);
        iRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        IRecyclerAdapter iRecyclerAdapter = new IRecyclerAdapter(this);
        iRecyclerView.setAdapter(iRecyclerAdapter);
    }

    private void initViews() {
        dataTextView = findViewById(R.id.data_1);
        findViewById(R.id.go).setOnClickListener(this);
        findViewById(R.id.init).setOnClickListener(this);
        findViewById(R.id.appdata).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.init:
                init();
                break;
            case R.id.appdata:
                appdata();
                break;
            case R.id.go:
                go();
                break;
            default:
                break;
        }
    }

    private void init() {

        Map<String, String> map = new HashMap<>();
        map.put("name", "chengpan");
        IHttpManager.doRequest(IRetrofit.createApi(RetrofitService.class).init(map), new IHttpManager.IResponseListener<InitBean>() {

            @Override
            public void onSuccess(InitBean data) {
                dataTextView.setText(data.toString());
            }

            @Override
            public void onFail(Throwable e) {
                dataTextView.setText(e.toString());
            }
        });

    }

    private void appdata() {

        Map<String, String> map = new HashMap<>();

        map.put("pageNum", "1");
        map.put("pageSize", "100");
        map.put("searchValue", "");


        IHttpManager.doRequest(IRetrofit.createApi(RetrofitService.class).getAppList(map), new IHttpManager.IResponseListener<AppBean>() {
            @Override
            public void onSuccess(AppBean data) {
                dataTextView.setText(data.toString());
            }

            @Override
            public void onFail(Throwable e) {
                dataTextView.setText(e.toString());
            }
        });


    }

    private void go() {
//        IHttpManager.doRequest(IRetrofit.createApi(RetrofitService.class).getTest(0, 5), new IHttpManager.IResponseListener<MovieSubject>() {
//            @Override
//            public void onSuccess(MovieSubject data) {
//                Log.e("CHENGPAN", data.toString());
//
//            }
//
//            @Override
//            public void onFail(Throwable e) {
//                Log.e("CHENGPAN", e.toString());
//            }
//        });
    }
}
