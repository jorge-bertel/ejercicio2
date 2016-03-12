package com.example.jorgeandres.ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class programa2 extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private RadioGroup boton1;
    private RadioButton opcion;
    private TextView resu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programa2);
        numero1=(EditText)findViewById(R.id.primerNumero);
        numero2=(EditText)findViewById(R.id.segundoNumero);
        boton1=(RadioGroup)findViewById(R.id.ope);
        final Button boton=(Button)findViewById(R.id.rbu);
        resu=(TextView)findViewById(R.id.resul);
        boton.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                double pc;
                double num1 = Double.parseDouble(numero1.getText().toString());
                double num2 = Double.parseDouble(numero2.getText().toString());

                if (boton1.getCheckedRadioButtonId() == R.id.rSum) {

                    resu.setText(String.valueOf(num1 + num2));

                }
                else
                if(boton1.getCheckedRadioButtonId() == R.id.rRes) {
                    resu.setText(String.valueOf(num1 - num2));
                }
                else
                if(boton1.getCheckedRadioButtonId() == R.id.rMul){
                    resu.setText(String.valueOf(num1 * num2));
                }
                else
                if(boton1.getCheckedRadioButtonId() == R.id.rDiv){
                    resu.setText(String.valueOf(num1 / num2));
                }
            }

        });
    }
}