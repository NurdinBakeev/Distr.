package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View v){
        EditText obj1 = (EditText)findViewById(R.id.number1);
        EditText obj2 = (EditText)findViewById(R.id.number2);
        TextView textRes = (TextView)findViewById(R.id.Resultat);

        int num1 = Integer.parseInt(obj1.getText().toString());
        int num2 = Integer.parseInt(obj2.getText().toString());
        int resultatSum = num1 + num2;
        textRes.setText(Integer.toString(resultatSum));
    }

    public void buttonClick2(View v){
        EditText obj1 = (EditText)findViewById(R.id.number1);
        EditText obj2 = (EditText)findViewById(R.id.number2);
        TextView textRes = (TextView)findViewById(R.id.Resultat);

        int num1 = Integer.parseInt(obj1.getText().toString());
        int num2 = Integer.parseInt(obj2.getText().toString());
        int resultatMin = num1 - num2;
        textRes.setText(Integer.toString(resultatMin));
    }

    public void buttonClick3(View v){
        EditText obj1 = (EditText)findViewById(R.id.number1);
        EditText obj2 = (EditText)findViewById(R.id.number2);
        TextView textRes = (TextView)findViewById(R.id.Resultat);

        int num1 = Integer.parseInt(obj1.getText().toString());
        int num2 = Integer.parseInt(obj2.getText().toString());
        int resultatDiv = num1 / num2;
        textRes.setText(Integer.toString(resultatDiv));
    }

    public void buttonClick4(View v){
        EditText obj1 = (EditText)findViewById(R.id.number1);
        EditText obj2 = (EditText)findViewById(R.id.number2);
        TextView textRes = (TextView)findViewById(R.id.Resultat);

        int num1 = Integer.parseInt(obj1.getText().toString());
        int num2 = Integer.parseInt(obj2.getText().toString());
        int resultatMul = num1 * num2;
        textRes.setText(Integer.toString(resultatMul));
    }
}
