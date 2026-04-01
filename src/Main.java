import model.Usuario;
import proxy.FilmePremiumProxy;

public class Main {
    public static void main(String[] args) {
        FilmePremiumProxy proxy = new FilmePremiumProxy();

        Usuario user1 = new Usuario("Carlos", "PREMIUM");
        Usuario user2 = new Usuario("Ana", "BÁSICO");
        Usuario user3 = new Usuario("Marina", "PREMIUM");
        Usuario user4 = new Usuario("Pedro", "BÁSICO");
        Usuario user5 = new Usuario("","");

        proxy.assistir(user1);
        proxy.assistir(user2);
        proxy.assistir(user3);
        proxy.assistir(user4);

        try {
            proxy.assistir(user5);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro");
        }
    }
}