package colecoes.ordenacao.produto;

public class Produto implements Comparable<Produto>{

    private String nome;
    private Float custoAquisicao;
    private Float valorVenda;

    public Produto(String nome, Float custoAquisicao, Float valorVenda) {
        this.nome = nome;
        this.custoAquisicao = custoAquisicao;
        this.valorVenda = valorVenda;
    }

    public Float getCustoAquisicao() {
        return custoAquisicao;
    }

    public Float getLucro() {
        if(valorVenda == null){
            return 0F;
        }
        if(custoAquisicao == null){
            return valorVenda;
        }
        return valorVenda - custoAquisicao;
    }

    public String getDescricao() {
        return String.format("%s - Aquisição: R$ %.2f Venda: R$ %.2f Lucro: R$ %.2f",
                this.nome, this.custoAquisicao, this.valorVenda, getLucro());
    }

    @Override
    public int compareTo(Produto o) {
        if(this.nome == null){
            return 1;
        }

        if(o == null || o.nome == null){
            return -1;
        }

        return this.nome.compareTo(o.nome);
    }

}