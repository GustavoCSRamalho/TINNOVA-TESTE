package com.gustavo.service.contagemdosvotos;

import com.gustavo.models.Eleitor;
import com.gustavo.models.Votos;

import java.util.List;

public interface ContagemVotosInter {

    public Double contarVotosValidos(List<Eleitor> listaDeVotos);
    public Double contarVotosNulos(List<Eleitor> listaDeVotos);
    public Double contarVotosBrancos(List<Eleitor> listaDeVotos);

}
