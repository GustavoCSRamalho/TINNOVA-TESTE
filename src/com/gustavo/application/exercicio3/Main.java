package com.gustavo.application.exercicio3;

import com.gustavo.service.RefatoracaoImpl;
import com.gustavo.service.RefatoracaoInterf;

public class Main {

    private static RefatoracaoInterf refatoracao;

    public static void main(String[] args) {
        refatoracao = new RefatoracaoImpl();

        int valorRefatorado = refatoracao.refatorarNumero(5);
        System.out.println("Valor refatorado = "+valorRefatorado);
    }

}
