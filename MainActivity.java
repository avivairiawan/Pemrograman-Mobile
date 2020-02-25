package com.example.activitis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_view);
    }

    public void move1(View view) {
        Intent a = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(a);
    }
    public void move2(View view) {
        Intent a = new Intent(MainActivity.this, Main3Activity.class);
        startActivity(a);
    }
    public void move3(View view) {
        Intent a = new Intent(MainActivity.this, Main4Activity.class);
        startActivity(a);
    }
    public void move4(View view) {
        Intent a = new Intent(MainActivity.this, Main5Activity.class);
        startActivity(a);
    }
    public void move5(View view) {
        Intent a = new Intent(MainActivity.this, Main6Activity.class);
        startActivity(a);
    }
    public void move6(View view) {
        Intent a = new Intent(MainActivity.this, Main7Activity.class);
        startActivity(a);
    }
}
