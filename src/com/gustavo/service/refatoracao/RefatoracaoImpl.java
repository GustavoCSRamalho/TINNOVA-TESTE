package com.gustavo.service.refatoracao;

public class RefatoracaoImpl implements RefatoracaoInterf{
    @Override
    public int refatorarNumero(int numero) {
        if(numero == 1) return numero;
        else if (numero > 1) {
            return numero * refatorarNumero(numero-1);
        }
        return 1;
    }
}
