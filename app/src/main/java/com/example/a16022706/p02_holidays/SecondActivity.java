package com.example.a16022706.p02_holidays;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity{

    ListView lv;
    TextView tvSecular;
    ArrayAdapter aa;
    ArrayList<Holidays> code;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        tvSecular = (TextView) findViewById(R.id.tvSecular);
        lv = (ListView)findViewById(R.id.lvModule);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvSecular.setText(year);
        code = new ArrayList<Holidays>();
        aa = new HolidaysAdapter(this,R.layout.row, code);

        lv.setAdapter(aa);
        if (year.equals("Secular")){
            code.add(new Holidays("New Year's Day", "1 Jan 2017"));
            code.add(new Holidays("Labour Day","1 May 2017"));


        }
        else{

        }

    }
}
