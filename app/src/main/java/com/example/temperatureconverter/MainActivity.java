package com.example.temperatureconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.temperatureconverter.Mo.converter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                TextView t = findViewById(R.id.editText5);
                double t1 = Double.parseDouble( t.getText().toString());

                converter b= new converter(t1);

                TextView t2 = findViewById(R.id.textView2);
                t2.setText(String.format("%.2f",b.cf()));


            }
        });
        Button b2 = findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView t = findViewById(R.id.editText5);
                double t1 = Double.parseDouble( t.getText().toString());

                converter b= new converter(t1);

                TextView t2 = findViewById(R.id.textView2);
                t2.setText(String.format("%.2f",b.fc()));
            }
        });
    }
}
