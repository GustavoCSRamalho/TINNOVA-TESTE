package com.gustavo.application.exercicio2;

import com.gustavo.models.Eleitor;
import com.gustavo.models.Votos;
import com.gustavo.service.AlgoritmoBubbleImpl;
import com.gustavo.service.AlgoritmoBubbleInter;
import com.gustavo.service.ContagemVotosImpl;
import com.gustavo.service.ContagemVotosInter;

import java.util.ArrayList;
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
