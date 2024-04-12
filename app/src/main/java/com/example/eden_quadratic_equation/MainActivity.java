package com.example.eden_quadratic_equation;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.Math;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private Button btn;
    private Button btn2;
    private TextView tv1;
     double a,b,c,d,x1,x2;
     double firstX,secendX;
     String txt2;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editTextNumber);
        et2=findViewById(R.id.editTextNumber2);
        et3=findViewById(R.id.editTextNumber3);
        btn=findViewById(R.id.button);
        btn2=findViewById(R.id.button2);
        tv1=findViewById(R.id.textView1);
    }

    public void go(View view)
    {
        Intent si = new Intent(this,MainActivity2.class);
         if(!et1.getText().toString().equals("") && !et2.getText().toString().equals("") && !et3.getText().toString().equals("")) {
             a = Integer.parseInt(et1.getText().toString());
             b = Integer.parseInt(et2.getText().toString());
             c = Integer.parseInt(et3.getText().toString());
             String error="clear";
             if (a != 0)
             {
                 d = (b * b) - (4 * a * c);
                 if (d == 0) {
                     x1 = -d / (2 * a);
                 }
                 if (d < 0) {
                     error="error";

                 }
                 x1 = (double) ((-b + Math.sqrt(d)) / (2 * a));
                 x2 = (double) ((-b - Math.sqrt(d)) / (2 * a));
                 si.putExtra("ere",error);
                 si.putExtra("first", x1);
                 si.putExtra("secend", x2);
                 startActivity(si);
             }
             else
             {
                 error="error";
                 si.putExtra("ere",error);
                 si.putExtra("first", x1);
                 si.putExtra("secend", x2);
                 startActivity(si);
             }

         }
     }

    public void Gogo(View view)
    {
        Random ran1=new Random();
        int val= ran1.nextInt(10);
        int val2= ran1.nextInt(10);
        int val3= ran1.nextInt(10);
        String etNum=String.valueOf(val);
        String etNum2=String.valueOf(val2);
        String etNum3=String.valueOf(val3);
        et1.setText(etNum);
        et2.setText(etNum2);
        et3.setText(etNum3);
    }
}