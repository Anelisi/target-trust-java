package collectionsJava;

import java.util.*;

public class Exercicio1PessoasSolucaoFinal {
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

        //Remove duplicações E ordena
        Set<String> pessoasNaoDuplicadasSet = new TreeSet<>(pessoas);

        LinkedList<String> primeiros = new LinkedList<>();

        // Forma 1 de obter os 3 primeiros
//        //Gera nova lista para poder pegar posicional
//        LinkedList<String> pessoasNaoDuplicadasList = new LinkedList<>(pessoasNaoDuplicadasSet);
//        primeiros.add(pessoasNaoDuplicadasList.get(0));
//        primeiros.add(pessoasNaoDuplicadasList.get(1));
//        primeiros.add(pessoasNaoDuplicadasList.get(2));

        // Forma 2 de obter os 3 primeiros
//        Iterator<String> pessoasIterator = pessoasNaoDuplicadasSet.iterator();
//        primeiros.add(pessoasIterator.next());
//        primeiros.add(pessoasIterator.next());
//        primeiros.add(pessoasIterator.next());

        // Forma 3 de obter os 3 primeiros
        int contador = 0;
        Iterator<String> pessoasNaoDuplicadasIterator = pessoasNaoDuplicadasSet.iterator();
        while (pessoasNaoDuplicadasIterator.hasNext()){
            if(contador >= 3){
                break;
            }

            primeiros.add(pessoasNaoDuplicadasIterator.next());
            contador++;
        }

        Iterator<String> primeirosIterator = primeiros.iterator();
        while (primeirosIterator.hasNext()) {
            System.out.println(primeirosIterator.next());
        }
    }
}