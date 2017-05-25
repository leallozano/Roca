package com.example.carlos.roca;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu mi_menu) {
        getMenuInflater().inflate(R.menu.menu_en_activity,mi_menu);
        return true;
    }

    @Override
    public boolean onOptionItemSelected (MenuItem option_item){
        int id=option_item.getItemId();

        if(id==R.id.configuracion) {
            return true;
        }
        if(id==R.id.info) {
            ejecutar_info(null);
            return true;
        }

        return super.onOptionsItemSelected(option_item);
    }



}
