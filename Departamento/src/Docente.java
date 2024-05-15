public class Docente extends Funcionario{

    public Docente(){
        super();
    }

    public Docente(String nome, Double salario) {
        super(nome, salario);
    }

    public  String dadosFuncionario(){
        return super.dadosFuncionario();
    }
}
