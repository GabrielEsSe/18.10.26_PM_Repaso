package com.example.a171026_tsbbmk_repasopm;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class DTMF extends Fragment implements View.OnClickListener {
    View view;
    Button bt1, bt2;
    EditText txt1, txt2;
    ImageView gm;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_d_t_m, container, false);
        bt1 = view.findViewById(R.id.accion);
        bt2 = view.findViewById(R.id.home);
        txt1 = view.findViewById(R.id.dat1);
        txt2 = view.findViewById(R.id.dat2);
        gm = view.findViewById(R.id.img1);
        gm.setVisibility(view.VISIBLE);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        String str = ((Button)v).getText().toString();
        if(str.equals("Home")){
            Intent home = new Intent(getContext(), MainActivity.class);
            startActivity(home);
        } else {
            int dt1 = Integer.parseInt(txt1.getText().toString());
            int dt2 = Integer.parseInt(txt2.getText().toString());
            operaciones object;
            object = new operaciones();
            object.setData1(dt1);
            object.setData2(dt2);
            float result = object.sum();
            Toast.makeText(getContext(), String.valueOf(result), Toast.LENGTH_LONG).show();
        }
    }
}