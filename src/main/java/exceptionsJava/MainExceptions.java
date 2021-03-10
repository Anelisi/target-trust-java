package exceptionsJava;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainExceptions {
    private static final List<String> CIDADES = Arrays.asList(
            "Porto Alegre", "Curitiba", "São Paulo", "Rio de Janeiro", "Cuiaba", "São Luis");

    public static void main(String[] args) throws PosicaoInvalidaException {
        System.out.printf("Informe a posição de uma das cidades [1 - %d]: ", CIDADES.size());
        int posicao = pedePosicaoAteInformarCorreta();
        String nomeCidade = CIDADES.get(posicao -1);
        System.out.println("Você escolheu: " + nomeCidade);

    }
    private static Integer pedePosicaoAteInformarCorreta() {
        while (true) {

            try {
                return pedePosicao();
            } catch (PosicaoInvalidaException e) {
                System.err.println(e.getMessage());
            }
        }
    }
    private static int pedePosicao() throws PosicaoInvalidaException {
        int posicao = new Scanner(System.in).nextInt();
        if (posicao <= 0 || posicao > CIDADES.size()) {
            String message = String.format("Posição inválida, informe uma posição de 1 a %d", CIDADES.size());
            throw new PosicaoInvalidaException(message);
        }
        return posicao;
    }
}
