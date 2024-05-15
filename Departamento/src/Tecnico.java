public class Tecnico extends Funcionario{

    public Tecnico(){
        super();
    }

    public Tecnico(String nome, Double salario) {
        super(nome, salario);
    }

    public String dadosFuncionario(){
        return super.dadosFuncionario();
    }
}
