package com.example.dd.mediaplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        gallery();
        audio();
    }

    private void audio() {

        Button mybtn= (Button) findViewById(R.id.audio);

        mybtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent myintent = new Intent(Main3Activity.this,MainActivity.class);

                startActivity(myintent);
            }
        } );
    }

    private void gallery() {
        Button mybtn= (Button) findViewById(R.id.gallery);

        mybtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent myintent = new Intent(Main3Activity.this,Main2Activity.class);

                startActivity(myintent);
            }
        } );
    }

}
