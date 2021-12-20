package com.gustavo.application.exercicio1;

import com.gustavo.models.Eleitor;
import com.gustavo.models.Votos;
import com.gustavo.service.ContagemVotosImpl;
import com.gustavo.service.ContagemVotosInter;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static ContagemVotosInter contagemDeVotos;

    public static void main(String[] args) {
        contagemDeVotos = new ContagemVotosImpl();

        List<Eleitor> listaDeEleitores = pegarListaDeEleitores();

        Double contagemDevotosValidos = contagemDeVotos.contarVotosValidos(listaDeEleitores);
        System.out.println("Votos validos = "+contagemDevotosValidos);

        Double contagemDevotosBrancos = contagemDeVotos.contarVotosBrancos(listaDeEleitores);
        System.out.println("Votos brancos = "+contagemDevotosBrancos);

        Double contagemDevotosNulos = contagemDeVotos.contarVotosNulos(listaDeEleitores);
        System.out.println("Votos nulos = "+contagemDevotosNulos);
    }

    private static List<Eleitor> pegarListaDeEleitores(){
        List<Eleitor> listaDeEleitores = new ArrayList<>();
        listaDeEleitores.add(new Eleitor(Votos.NULO));
        listaDeEleitores.add(new Eleitor(Votos.NULO));
        listaDeEleitores.add(new Eleitor(Votos.VALIDO));
        listaDeEleitores.add(new Eleitor(Votos.VALIDO));
        listaDeEleitores.add(new Eleitor(Votos.BRANCO));
        listaDeEleitores.add(new Eleitor(Votos.BRANCO));
        listaDeEleitores.add(new Eleitor(Votos.VALIDO));
        listaDeEleitores.add(new Eleitor(Votos.VALIDO));
        listaDeEleitores.add(new Eleitor(Votos.VALIDO));
        listaDeEleitores.add(new Eleitor(Votos.VALIDO));

        return listaDeEleitores;
    }


}
