package colecoes.ordenacao.produto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainOrdenacao {

    public static void main(String[] args) {

        List<Produto> produtos = Arrays.asList(
                new Produto("Condicionador 200ml", 18.90F, 15.00F),
//                new Produto("Condicionador 200ml", null, 15.00F),
                new Produto("Fralda P Confort - 50 Unidades", 44.90F, 44.90F),
                new Produto("Sabonete em Barra Corporal 90g", 2.99F, 3.30F),
                new Produto("Creme Dental 90g", 2.49F, 2.99F),
                new Produto("Protetor Solar 30 FPS 200ml", 37.39F, 39.12F)
        );

        System.out.println("---- Ordenada por nome (ordem padrão). ---- ");
        Collections.sort(produtos);
        for (Produto prod : produtos){
            System.out.println(prod.getDescricao());
        }

        System.out.println("\n\n---- Ordenada por custoAquisicao. ---- ");
        Collections.sort(produtos, new ProdutoPorCustoAquisicaoComparator());
        for (Produto prod : produtos){
            System.out.println(prod.getDescricao());
        }

        System.out.println("\n\n---- Lucro (valorVenda - custoAquisicao). ---- ");
        Collections.sort(produtos, new ProdutoPorLucroComparator());
        for (Produto prod : produtos){
            System.out.println(prod.getDescricao());
        }

    }
}