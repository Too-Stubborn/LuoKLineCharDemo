package com.luo.luoklinechardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.luo.luoklinechardemo.bean.TrendBean;
import com.luo.luoklinechardemo.myChart.TrendChartLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import butterknife.Bind;
import butterknife.ButterKnife;



public class LineActivity extends AppCompatActivity {
    @Bind(R.id.toLine)
    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line);
        ButterKnife.bind(this);


        Random random = new Random();
        int max = 750;
        int min = 720;

        List<TrendBean> trendList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            TrendBean trendBean = new TrendBean();
            trendBean.date = "2017-03-1" + i;
            trendBean.price = Double.parseDouble(String.valueOf(random.nextInt(max) % (max - min + 1) + min));
            trendList.add(trendBean);
        }

        TrendChartLayout trendCharView = new TrendChartLayout(this);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams
                (
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                );
        linearLayout.addView(trendCharView,layoutParams);
        trendCharView.initLayout(trendList);



    }
}
