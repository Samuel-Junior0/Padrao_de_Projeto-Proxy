package proxy;

import interfaces.Conteudo;
import model.FilmePremium;
import model.Usuario;

public class FilmePremiumProxy implements Conteudo {
    private FilmePremium objetoReal;

    public FilmePremiumProxy() {
        this.objetoReal = new FilmePremium();
    }

    @Override
    public void assistir(Usuario usuario) {
        if (usuario.getPlano().equalsIgnoreCase("PREMIUM")) {
            System.out.printf("Acesso liberado para %s\n", usuario.getNome());
            objetoReal.assistir(usuario);
        } else if (usuario.getPlano().equalsIgnoreCase("BÁSICO")) {
            System.out.printf("Acesso negado para %s. Conteúdo disponível apenas para usuários PREMIUM.\n",
                    usuario.getNome());
        } else {
            throw new IllegalArgumentException("Usuário Inválido!");
        }
    }
}
