package colecoes.ordenacao.produto;

import java.util.Comparator;

public class ProdutoPorCustoAquisicaoComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        if(o1 == null || o1.getCustoAquisicao() == null){
            return 1;
        }

        if(o2 == null || o2.getCustoAquisicao() == null){
            return -1;
        }

        return o1.getCustoAquisicao().compareTo(o2.getCustoAquisicao());
    }
}
