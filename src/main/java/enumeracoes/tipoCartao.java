package enumeracoes;

enum TipoCartao {
    STANDARD(3.5F, 'S'),
    GOLD(3.5F, 'G'),
    PREMIUM(2.95F, 'P'),
    BLACK(1.98F, 'B');

    private float valorTarifa;
    private char sigla;

    TipoCartao(float valorTarifa, char sigla) {
        this.valorTarifa = valorTarifa;
        this.sigla = sigla;
    }

    public float getValorTarifa() {
        return valorTarifa;
    }

    public char getSigla() {
        return sigla;
    }

    public static float taxaJuros(String categoria) {
        for (TipoCartao cat: TipoCartao.values()) {
            if (cat.name().equals(categoria)){
                return cat.valorTarifa;
            }
        }
        throw new IllegalArgumentException("Tipo de categoria não encontrada");
    }
}
