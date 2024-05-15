public class Estadual extends Produto{

    public Estadual(){
        super();
    }

    public Estadual(String descricao, Double valor, Double impostos) {
        super(descricao, valor, impostos);
    }

    @Override
    public void descricao(){
        double valorFinal = getValor() + (getValor() * (getImpostos() / 100));
        super.descricao();
        System.out.println("Valor final: " + String.format( "%.2f",valorFinal));
    }
}
