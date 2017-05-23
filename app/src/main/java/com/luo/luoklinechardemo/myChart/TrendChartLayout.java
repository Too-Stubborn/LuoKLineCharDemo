package com.luo.luoklinechardemo.myChart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.luo.luoklinechardemo.R;
import com.luo.luoklinechardemo.bean.TrendBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TrendChartLayout extends RelativeLayout {
    public TrendChartLayout(Context context) {
        this(context, null);
    }

    public TrendChartLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TrendChartLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

//        initLayout();
    }

    public void initLayout( List<TrendBean> trendList) {

        TrendChartView trendCharView = new TrendChartView(getContext());
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams
                (
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT
                );
        addView(trendCharView, layoutParams);


        trendCharView.setTrendData(trendList);


        TrendChartTextView textView = new TrendChartTextView(getContext());
        textView.setBackgroundResource(R.drawable.shape_trend_chart_view);
        textView.setPadding(5, 5, 5, 5);
        addView(textView);

        trendCharView.setPriceShowView(textView);
    }
}
