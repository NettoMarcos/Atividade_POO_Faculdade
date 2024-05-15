public class Nacional extends Produto{
    private Double taxa;

    public Nacional(){
        super();
    }

    public Nacional(String descricao, Double valor, Double impostos, Double taxa) {
        super(descricao, valor, impostos);
        this.taxa = taxa;
    }

    public Double getTaxa() {
        return taxa;
    }

    public void setTaxa(Double taxa) {
        this.taxa = taxa;
    }

    @Override
    public void descricao(){
        double valorFinal = getValor() + ((getValor() * (taxa / 100)) +(getValor() * (getImpostos() / 100)));

        super.descricao();
        System.out.println("Taxa: " + taxa + "%");
        System.out.println("Valor final: " + String.format( "%.2f",valorFinal));
    }
}
