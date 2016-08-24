package com.levirchianca.jogodamemoria;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Aluno on 24/08/2016.
 */
public class Tabuleiro {


        public static final int TAMANHO_TABULEIRO_L = 5;
        public static final int TAMANHO_TABULEIRO_A = 5;


        int[][] tabuleiro = new int[TAMANHO_TABULEIRO_L][TAMANHO_TABULEIRO_A];
        ArrayList<Integer> listaSorteio = new ArrayList<Integer>(TAMANHO_TABULEIRO_L*TAMANHO_TABULEIRO_A);

        public void inicializaListaSorteio(){
            for (int k = 0; k< TAMANHO_TABULEIRO_L * TAMANHO_TABULEIRO_A; k++) {
                listaSorteio.add((Integer)(k/TAMANHO_TABULEIRO_L)*10 + k%TAMANHO_TABULEIRO_L) ;
                Log.i("TESTE_", "ListaSorteio["+k+"] = "+listaSorteio.get(k));
            /*
            for (int i = 0; i < TAMANHO_TABULEIRO; i++) {
                for (int j = 0; j < TAMANHO_TABULEIRO; j++) {
                    listaSorteio[k] = i*10+k;
                }
            }
            */
            }
        }

        public void realizaSorteio(){
            Random r = new Random();
            int posicao = 0;

            for (int i = 0; i < TAMANHO_TABULEIRO_L * TAMANHO_TABULEIRO_A; i++){
                posicao = r.nextInt(listaSorteio.size());
                listaSorteio.get(posicao);
                Log.i("SORTEIO_", i +"º valor sorteado:"+listaSorteio.get(posicao));
                listaSorteio.remove(posicao);
            }


        }


    }



