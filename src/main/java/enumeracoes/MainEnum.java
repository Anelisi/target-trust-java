package enumeracoes;

import java.util.Arrays;

public class MainEnum {
    public static void main(String[] args) {
        ModalidadeCredito cartao = new ModalidadeCredito();
        for (double v : new double[]{5_400.00, 12_240.00, 1_700.00, 800.00}) {
            System.out.println(cartao.categoriaCartao(v));
        }
        for (String s : Arrays.asList("BLACK", "GOLD", "PREMIUM", "STANDARD")) {
            System.out.println(TipoCartao.taxaJuros(s) + "%");
        }
    }
}
