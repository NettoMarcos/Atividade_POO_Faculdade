import java.util.ArrayList;
import java.util.List;
public class Departamento {
    private String nomeDepartamento;
    private List<Funcionario> funcionarios = new ArrayList<>();

    public Departamento(){

    }
    public Departamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public void addFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public void removeFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }

    public boolean encontrarFuncionarioPeloNome(String nome){
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }
    public boolean verificaFaixaSalarialDepartamento(double min, double max){
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getSalario() >= min && funcionario.getSalario() <= max){
                return true;
            }
        }
        return false;
    }

    public void nomeFuncionarioFaixaSalarial(double min, double max ){
        for (Funcionario funcionario : funcionarios){
            if(funcionario.getSalario() >= min && funcionario.getSalario() <= max){
                System.out.println(funcionario.getNome());
            }
        }
    }

    public double ValorTotalGastoDepartamento(){
        double valorTotal = 0;
        for (Funcionario funcionario : funcionarios){
            valorTotal += funcionario.getSalario();
        }
        return valorTotal;
    }

    public void listarFuncionarios(){
        for (Funcionario funcionario : funcionarios){
            System.out.println(funcionario.dadosFuncionario());
        }
    }

    public void listarFuncionariosDocentes(){
        for(Funcionario funcionario : funcionarios){
            if (funcionario instanceof Docente){
                System.out.println(funcionario.dadosFuncionario());
            }
        }
    }
    public void listarFuncionariosTecnicos(){
        for(Funcionario funcionario : funcionarios){
            if (funcionario instanceof Tecnico){
                System.out.println(funcionario.dadosFuncionario());
            }
        }
    }


}
