package com.example.a171026_tsbbmk_repasopm;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class view2 extends AppCompatActivity {
    String list1 [] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String list2 [] = {"Album 1", "Album 2", "Album 3", "Album 4", "Album 5", "Album 6", "Album 7", "Album 8", "Album 9", "Album 10"};
    int list3 [] = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9, R.drawable.img10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view2);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBar  = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBar.left, systemBar.top, systemBar.right, systemBar.bottom);
            return insets;
        });

        RecyclerView recyclerView = findViewById(R.id.base);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        Adapter adp1 = new Adapter(this, list1, list2, list3);
        recyclerView.setAdapter(adp1);

        adp1.setOnItemClickListener(position -> {
            Toast.makeText(view2.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
        });
    }
}