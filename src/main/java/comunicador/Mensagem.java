package comunicador;

import java.time.LocalDateTime;

public class Mensagem {

    private String texto;
    private LocalDateTime dataEnvio;
    private Usuario idUsuarioOrigem;
    private Usuario idUsuarioDestino;

    public Mensagem(String texto, LocalDateTime dataEnvio, Usuario idUsuarioOrigem, Usuario idUsuarioDestino) {
        this.texto = texto;
        this.dataEnvio = dataEnvio;
        this.idUsuarioOrigem = idUsuarioOrigem;
        this.idUsuarioDestino = idUsuarioDestino;
    }

    public String getTexto() {
        return texto;
    }

    public Usuario getIdUsuarioOrigem() {
        return idUsuarioOrigem;
    }

    public Usuario getIdUsuarioDestino() {
        return idUsuarioDestino;
    }
}

