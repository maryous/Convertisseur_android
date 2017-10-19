package com.example.joudar.convertisseurkm;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double v1 = 0.621371;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText =(EditText)findViewById(R.id.editText);
        final TextView result =(TextView)findViewById(R.id.resultat);
        Button valid =(Button)findViewById(R.id.button);
        valid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //on recupere ce qu'on ecrit sur l'edit txt
              String text= String.valueOf(editText.getText());
                int nombreEnKM =Integer.parseInt(text);

                double nombreEnMille = (int) (nombreEnKM * v1);
                result.setText("le resultat que vous recherchez est " + nombreEnMille);

            }
        });


    }
}
