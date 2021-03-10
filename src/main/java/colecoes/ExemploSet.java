package colecoes;

import java.util.*;

public class ExemploSet {

    public static void main(String[] args) {

        //Lista de nomes: "Tom", "John", "Mary", "Peter", "David", "Alice", "Tom"
//        HashSet<String> pessoas = new HashSet<>();
        // Set é a superclasse, então pode ser usado no lado esquerdo
//        Set<String> pessoas = new HashSet<>();//não garante a ordem
//        Set<String> pessoas = new LinkedHashSet<>();//Mantem ordem de inserção
        Set<String> pessoas = new TreeSet<>();//Ordena automaticamente pela ordem natual

        System.out.println(pessoas.add("Tom"));
        System.out.println(pessoas.add("John"));
        System.out.println(pessoas.add("Mary"));
        System.out.println(pessoas.add("Peter"));
        System.out.println(pessoas.add("David"));
        System.out.println(pessoas.add("Alice"));
        System.out.println(pessoas.add("tom"));
        System.out.println(pessoas.add("Alice"));
        System.out.println(pessoas.add("Gilberto"));

        System.out.println("--");

        for (String pessoa : pessoas){
            System.out.println(pessoa);
        }

        HashSet<Integer> quantidades = new HashSet<>();
        quantidades.add(3);
        quantidades.add(2);
        quantidades.add(1);
        quantidades.add(4);
        quantidades.add(5);
        quantidades.add(6);
        quantidades.add(6);

        System.out.println("------");

        for (Integer qtd : quantidades){
            System.out.println(qtd);
        }

        System.out.println("------");

        Iterator<Integer> quantidadesIterator = quantidades.iterator();

        while (quantidadesIterator.hasNext()){
            System.out.println(quantidadesIterator.next());
        }
//        NoSuchElementException - pois o indice do iterator chegou ao ultimo elemento no WHILE acima
//        System.out.println(quantidadesIterator.next());
//        System.out.println(quantidadesIterator.next());
//        System.out.println(quantidadesIterator.next());
    }
}
