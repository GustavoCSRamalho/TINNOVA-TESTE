package com.gustavo.application.exercicio2;

import com.gustavo.service.algoritmo.AlgoritmoBubbleImpl;
import com.gustavo.service.algoritmo.AlgoritmoBubbleInter;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static AlgoritmoBubbleInter algoritmoBubble;

    public static void main(String[] args) {
        algoritmoBubble = new AlgoritmoBubbleImpl();

        List listaDeNumeros = Arrays.asList(3,2,1);
        List novaListaDeNumeros = algoritmoBubble.ordenarLista(listaDeNumeros);

        System.out.println("Lista final = "+novaListaDeNumeros.toString());
    }

}
