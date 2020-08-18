package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    private int value1,value2;
    private int answer;
    EditText num1,num2;
    TextView answerText;

    protected void fetchValues(){
        String val1,val2;
        val1 = getIntent().getStringExtra("NUMBER1");
        val2 = getIntent().getStringExtra("NUMBER2");
        num1.setText(val1);
        num2.setText(val2);
        try{
            value1 = Integer.parseInt(num1.getText().toString());
            value2 = Integer.parseInt(num2.getText().toString());
        } catch (NumberFormatException exp){
            System.out.println(exp);
        }
    }

    public void setTextValueAdd(View view){
        String ans = value1 + "+" + value2  + " = " + (value1+value2);
        answerText.setText(ans);
    }
    public void setTextValueSub(View view){
        String ans = value1 + "-" + value2  + " = " + (value1-value2);
        answerText.setText(ans);
    }
    public void setTextValueMult(View view){
        String ans = value1 + "x" + value2  + " = " + (value1*value2);
        answerText.setText(ans);
    }
    public void setTextValueDiv(View view){
        String ans = value1 + "/" + value2  + " = " + (value1/value2);
        answerText.setText(ans);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        num1 = (EditText) findViewById(R.id.number1);
        num2 = (EditText) findViewById(R.id.number2);
        answerText = (TextView) findViewById(R.id.answerText);
        answerText.setText("Perform Calculation");
        fetchValues();


    }
}