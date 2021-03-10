package collectionsJava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ChampionsMap {

    private static final int COLUNA_NOME_PAIS = 1;
    public static void main(String[] args) throws IOException {

        Map<String, Integer> vitorias = new HashMap<>();

        /* Scanner sc = new Scanner(Path.of("src/main/resources/campeoes.txt"));*/ // Não é o mais rápido

        List<String> campeoes = Files.readAllLines(Path.of("src/main/resources/campeoes.txt"));

        for (String linha : campeoes) {
            String pais = linha.split("-")[COLUNA_NOME_PAIS]
                    .trim();

            if (!vitorias.containsKey(pais)) {
                vitorias.put(pais,1);
            } else {
                int vit = vitorias.get(pais);
                vit++;
                vitorias.put(pais, vit);
            }
        }

        for (Map.Entry<String, Integer> registro : vitorias.entrySet()) {
            System.out.printf("\n %s -> %d", registro.getKey(), registro.getValue());
        }
    }
}
