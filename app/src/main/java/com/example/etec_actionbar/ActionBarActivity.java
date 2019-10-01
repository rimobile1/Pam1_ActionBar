package com.example.etec_actionbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ActionBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_wifi:
                Toast.makeText(this, "Wi-Fi acionado!", Toast.LENGTH_LONG).show();
                return  true;

            case R.id.action_bluetooth:
                Toast.makeText(this, "Bluetooth acionado!", Toast.LENGTH_LONG).show();
                return  true;

            case R.id.action_sobre:
                Toast.makeText(this, "Sobre acionado!", Toast.LENGTH_LONG).show();
                return  true;

            case R.id.action_sair:
               finish();
                return  true;

                default:
                    return super.onOptionsItemSelected(item);


        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater() .inflate(R.menu.actions,menu);

        return super.onCreateOptionsMenu(menu);
    }
}
