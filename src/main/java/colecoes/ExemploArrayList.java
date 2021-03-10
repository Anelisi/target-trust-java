package colecoes;

import java.util.*;

public class ExemploArrayList {
    /*
    - List: permite duplicação
    - Permite acesso posicional - pois tem um array interno
    - Mantém a ORDEM de inserção
     */
    public static void main(String[] args) {
        //ArrayList sem tipo, ou seja, de Object (pai de todos os objetos).
        //ArrayList linguagens = new ArrayList();

        //Tipado do lado esquerdo (declaração) e direito (instanciação) - não é mais usado
        //ArrayList<String> linguagens = new ArrayList<String>();

        //Pode (não é obrigado) a usar a família (interface List do lado esquerdo)
        //List<String> linguagens = new LinkedList<>();

        List<String> linguagens1 = Arrays.asList("PHP", "JAVA");//Mutável, normal :)
        List<String> linguagens2 = List.of("PHP", "JAVA");//Imutável - não pode mexer nessa lista
        List<String> linguagens3 = Collections.singletonList("PHP");

        //ArrayList Lista de linguagens: Java, PHP, C#, JS, Scala.
        ArrayList<String> linguagens = new ArrayList<>();
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

        System.out.printf("\nPrimeiro Elemento: %s", linguagens.get(0));

        System.out.println("\nListagem:");

        for (String lang : linguagens){
            System.out.println(lang);
        }

        System.out.printf("\nPosicao do Scala: %s", linguagens.indexOf("Scala"));

    }
}