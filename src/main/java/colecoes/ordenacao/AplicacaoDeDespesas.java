package colecoes.ordenacao;

import java.util.*;

public class AplicacaoDeDespesas {

    public static void main(String[] args) {

        Despesa despesa1 = new Despesa("Netflix", 37.90F);
        Despesa despesa2 = new Despesa("Mercado", 120.00F);
        Despesa despesa3 = new Despesa("Fruteira", 60F);
        Despesa despesa4 = new Despesa("Amazon", 60F);
        Despesa despesa5 = new Despesa("Balaio", 40F);
        Despesa despesa6 = new Despesa("Fruteira", 10F);

//LIST
        List<Despesa> despesas = new LinkedList<>();
        despesas.add(despesa1);
        despesas.add(despesa2);
        despesas.add(despesa3);
        despesas.add(despesa4);
        despesas.add(despesa5);

//SET
//        Set<Despesa> despesas = new TreeSet<>();
//        despesas.add(despesa1);
//        despesas.add(despesa2);
//        despesas.add(despesa3);
//        despesas.add(despesa4);
//        despesas.add(despesa5);
//        despesas.add(despesa6);
//        Set<Despesa> despesasOrdenadasPorDescricao = new TreeSet<>();
//        Set<Despesa> despesasOrdenadasPorValor = new TreeSet<>(new DespesaPorValorComparator());

        Collections.sort(despesas);//Comparable

        System.out.println("\nOrdenação por Descrição:");
        for (Despesa desp : despesas){
            System.out.println(desp.getDescricaoDetalhada());
        }

        Collections.sort(despesas, Comparator.reverseOrder());//Comparable invertido

        System.out.println("\nOrdenação por Descrição DESC (invertida):");
        for (Despesa desp : despesas){
            System.out.println(desp.getDescricaoDetalhada());
        }
        Collections.sort(despesas, new DespesaPorValorComparator());//Comparator

        System.out.println("\nOrdenação por Valor:");
        for (Despesa desp : despesas){
            System.out.println(desp.getDescricaoDetalhada());
        }

    }
}