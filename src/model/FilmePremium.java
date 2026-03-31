package model;

import interfaces.Conteudo;

public class FilmePremium implements Conteudo {
    @Override
    public void assistir(Usuario usuario) {
        System.out.printf("Reproduzindo filme premium para %s\n", usuario.getNome());
    }
}
