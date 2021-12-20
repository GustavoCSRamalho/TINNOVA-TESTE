package com.gustavo.models;

public class Eleitor {

    private Votos votoFeito;

    public void votar(Votos meuVoto) {
        this.votoFeito = meuVoto;
    }

    public Votos getVotoFeito() {
        return votoFeito;
    }
}
