package com.example.bmichecker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText wht, htf, hti;
        TextView result;
        Button calculate;

        wht = findViewById(R.id.Wht);
        htf = findViewById(R.id.htf);
        hti = findViewById(R.id.hti);
        result = findViewById(R.id.result);
        calculate = findViewById(R.id.Calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt=Integer.parseInt(wht.getText().toString());
                int hf=Integer.parseInt(htf.getText().toString());
                int hi=Integer.parseInt(hti.getText().toString());

                int total= hf*12 + hi;

                double totalCm = total*2.53;

                double totalM = totalCm/100;

                double bmi = (wt/(totalM*totalM));

                if(bmi>25){
                    result.setText("You are Overweight!");
                    result.setBackgroundColor(getResources().getColor(R.color.Overweight));
                }else if(bmi<18){
                    result.setText("You are Underweight!");
                    result.setBackgroundColor(getResources().getColor(R.color.UnderWeight));
                }else {
                    result.setText("You are Healthy");
                    result.setBackgroundColor(getResources().getColor(R.color.Healthy));
                }
            }
        });



    }


}