package colecoes.ordenacao;

//Contrato de comparabilidade Despesa
public class Despesa implements Comparable<Despesa> {

    private String descricao;//Atributo (com this)
    private Float valor;

    public Despesa(String descricao, Float valor) {//Parâmetros (sem this)
        this.descricao = descricao;//Nomes iguais, diferencie com this!
        this.valor = valor;

        ///this.salvar(); this funciona pra método da classe também
    }

    public String getDescricaoDetalhada(){
        return String.format("%s: R$ %.2f", this.descricao, this.valor);
    }

    @Override
    public int compareTo(Despesa outraDespesa){
        System.out.printf("Estou comparando o %s e %s\n", this.descricao, outraDespesa.descricao);
        return this.descricao.compareToIgnoreCase(outraDespesa.descricao);
    }

    public Float getValor() {
        return valor;
    }
}