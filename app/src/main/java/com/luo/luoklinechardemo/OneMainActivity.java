package com.luo.luoklinechardemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class OneMainActivity extends AppCompatActivity {
    @Bind(R.id.btn)
    Button btn;
    @Bind(R.id.btn_k)
    Button btnK;
    @Bind(R.id.btn_fix)
    Button btnFix;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_one);
        ButterKnife.bind(this);
     /*   Intent intent = new Intent(MainActivity.this, KLineActivity.class);
        startActivity(intent);*/
    }


    @OnClick({R.id.btn, R.id.btn_k,R.id.btn_fix})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn:
                Intent intent = new Intent(OneMainActivity.this, MinutesActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_k:
                Intent intentK = new Intent(OneMainActivity.this, MainActivity.class);
                startActivity(intentK);
                break;
        }
    }
}
