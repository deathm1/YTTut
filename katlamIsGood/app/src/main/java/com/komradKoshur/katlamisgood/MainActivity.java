package com.komradKoshur.katlamisgood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText no1;
    EditText no2;
    TextView res;
    Button katlam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        katlam = (Button) findViewById(R.id.calculate);
        no1 = (EditText) findViewById(R.id.ui1);
        no2 = (EditText) findViewById(R.id.ui2);

        res = (TextView) findViewById(R.id.result);


        katlam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultf  = Double.parseDouble(String.valueOf(no1.getText())) + Double.parseDouble(String.valueOf(no2.getText()));
                res.setText(String.valueOf(resultf));
            }
        });
    }
}
