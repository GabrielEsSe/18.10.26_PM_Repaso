package com.example.a171026_tsbbmk_repasopm;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class view1 extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.dtmf || item.getItemId() == R.id.DTMF){
            DTMF dtmf;
            dtmf = new DTMF();
            remplazar(dtmf);
        } else if (item.getItemId() == R.id.unvst || item.getItemId() == R.id.UNVST) {
            UNVST unvst;
            unvst = new UNVST();
            remplazar(unvst);

        } else {
            NSLQVAPM nslqvapm;
            nslqvapm = new NSLQVAPM();
            remplazar(nslqvapm);
        }
        return super.onOptionsItemSelected(item);
    }

    private void remplazar(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.base, fragment);
        fragmentTransaction.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view1);
    }


}