package enumeracoes;

import static enumeracoes.TipoCartao.*;

public class ModalidadeCredito {

    public TipoCartao categoriaCartao(double renda) {
        if (renda < 1000) {
         return STANDARD;
        } else if ( renda < 3000) {
            return GOLD;
        } else if (renda < 10000) {
            return PREMIUM;
        } else {
            return BLACK;
        }
    }
}
