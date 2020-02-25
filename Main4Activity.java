package com.example.activitis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_three);
    }
    public void move(View view) {
        Intent a = new Intent(Main4Activity.this, MainActivity.class);
        startActivity(a);
    }
}
