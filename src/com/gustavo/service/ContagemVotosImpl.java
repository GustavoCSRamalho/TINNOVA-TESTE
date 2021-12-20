package com.gustavo.service;

import com.gustavo.models.Eleitor;
import com.gustavo.models.Votos;

import java.util.List;

public class ContagemVotosImpl implements  ContagemVotosInter{
    @Override
    public Double contarVotosValidos(List<Eleitor> listaDeVotos) {
        double votosValidos = listaDeVotos.stream().filter( eleitor -> eleitor.getVotoFeito() == Votos.VALIDO).count();
        return votosValidos;
    }

    @Override
    public Double contarVotosNulos(List<Eleitor> listaDeVotos) {
        double votosNulos = listaDeVotos.stream().filter( eleitor -> eleitor.getVotoFeito() == Votos.NULO).count();
        return votosNulos;
    }

    @Override
    public Double contarVotosBrancos(List<Eleitor> listaDeVotos) {
        double votosBrancos = listaDeVotos.stream().filter( eleitor -> eleitor.getVotoFeito() == Votos.BRANCO).count();
        return votosBrancos;
    }
}
