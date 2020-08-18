package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class firstActivity extends AppCompatActivity {

    private Button okayButton;
    private EditText number1;
    private EditText number2;
    private String num1,num2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        number1 =(EditText) findViewById(R.id.number1);
        number2 =(EditText) findViewById(R.id.number2);
        okayButton = (Button) findViewById(R.id.plusButton);

        okayButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                num1 = number1.getText().toString();
                num2 = number2.getText().toString();
                Intent intent = new Intent(firstActivity.this,secondActivity.class);
                intent.putExtra("NUMBER1",num1);
                intent.putExtra("NUMBER2",num2);
                Toast toast = Toast.makeText(firstActivity.this,"You pressed OK button",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                toast.show();

                startActivity(intent);
            }
        });


    }

}