package com.gustavo.service.algoritmo;

import java.util.List;

public class AlgoritmoBubbleImpl implements  AlgoritmoBubbleInter{
    @Override
    public List ordenarLista(List listaDeNumeros) {
        int tamanhoDaListaDeNumeros = listaDeNumeros.size() - 1;

        for (int contadorVoltaTotal = 0; contadorVoltaTotal < tamanhoDaListaDeNumeros ; contadorVoltaTotal ++){
            for (int contadorDaColuna = 0; contadorDaColuna < tamanhoDaListaDeNumeros ; contadorDaColuna ++) {
                int primeiroNumero = (int) listaDeNumeros.get(contadorDaColuna);
                int segundoNumero = (int) listaDeNumeros.get(contadorDaColuna + 1);

                int numeroMaior = 0;
                if (primeiroNumero > segundoNumero) {
                    numeroMaior = primeiroNumero;
                    listaDeNumeros.set(contadorDaColuna, segundoNumero);
                    listaDeNumeros.set(contadorDaColuna + 1, numeroMaior);
                }
            }
        }
        return listaDeNumeros;
    }
}
