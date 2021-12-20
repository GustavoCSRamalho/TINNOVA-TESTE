package com.gustavo.service.multiplo;

public class SerMultiploImpl implements  SerMultiploInterf{
    @Override
    public int obterSomaDosMultiplo(int numeroEscolhido){
        int soma = 0;
        for (int numero = 0; numero < numeroEscolhido;numero ++){
            soma += serMultiplo(numero) ? numero : 0;
        }
        return soma;
    }

    private Boolean serMultiplo(int numero){
        return (numero % 3 == 0 || numero % 5 == 0) ? true : false;
    }
}
