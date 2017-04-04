package com.umcs.listview;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private ListView lv;

    private String[] phon;
    //private String[] activity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.langagues);

        initResources();

        initPhonesListView();

    }

    private void initResources(){
        Resources res = getResources();
        phon = res.getStringArray(R.array.phones);
    }

    private void initPhonesListView(){
        lv.setAdapter(new ArrayAdapter<String>(getBaseContext(),
                android.R.layout.simple_list_item_1,phon));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int pos, long id) {
                Context context;
                Intent intent;
                switch( pos ) {
                    case 0:
                        context = getApplicationContext();
                        intent = new Intent(context, Nokia.class);
                        startActivity(intent);
                        break;

                    case 1:
                        context = getApplicationContext();
                        intent = new Intent(context, iPhone.class);
                        startActivity(intent);
                        break;
                    case 2:
                        context = getApplicationContext();
                        intent = new Intent(context, SonyErickson.class);
                        startActivity(intent);
                        break;
                }
            }
        });
    }
}
