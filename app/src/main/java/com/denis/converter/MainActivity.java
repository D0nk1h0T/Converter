package com.denis.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1;
    Button btnUsdtoUan;
    Button btnEurtoUsd;
    Button btnEurtoUan;
    Button btnUantoEur;
    Button btnUantoUsd;
    Button btnUsdtoEur;
    TextView tvRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText) findViewById(R.id.edit1);
        btnUsdtoUan = (Button) findViewById(R.id.btnUsdtoUan);
        btnEurtoUsd = (Button) findViewById(R.id.btnEurtoUsd);
        btnEurtoUan = (Button) findViewById(R.id.btnEurtoUan);
        btnUantoEur = (Button) findViewById(R.id.btnUantoEur);
        btnUantoUsd = (Button) findViewById(R.id.btnUantoUsd);
        btnUsdtoEur = (Button) findViewById(R.id.btnUsdtoEur);
        tvRes = (TextView) findViewById(R.id.tvRes);


        btnUsdtoUan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    String s1 = edit1.getText().toString();
                    double res = Double.parseDouble(s1)*28.3;
                    String s3 = String.format(s1+" USD to UAN = %.3f",res);
                    tvRes.setText(s3);
                }
                catch(Exception e)
                {
                    Toast.makeText(getBaseContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
            }
        });

        btnEurtoUsd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    String s1 = edit1.getText().toString();
                    double res =Double.parseDouble(s1)*1.19;
                    String s3 = String.format(s1+" EUR to USD = %.3f",res);
                    tvRes.setText(s3);
                }
                catch(Exception e)
                {
                    Toast.makeText(getBaseContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
            }
        });
        btnEurtoUan.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    String s1 = edit1.getText().toString();
                    double res =Double.parseDouble(s1)*33.54;
                    String s3 = String.format(s1+" EUR to UAN = %.3f",res);
                    tvRes.setText(s3);
                }
                catch(Exception e)
                {
                    Toast.makeText(getBaseContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
            }
        });

        btnUantoEur.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    String s1 = edit1.getText().toString();
                    double res =Double.parseDouble(s1)*0.03;
                    String s3 = String.format(s1+" UAN to EUR = %.3f",res);
                    tvRes.setText(s3);
                }
                catch(Exception e)
                {
                    Toast.makeText(getBaseContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
            }
        });

        btnUantoUsd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    String s1 = edit1.getText().toString();
                    double res =Double.parseDouble(s1)*0.035;
                    String s3 = String.format(s1+" UAN to USD = %.3f",res);
                    tvRes.setText(s3);
                }
                catch(Exception e)
                {
                    Toast.makeText(getBaseContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
            }
        });

        btnUsdtoEur.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    String s1 = edit1.getText().toString();
                    double res =Double.parseDouble(s1)*0.84;
                    String s3 = String.format(s1+" USD to EUR = %.3f",res);
                    tvRes.setText(s3);
                }
                catch(Exception e)
                {
                    Toast.makeText(getBaseContext(), "Введені некоректні числа", Toast.LENGTH_LONG).show();
                    tvRes.setText("");
                }
            }
        });


    }
}