package com.example.weserv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.weserv.boundary.TelaCategoria;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pedir(View view){
        Button buttonPedir;

        buttonPedir = findViewById(R.id.buttonPedir);

        Intent intent = new Intent(MainActivity.this, TelaCategoria.class);
        startActivity(intent);

    }

}