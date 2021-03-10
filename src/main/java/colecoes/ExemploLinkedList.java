package colecoes;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ExemploLinkedList {
    /*
    - List: permite duplicação
    - Permite acesso posicional com custo (varrendo o linked list)
    - Mantém a ORDEM de inserção
     */
    public static void main(String[] args) {

        //ArrayList Lista de linguagens: Java, PHP, C#, JS, Scala.
        LinkedList<String> linguagens = new LinkedList<>();
        linguagens.add("Java");
        linguagens.add("PHP");
        linguagens.add("C#");
        linguagens.add("JS");
        linguagens.add("Scala");
        linguagens.add("Java");

        System.out.println("Listagem:");
        for (String lang : linguagens){
            System.out.println(lang);
        }

        Collections.sort(linguagens);

        System.out.println("\nListagem ordenada:");
        for (String lang : linguagens){
            System.out.println(lang);
        }

        System.out.printf("\nContém o PHP?? %s", linguagens.contains("PHP"));
        System.out.printf("\nContém o BASHSCRIPT?? %s", linguagens.contains("BASHSCRIPT"));

        System.out.printf("\nPrimeiro Elemento: %s", linguagens.get(0));

        linguagens.remove("Java");

        System.out.printf("\nPrimeiro Elemento: %s\n", linguagens.get(0));

        System.out.println("\nListagem:");

        for (String lang : linguagens){
            System.out.println(lang);
        }

        System.out.printf("\nPosicao do Scala: %s", linguagens.indexOf("Scala"));
        System.out.printf("\nPrimeiro item: %s \n", linguagens.get(0));

        Iterator<String> linguagensIterator = linguagens.iterator();

        while (linguagensIterator.hasNext()) {
            System.out.println(linguagensIterator.next());
        }
    }
}