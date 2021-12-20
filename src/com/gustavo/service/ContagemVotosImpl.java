package com.gustavo.service;

import com.gustavo.models.Eleitor;
import com.gustavo.models.Votos;

import java.util.List;

public class ContagemVotosImpl implements  ContagemVotosInter{
    @Override
    public Double contarVotosValidos(List<Eleitor> listaDeVotos) {
        double votosValidos = listaDeVotos.stream().filter( eleitor -> eleitor.getVotoFeito() == Votos.VALIDO).count();
        double totalDeVotos = listaDeVotos.size();
        return votosValidos/totalDeVotos;
    }

    @Override
    public Double contarVotosNulos(List<Eleitor> listaDeVotos) {
        double votosNulos = listaDeVotos.stream().filter( eleitor -> eleitor.getVotoFeito() == Votos.NULO).count();
        double totalDeVotos = listaDeVotos.size();
        return votosNulos/totalDeVotos;
    }

    @Override
    public Double contarVotosBrancos(List<Eleitor> listaDeVotos) {
        double votosBrancos = listaDeVotos.stream().filter( eleitor -> eleitor.getVotoFeito() == Votos.BRANCO).count();
        double totalDeVotos = listaDeVotos.size();
        return votosBrancos/totalDeVotos;
    }
}
