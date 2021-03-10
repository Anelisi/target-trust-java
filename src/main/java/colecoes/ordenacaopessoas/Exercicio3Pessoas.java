package colecoes.ordenacaopessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Exercicio3Pessoas {
    public static void main(String[] args) {
        ArrayList<String> pessoas = new ArrayList<>();
//        pessoas.add("Kiersten");
//        pessoas.add("Zaneta");
//        pessoas.add("Frank");
//        pessoas.add("Tedi");
//        pessoas.add("Bryana");
//        pessoas.add("Marigold");
//        pessoas.add("Devan");
//        pessoas.add("Jerrilyn");
//        pessoas.add("Isac");
//        pessoas.add("Kathrine");
//        pessoas.add("Bryana");

        pessoas.add("Rui");
        pessoas.add("Sol");
        pessoas.add("Ana");
        pessoas.add("Pedro");
        pessoas.add("Gilberto");

        Collections.sort(pessoas);

        System.out.println("Pessoas ordenadas por tamanho do nome: ");
        for (String nome : pessoas){
            System.out.println(nome);
        }

    }
}