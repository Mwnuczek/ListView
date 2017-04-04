package com.umcs.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class iPhone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_phone);
    }

    public void onClickButtonGoBack(View view){
        finish();
    }
}
