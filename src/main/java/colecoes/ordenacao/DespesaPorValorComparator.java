package colecoes.ordenacao;

import java.util.Comparator;

public class DespesaPorValorComparator implements Comparator<Despesa> {

    @Override
    public int compare(Despesa despesa1, Despesa despesa2) {
        if(despesa1 == null || despesa1.getValor() == null){
            return 1;
        }
        if(despesa2 == null || despesa2.getValor() ==null){
            return -1;
        }
        return despesa1.getValor().compareTo(despesa2.getValor());
    }
}