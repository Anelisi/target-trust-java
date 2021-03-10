package colecoes.exercicios;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Exercicio1RemocaoPessoasDuplicada {
    public static void main(String[] args) {
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

        //Perigo: remover elementos da coleção que é percorrida
//        for (String pessoa : pessoas) {
//            pessoas.remove(pessoa);//ConcurrentModificationException
//        }

        ArrayList<String> pessoasNaoDuplicadas = new ArrayList<>();
        for (String pessoa : pessoas) {
            if( ! pessoasNaoDuplicadas.contains(pessoa)){
                pessoasNaoDuplicadas.add(pessoa);
            }
        }

        for (String pessoa : pessoasNaoDuplicadas) {
            System.out.println(pessoa);
        }

//        remocaoComSetOpcao1(pessoas);
//        remocaoComSetOpcao2(pessoas);
        remocaoComSetOpcao3(pessoas);
    }

    private static void remocaoComSetOpcao3(ArrayList<String> pessoas) {
        System.out.println("----- Remoção de duplicadas com SET - código 1 -----");

        Set<String> pessoasNaoDuplicadasSet = new TreeSet<>(pessoas);

        for (String pessoa : pessoasNaoDuplicadasSet) {
            System.out.println(pessoa);
        }
    }
    private static void remocaoComSetOpcao2(ArrayList<String> pessoas) {
        System.out.println("----- Remoção de duplicadas com SET - código 1 -----");

        Set<String> pessoasNaoDuplicadasSet = new TreeSet<>();
        pessoasNaoDuplicadasSet.addAll(pessoas);

        for (String pessoa : pessoasNaoDuplicadasSet) {
            System.out.println(pessoa);
        }
    }
    private static void remocaoComSetOpcao1(ArrayList<String> pessoas) {
        System.out.println("----- Remoção de duplicadas com SET - código 1 -----");

        Set<String> pessoasNaoDuplicadasSet = new TreeSet<>();

        for (String pessoa : pessoas) {
            pessoasNaoDuplicadasSet.add(pessoa);
        }

        for (String pessoa : pessoasNaoDuplicadasSet) {
            System.out.println(pessoa);
        }
    }
}