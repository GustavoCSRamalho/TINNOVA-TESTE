package com.gustavo.application.exercicio4;

import com.gustavo.service.multiplo.SerMultiploImpl;
import com.gustavo.service.multiplo.SerMultiploInterf;

public class Main {

    public static SerMultiploInterf serMultiplo;

    public static void main(String[] args) {
        serMultiplo = new SerMultiploImpl();

        int valorSomaDosMultiplos = serMultiplo.obterSomaDosMultiplo(10);
        System.out.println("Soma dos numeros multiplos = "+valorSomaDosMultiplos);
    }

}
