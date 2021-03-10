package colecoes.exercicios;

import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

public class Exercicio2 {

    //Constante de verdade :)
    private static final int COLUNA_NOME_DO_PAIS = 1;

    //Crie uma lista vazia chamada campeoes.
    //Leia os campeões do arquivo disponibilizado: campeoes.csv e adicione à lista.
    public static void main(String[] args) throws IOException {

        List<String> paises = obterListaPaisesDoArquivo("src/main/resources/dados/campeoes.txt");

        Map<String, Integer> quantidadeTitulos = obtemQuantidadeDeTitulos(paises);

        //Imprima o país e a quantidade de copas. O ano pode ser ignorado.
        for (Map.Entry<String, Integer> registro : quantidadeTitulos.entrySet()) {
            System.out.printf("%s -> %d\n", registro.getKey(), registro.getValue());
        }
    }

    private static Map<String, Integer> obtemQuantidadeDeTitulos(List<String> paises) {

        HashMap<String, Integer> quantidadeTitulos = new HashMap<>();

        //Percorra a lista criada, adicionando ao Map conforme achar necessário.
        for (String linha : paises) {
            String pais = linha
                    .split("-")[COLUNA_NOME_DO_PAIS]
                    .trim();

            //Não ganhou uma copa
            if (!quantidadeTitulos.containsKey(pais)) {
                quantidadeTitulos.put(pais, 1);

                //Já ganhou algo antes
            } else {
                //Assim: quantidadeTitulos.put(pais, quantidadeTitulos.get(pais)+1); OU:
                int quantidadeJaExistente = quantidadeTitulos.get(pais);
                quantidadeJaExistente++;
                quantidadeTitulos.put(pais, quantidadeJaExistente);
            }
        }

        return quantidadeTitulos;
    }

    private static List<String> obterListaPaisesDoArquivo(String arquivo) throws IOException {

        List<String> paises = new ArrayList<>();

        //Com Scanner
        //Leitura de arquivo
        Scanner scanner = new Scanner(Path.of(arquivo));
        while (scanner.hasNext()) {
            paises.add(scanner.nextLine());
        }
        return paises;

        // Com java.nio
        // List<String> paises = Files.readAllLines(Path.of("/dados/campeoes.txt"));
        //InputStream inputStream = Exercicio2.class.getClass().getResourceAsStream("/dados/campeoes.txt");
        //FileImageInputStream fInputStream = new FileImageInputStream(new File("/dados/campeoes.txt"));
        //fInputStream.readLine();
    }
}