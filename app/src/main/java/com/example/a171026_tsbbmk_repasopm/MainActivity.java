package com.example.a171026_tsbbmk_repasopm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button act1, act2, act3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        act1 = findViewById(R.id.act1);
        act2 = findViewById(R.id.act2);
        act3 = findViewById(R.id.act3);
        act1.setOnClickListener(this);
        act2.setOnClickListener(this);
        act3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String str = ((Button)v).getText().toString();
        if(str.equals("Fragmentos")){
            Intent vw1 = new Intent(this, view1.class);
            startActivity(vw1);
        } else if (str.equals("ListView Horizontal")) {
            Intent vw2;
            vw2 = new Intent(this, view2.class);
            startActivity(vw2);
        } else {
            Intent vw3;
            vw3 = new Intent(this, view3.class);
            startActivity(vw3);
        }
    }
}