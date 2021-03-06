package com.example.a16022706.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidaysAdapter extends ArrayAdapter {
    private ArrayList<Holidays> code;
    private Context context;
    private TextView tvEvent;
    private TextView tvDate;
    private ImageView ivStar;

    public HolidaysAdapter(Context context, int resource, ArrayList<Holidays> objects) {
        super(context,resource,objects);
        code = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowVIew = inflater.inflate(R.layout.row, parent, false);
        tvEvent = (TextView) rowVIew.findViewById(R.id.textView);
        tvDate = (TextView) rowVIew.findViewById(R.id.textView3);
        ivStar = (ImageView) rowVIew.findViewById(R.id.imageView);
        Holidays currentCode = code.get(position);

        tvEvent.setText(currentCode.getName());
        tvDate.setText(currentCode.getDate());
//
//        if (currentCode.isStar()) {
//            ivStar.setImageResource(R.drawable.newyear);
//        } else {
        if(currentCode.getDate().equals("1 Jan 2018")){

            ivStar.setImageResource(R.drawable.newyear);


        }
        else if(currentCode.getDate().equals("1 May 2018")){

            ivStar.setImageResource(R.drawable.labourday);

        }
        else if(currentCode.getDate().equals("16-17 Feb 2018")){

            ivStar.setImageResource(R.drawable.cny);

        }

        else if(currentCode.getDate().equals("30 March 2018")){

            ivStar.setImageResource(R.drawable.goodfriday);

        }
        else if(currentCode.getDate().equals("22 Aug 2018")){

            ivStar.setImageResource(R.drawable.harirayahaji);

        }
        else {

            ivStar.setImageResource(R.drawable.deepavali);

        }
//        }
        return rowVIew;
    }
}
