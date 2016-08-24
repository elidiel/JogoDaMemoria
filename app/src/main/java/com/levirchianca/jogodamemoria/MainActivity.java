package com.levirchianca.jogodamemoria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    int matriz [][] = new int[5][5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Tabuleiro tab = new Tabuleiro(matriz);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=0; i<4;i++){
            for(int j =0;j<4;j++){

                Log.i(tab.matriz.toString(), "onCreate: ");

            }
        }


    }
}
