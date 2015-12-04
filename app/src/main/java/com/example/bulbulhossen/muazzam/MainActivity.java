package com.example.bulbulhossen.muazzam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button perosnal;
    Intent per;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        perosnal = (Button) findViewById(R.id.personal);
        //OnCick Listener
        perosnal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent Use . MainActivity click than go to Personal Activity
              per = new Intent(MainActivity.this, Personal.class);
                startActivity(per);
            }
        });


    }
}
