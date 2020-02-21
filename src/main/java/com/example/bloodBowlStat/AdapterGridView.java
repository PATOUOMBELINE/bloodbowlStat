package com.example.bloodBowlStat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterGridView extends BaseAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private int [] icons;
    private String [] numbers;

    public AdapterGridView(Context context, int [] icons, String[] numbers) {
        this.context= context;
        this.icons= icons;
        this.numbers= numbers;
    }


    @Override
    public int getCount() {
        return numbers.length;
    }

    @Override
    public Object getItem(int position) {
        return numbers[position];
    }

    @Override
    public long getItemId(int position) {
        return position;   }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View gridVDChiffre = convertView;

        if (convertView==null){

            gridVDChiffre= layoutInflater.inflate(R.layout.layout_de, null);

        }
        ImageView icon = (ImageView)gridVDChiffre.findViewById(R.id.imageView);
        TextView number =(TextView)gridVDChiffre.findViewById(R.id.tVCount);
        icon.setImageResource(icons[position]);
        number.setText(numbers[position]);

        return gridVDChiffre;




    }
}
