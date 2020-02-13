package com.example.android_seminar_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText_1 = findViewById(R.id.edTxt_1);
        final EditText editText_2 = findViewById(R.id.edTxt_2);
        final EditText editText_res = findViewById(R.id.edTxt_res);
        final TextView err = findViewById(R.id.err);
        Button btn_add = findViewById(R.id.add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_num1 = editText_1.getText().toString();
                String str_num2 = editText_2.getText().toString();
                double num1 = 0.0;
                double num2 = 0.0;
                try{
                    num1 = Double.parseDouble(str_num1);
                } catch(NumberFormatException e) {
                    err.setVisibility(View.VISIBLE);
                    err.setText(e.getMessage());
                }
                try{
                    num2 = Double.parseDouble(str_num2);
                } catch(NumberFormatException e) {
                    err.setVisibility(View.VISIBLE);
                    err.setText(e.getMessage());
                }
                double result = num1 + num2;
                String str_result = String.valueOf(result);
                editText_res.setText(str_result);
            }
        });
        Button btn_sub = findViewById(R.id.sub);
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_num1 = editText_1.getText().toString();
                String str_num2 = editText_2.getText().toString();
                double num1 = 0.0;
                double num2 = 0.0;
                try{
                    num1 = Double.parseDouble(str_num1);
                } catch(NumberFormatException e) {
                    err.setVisibility(View.VISIBLE);
                    err.setText(e.getMessage());
                }
                try{
                    num2 = Double.parseDouble(str_num2);
                } catch(NumberFormatException e) {
                    err.setVisibility(View.VISIBLE);
                    err.setText(e.getMessage());
                }
                double result = num1 - num2;
                String str_result = String.valueOf(result);
                editText_res.setText(str_result);
            }
        });
        Button btn_mult = findViewById(R.id.mult);
        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_num1 = editText_1.getText().toString();
                String str_num2 = editText_2.getText().toString();
                double num1 = 0.0;
                double num2 = 0.0;
                try{
                    num1 = Double.parseDouble(str_num1);
                } catch(NumberFormatException e) {
                    err.setVisibility(View.VISIBLE);
                    err.setText(e.getMessage());
                }
                try{
                    num2 = Double.parseDouble(str_num2);
                } catch(NumberFormatException e) {
                    err.setVisibility(View.VISIBLE);
                    err.setText(e.getMessage());
                }
                double result = num1 * num2;
                String str_result = String.valueOf(result);
                editText_res.setText(str_result);
            }
        });
        Button btn_div = findViewById(R.id.div);
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str_num1 = editText_1.getText().toString();
                String str_num2 = editText_2.getText().toString();
                double num1 = 0.0;
                double num2 = 0.0;
                double result = 0.0;
                try{
                    num1 = Double.parseDouble(str_num1);
                } catch(NumberFormatException e) {
                    err.setVisibility(View.VISIBLE);
                    err.setText(e.getMessage());
                }
                try{
                    num2 = Double.parseDouble(str_num2);
                } catch(NumberFormatException e) {
                    err.setVisibility(View.VISIBLE);
                    err.setText(e.getMessage());
                }
                if(num2 != 0){
                    result = num1 / num2;
                }
                else {
                    err.setVisibility(View.VISIBLE);
                    err.setText("Divided by zero");
                }
                String str_result = String.valueOf(result);
                editText_res.setText(str_result);
            }
        });
        Button btn_clear = findViewById(R.id.clear);
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText_1.setText("");
                editText_2.setText("");
                editText_res.setText("");
                err.setText("");
            }
        });
    }
}
