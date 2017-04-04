package com.umcs.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Nokia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nokia);
    }

    public void onClickButtonGoBack(View view){
        finish();
    }
}
