package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.view.Gravity.LEFT;

public class firstActivity extends AppCompatActivity {

    private Button okayButton;
    private EditText number1;
    private EditText number2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        number1 =(EditText) findViewById(R.id.number1);
        number2 =(EditText) findViewById(R.id.number2);
        okayButton = (Button) findViewById(R.id.okButton);
        okayButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast toast = Toast.makeText(firstActivity.this,"You pressed OK button",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP|Gravity.LEFT, 0, 0);
                toast.show();

                startActivity(new Intent(firstActivity.this, secondActivity.class));
            }
        });


    }

}