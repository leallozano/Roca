package com.example.carlos.roca;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void salirApp (View view) {
        finish();
    }

    public void ejecutar_info(View view) {
        Intent i = new Intent(this,InfoClase.class);
        startActivity(i);
    }
}
