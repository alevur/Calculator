package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonDiv = findViewById(R.id.buttonDiv);
        Button buttonMul = findViewById(R.id.buttonMul);
        Button buttonMin = findViewById(R.id.buttonMin);
        Button buttonDot = findViewById(R.id.buttonDot);
        Button buttonPer = findViewById(R.id.buttonPer);
        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonDel = findViewById(R.id.buttonDel);
        Button buttonEqual = findViewById(R.id.buttonEqual);
        TextView display = findViewById(R.id.display);
    }
}
