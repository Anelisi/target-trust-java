package comunicador;

import java.time.LocalDateTime;

public class MainComunicador {
    public static void main(String[] args) {

        Usuario usuario1 = new Usuario(1L,"Anelisi");
        Usuario usuario2 = new Usuario(2L,"Arthur");
        Usuario usuario3 = new Usuario(3L,"Marie");
        Usuario usuario4 = new Usuario(4L,"Pina");
        Usuario usuario5 = new Usuario(5L,"Licodêncio");

        Mensagem msg = new Mensagem("Te amo!", LocalDateTime.now(),usuario2,usuario1);
        Mensagem mensagem = new Mensagem("Quero Pizza!", LocalDateTime.now(), usuario1,usuario2);
        Mensagem mensagem1 = new Mensagem("Vou te fatiar!", LocalDateTime.now(), usuario4,usuario5);
        Mensagem mensagem2 = new Mensagem("Vamo se ama!", LocalDateTime.now(), usuario3,usuario1);

        System.out.println("De: " + msg.getIdUsuarioOrigem().getNome());
        System.out.println(msg.getTexto());
        System.out.println("Para: " + msg.getIdUsuarioDestino().getNome());
    }
}
