package com.example.karan.implementingonclickdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Find View By Id
        btn = findViewById(R.id.btn);
        //Register button
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "Hello User !", Toast.LENGTH_SHORT).show();
    }
}
