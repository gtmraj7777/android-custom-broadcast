package com.example.broadcastreceiver3333;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


  button = findViewById(R.id.button2);





   button.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {

           broadCastIntent(view);
       }
   });


    }


    public void broadCastIntent(View view){
//        Intent intent = new Intent();
//        intent.setAction("com.gtmraj.CUSTOM_INTENT");
//        sendBroadcast(intent);

//
//        Intent intent=new Intent("com.gtmraj.CUSTOM_INTENT");
//        sendBroadcast(intent);


       sendBroadcast(new Intent(this,MyReceiver.class).setAction("com.gtmraj.CUSTOM_INTENT"));


    }
}