package com.example.eden_quadratic_equation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private TextView tv2;
    double fir,sec;
    String txt;
    private ImageView non;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        non=findViewById(R.id.imageView);
        tv2=findViewById(R.id.textView2);
        double fir = getIntent().getDoubleExtra("first", 0);
        double sec = getIntent().getDoubleExtra("secend", 0);
        String txt = getIntent().getStringExtra("ere");
        if(txt.equals("error"))
        {
            tv2.setText(txt);
            non.setImageResource(R.drawable.parabula_no);
            non.setVisibility(View.VISIBLE);
        }
        else {
            String xResult1 = String.valueOf(fir);
            String xResult2 = String.valueOf(sec);
            tv2.setText(xResult1 + " , " + xResult2);
            non.setImageResource(R.drawable.parabula_two);
            non.setVisibility(View.VISIBLE);
        }
     }

    public void go2(View view)
    {
        Intent gi = new Intent(this,MainActivity.class);
        startActivity(gi);
    }
}