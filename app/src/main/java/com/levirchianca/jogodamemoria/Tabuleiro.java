package com.levirchianca.jogodamemoria;

import android.util.Log;

import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
/**
 * Created by Aluno on 24/08/2016.
 */
public class Tabuleiro {
    public static final int TAMANHO_TABULEIRO_L = 5;
    public static final int TAMANHO_TABULEIRO_A = 5;

    ArrayList<Integer> Imagem = new ArrayList<Integer>(25);
    ArrayList<Integer> Imagem1 = new ArrayList<Integer>(12);
    ArrayList<Integer> Imagemaux = new ArrayList<Integer>(12);


    int[][] tabuleiro = new int[TAMANHO_TABULEIRO_L][TAMANHO_TABULEIRO_A];
    ArrayList<Integer> listaSorteio = new ArrayList<Integer>(TAMANHO_TABULEIRO_L*TAMANHO_TABULEIRO_A);
    ArrayList<Integer> listaImagem = new ArrayList<Integer>(TAMANHO_TABULEIRO_L*TAMANHO_TABULEIRO_A);
    //int [] listaImagem = new int[25];



    public void inicializaListaSorteio(){
        for (int k = 0; k< TAMANHO_TABULEIRO_L * TAMANHO_TABULEIRO_A; k++) {
            listaSorteio.add((Integer)(k/TAMANHO_TABULEIRO_L)*10 + k%TAMANHO_TABULEIRO_L) ;
            //   Log.i("TESTE_", "ListaSorteio["+k+"] = "+listaSorteio.get(k));

            //  System.out.println("TESTE_"+ "ListaSorteio["+k+"] = "+listaSorteio.get(k));
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
        inicializaListaSorteio();
        //System.out.println(listaSorteio.size());

        for (int i = 0; i < TAMANHO_TABULEIRO_L * TAMANHO_TABULEIRO_A; i++){
            posicao = r.nextInt(listaSorteio.size());
            listaSorteio.get(posicao);
            // Log.i("SORTEIO_", i +"º valor sorteado:"+listaSorteio.get(posicao));
            // System.out.println("SORTEIO_"+ i +"º valor sorteado:"+listaSorteio.get(posicao));
            listaSorteio.remove(posicao);
        }


    }


    public void grid(){
        int pos=0;

        inicializaListaSorteio();
        realizaSorteio();
        //adci();
        grid1();

        // testar sorteio



        for (int i = 0; i <25; i++) {
            pos =listaSorteio.get(i);
            tabuleiro[pos/10][pos%10]=Imagem.get(i);
            System.out.println("Tabuleiro, posicao"+ i+ "nº "+ pos/10 + pos%10+" --"+ tabuleiro[pos/10][pos%10]);

        }

    }


    public void Im(){
        for (int i = 0; i < 12; i++) {
            Imagem1.add(i);
            Imagemaux.add(i);
            // System.out.println("1º array " + Imagem1.get(i) + " 2º array "+ Imagemaux.get(i));

        }


    }


    public void grid1(){
        //inicializaListaSorteio();

        int posicao = 0;
        Im();
        int coringa=13;
        Imagem.addAll(Imagem1);
        Imagem.addAll(Imagem1);
        Imagem.add(coringa);
        Collections.shuffle(Imagem);


    }


}



