package com.codeclan.example.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddingActivity extends AppCompatActivity {

//    instance variables
    Calculator calculator;
    EditText number1;
    EditText number2;
    Button addButton;
    TextView addedNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding);

//        new-up and find by id
        number1 = (EditText) findViewById(R.id.enter_number_1);
        number2 = (EditText) findViewById(R.id.enter_number_2);
        addButton = (Button) findViewById((R.id.addButton));
        addedNumbers = (TextView) findViewById(R.id.addNumbers);
    }

//    methods
    public void onAddButtonClicked(View button) {
        int number = 1;
        int answer = calculator.addNumbers();

    }
}
