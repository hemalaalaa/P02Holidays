package com.example.a16022706.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<String> al;
    ArrayAdapter<String> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)findViewById(R.id.lv_year);

        al = new ArrayList<String>();
        al.add("Secular");
        al.add("Ethnic & Religion");


        aa = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, al);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = al.get(position);

                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("year", selectedItem);
                startActivity(intent);

            }
        });


    }
}
