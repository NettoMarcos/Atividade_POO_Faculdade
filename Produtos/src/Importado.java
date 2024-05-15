public class Importado extends Produto{
    public Double taxa;
    public Double taxaImportacao;

    public Importado(String descricao, double valor, double imposto, double taxaImportacao){
        super();
    }

    public Importado(String descricao, Double valor, Double impostos, Double taxa, Double taxaImportacao) {
        super(descricao, valor, impostos);
        this.taxa = taxa;
        this.taxaImportacao = taxaImportacao;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    public Double getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(Double taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    @Override
    public void descricao(){
        double valorFinal = getValor() + ((getValor() * (taxa / 100)) +(getValor() * (getImpostos() / 100)) + (getValor() * (taxaImportacao / 100)));

        super.descricao();
        System.out.println("Taxa: " + taxa + "%");
        System.out.println("Taxa de importação: " + taxaImportacao + "%");
        System.out.println("Valor final: " + String.format( "%.2f",valorFinal));
    }
}
