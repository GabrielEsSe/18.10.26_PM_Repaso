package com.example.a171026_tsbbmk_repasopm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends BaseAdapter {
    Context context;
    String[] list1;
    String[] list2;
    int[] list3;
    LayoutInflater inflater;

    public MyListAdapter(Context context, String[] list1, String[] list2, int[] list3) {
        this.context = context;
        this.list1 = list1;
        this.list2 = list2;
        this.list3 = list3;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list1.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Inflamos tu archivo XML "contenedor" para cada elemento
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.contenedor, parent, false);
        }

        // Vinculamos los elementos visuales con los IDs de tu XML contenedor
        ImageView img = convertView.findViewById(R.id.img1);
        TextView txt1 = convertView.findViewById(R.id.txt1);
        TextView txt2 = convertView.findViewById(R.id.txt2);

        // Asignamos los datos de tus arreglos a la posición actual
        img.setImageResource(list3[position]);
        txt1.setText(list1[position]);
        txt2.setText(list2[position]);

        return convertView;
    }
}