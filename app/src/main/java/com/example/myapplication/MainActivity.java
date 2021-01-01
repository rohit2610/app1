package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.nio.charset.StandardCharsets;

public class MainActivity extends AppCompatActivity {

    EditText editText = null ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);
    }

    public void onClick(View v){
        String editString = editText.getText().toString();
        Intent i = new Intent("com..example.rohit");
        editString += "BTP" ;

        i.putExtra("rohit" , editString);
        startActivity(i);
        Log.d("Data" , "Sent");

    }
}