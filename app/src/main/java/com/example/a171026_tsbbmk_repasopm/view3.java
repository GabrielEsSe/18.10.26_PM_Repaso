package com.example.a171026_tsbbmk_repasopm;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class view3 extends AppCompatActivity {
    String list1[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    String list2[] = {"Album 1", "Album 2", "Album 3", "Album 4", "Album 5", "Album 6", "Album 7", "Album 8", "Album 9", "Album 10"};
    int list3[] = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9, R.drawable.img10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view3);

        ListView listView = findViewById(R.id.base);

        // Usamos nuestro adaptador personalizado pasándole los arreglos y el layout contenedor
        MyListAdapter adapter = new MyListAdapter(this, list1, list2, list3);
        listView.setAdapter(adapter);

        // Evento de clic en el ListView
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Toast.makeText(view3.this, "Seleccionaste: " + list2[position], Toast.LENGTH_SHORT).show();
        });
    }
}