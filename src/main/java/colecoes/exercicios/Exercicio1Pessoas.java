package colecoes.exercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Exercicio1Pessoas {
    public static void main(String[] args) {
        /*
       Crie uma lista vazia chamada pessoas.
        Adicione os nomes: Kiersten, Zaneta, Frank, Tedi, Bryana, Marigold, Devan, Jerrilyn, Isac, Kathrine, Bryana.
        Ignore as repetições.
        Adicione programaticamente os primeiros 3 nomes (após ordenar) a uma segunda lista chamada primeiros.
*/
        ArrayList<String> pessoas = new ArrayList<>();
        pessoas.add("Kiersten");
        pessoas.add("Zaneta");
        pessoas.add("Frank");
        pessoas.add("Tedi");
        pessoas.add("Bryana");
        pessoas.add("Marigold");
        pessoas.add("Devan");
        pessoas.add("Jerrilyn");
        pessoas.add("Isac");
        pessoas.add("Kathrine");
        pessoas.add("Bryana");

        Collections.sort(pessoas);

        LinkedList<String> primeiros = new LinkedList<>();

        int contador = 0;
        for (String pessoa : pessoas){
            if(contador >= 3){
                break;
            }
            primeiros.add(pessoa);
            contador++;
        }

        for (String nome : primeiros){
            System.out.println(nome);
        }
        System.out.println("----");

        primeiros.clear();

        for (int posicao = 0; posicao < 3;posicao++){
            primeiros.add(pessoas.get(posicao));
        }

        for (String nome : primeiros){
            System.out.println(nome);
        }
        System.out.println("----");

        primeiros.clear();
        primeiros.add(pessoas.get(0));
        primeiros.add(pessoas.get(1));
        primeiros.add(pessoas.get(2));

        for (String nome : primeiros){
            System.out.println(nome);
        }
        System.out.println("----");
    }
}