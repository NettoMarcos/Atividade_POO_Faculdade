import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    List<Departamento> departamentos = new ArrayList<>();


    public void cadastrarDepartamento(String nomeDepartamento){
        departamentos.add(new Departamento(nomeDepartamento));
    }
    public void cadastrarFuncionarioTecnico(String nome, double salario, int index){

        Funcionario funcionario = new Tecnico(nome, salario);
        departamentos.get(index).addFuncionario(funcionario);

    }
    public void cadastrarFuncionarioDocente(String nome, double salario, int index){

        Funcionario funcionario = new Docente(nome, salario);
        departamentos.get(index).addFuncionario(funcionario);

    }
    public String buscarDepartamentoPorNome(String nome){
        for(Departamento departamento : departamentos) {
            if (departamento.getNomeDepartamento().equalsIgnoreCase(nome)) {
                return departamento.getNomeDepartamento() + "Existente.";
            }
        }
        return   "Departamento "+ nome +" não encontrado.";
    }
    public String buscarFuncionarioPorNome(String nome){
        boolean funcionarioExiste;
        for (Departamento departamento : departamentos){
            funcionarioExiste = departamento.encontrarFuncionarioPeloNome(nome);

            if(funcionarioExiste){
                return "Funcionario " + nome +" encontrado.";
            }

        }
        return "Funcionario " + nome + "Não encontrado.";
    }

    public void listagemDepartamentoFaixaSalarial(double min, double max){
        for(Departamento departamento : departamentos){
            if(departamento.verificaFaixaSalarialDepartamento(min, max)){
                System.out.println(departamento.getNomeDepartamento());
            }
        }
    }
    public void listagemFuncionariosFaixaSalarial(double min, double max){
        for (Departamento departamento : departamentos){
          departamento.nomeFuncionarioFaixaSalarial(min, max);
        }
    }

    public void listagemDepartamentoFaixaDeGastos(double min, double max){
        for(Departamento departamento : departamentos){
            if(departamento.ValorTotalGastoDepartamento() >= min && departamento.ValorTotalGastoDepartamento() <= max){
                System.out.println(departamento.getNomeDepartamento());
            }
        }
    }
    public void listagemTodosFuncionarios(){
        for (Departamento departamento : departamentos){
            departamento.listarFuncionarios();
            System.out.println();
        }
    }

    public void listagemDepartamentos(){
        for(Departamento departamento : departamentos){
            System.out.println(departamento.getNomeDepartamento());
        }
    }
    public void listagemDepartamentoComFuncionarios(){
        for (Departamento departamento: departamentos){
            System.out.println(departamento.getNomeDepartamento() + ": ");
            departamento.listarFuncionarios();
        }
    }
    public void listagemFuncionariosDocente(){
        for(Departamento departamento : departamentos){
            departamento.listarFuncionariosDocentes();
        }
    }
    public void listagemFuncionariosTecnicos(){
        for(Departamento departamento : departamentos){
            departamento.listarFuncionariosTecnicos();
        }
    }


    public static void main(String[] args) {
        Main universidade = new Main();

        String nome, nomeDepartamento;
        double salario;
        int index, indexDepartamento;

        Scanner sc = new Scanner(System.in);
        int op;

        do{
            System.out.println("MENU DE OPÇÕES:");
            System.out.println("1 - Cadastrar Departamento");
            System.out.println("2 - Cadastrar Funcionario Técnico");
            System.out.println("3 - Cadastrar Funcionário Docente");
            System.out.println("4 - Buscar Departamento por Nome");
            System.out.println("5 - Buscar Funcionário por Nome");
            System.out.println("6 - Listar Departamentos com Funcinários com Faixa Salarial Especifica");
            System.out.println("7 - Listar Funcionários com Faixa Salarial Específica");
            System.out.println("8 - Listar Departamentos cujo gasto toal está entre uma Faixa de Valores específica");
            System.out.println("9 - Listar todos Funcionários da universidade");
            System.out.println("10 - Listar todos departamentos da Universidade");
            System.out.println("11 - Listar todos Departamentos da Universidade e seus Respectivos Funcionários");
            System.out.println("12 - Listar todos Funcionários Docentes");
            System.out.println("13 - Listar todos Funcionários Técnicos");
            System.out.println("0 - Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op){
                case 1:

                    System.out.println("CADASTRAR DEPARTAMENTO");
                    System.out.println();
                    System.out.println("Nome do departamento: ");
                    nomeDepartamento = sc.next();
                    sc.nextLine();
                    universidade.cadastrarDepartamento(nomeDepartamento);
                    break;
                case 2:

                    System.out.print("Nome do Funcionario: ");
                    nome = sc.next();
                    sc.nextLine();
                    System.out.print("Salario do Funcionario: ");
                    salario = sc.nextDouble();
                    System.out.println("Escolha um departamento");
                    index = 1;
                    for(Departamento departamento : universidade.departamentos){

                        System.out.println(index + " - "+ departamento.getNomeDepartamento());
                        index ++;
                    }
                    System.out.print("Escolha um departamento: ");
                    indexDepartamento = sc.nextInt() - 1;
                    universidade.cadastrarFuncionarioTecnico(nome, salario,indexDepartamento);
                    break;
                case 3:

                    System.out.print("Nome do Funcionario: ");
                    nome = sc.next();
                    sc.nextLine();
                    System.out.print("Salario do Funcionario: ");
                    salario = sc.nextDouble();
                    System.out.println("Escolha um departamento");
                    index = 1;
                    for(Departamento departamento : universidade.departamentos){

                        System.out.println(index + " - "+ departamento.getNomeDepartamento());
                        index ++;
                    }
                    System.out.print("Escolha um departamento: ");
                    indexDepartamento = sc.nextInt() - 1;
                    universidade.cadastrarFuncionarioDocente(nome, salario,indexDepartamento);
                    break;
                case 4:

                    System.out.print("Digite o nome do Departamento: ");
                    nomeDepartamento = sc.next();
                    sc.nextLine();
                    System.out.println();
                    System.out.println(universidade.buscarDepartamentoPorNome(nomeDepartamento));
                    break;
                case 5:
                    System.out.print("Digite o nome do Funcionario ");
                    nome = sc.next();
                    sc.nextLine();
                    System.out.println();
                    System.out.println(universidade.buscarFuncionarioPorNome(nome));
                    break;
                case 6:
                    System.out.print("Digite o valor minimo da faxa salarial: ");
                    double valorMinimo = sc.nextDouble();
                    System.out.print("Digite o valor maximo da faxa salarial: ");
                    double valorMaximo = sc.nextDouble();
                    System.out.println();
                    System.out.println("Lista de departamento com funcionario(s) com a faixa salaria entre" + valorMinimo + " e " + valorMaximo);
                    universidade.listagemDepartamentoFaixaSalarial(valorMinimo, valorMaximo);
                    break;
                case 7:
                    System.out.println("Digite a faixa salarial do funcionario:");
                    System.out.print("Valor minimo: ");
                    double faixaMin = sc.nextDouble();
                    System.out.print("Valor maximo: ");
                    double faixaMax = sc.nextDouble();
                    System.out.println();
                    System.out.println("Lista de funcionarios com Faixa salarial entre " + faixaMin + "e " + faixaMax + ":");
                    universidade.listagemFuncionariosFaixaSalarial(faixaMin, faixaMax);
                    break;
                case 8:
                    System.out.print("Gasto minimo:");
                    double gastoMin = sc.nextDouble();
                    System.out.print("Gasto maximo: ");
                    double gastoMax = sc.nextDouble();
                    System.out.println();
                    System.out.println("Lista de departamentos com faixa de gasto entre" + gastoMin + " e " + gastoMax);
                    universidade.listagemDepartamentoFaixaDeGastos(gastoMin, gastoMax);
                    break;
                case 9:
                    System.out.println("Lista de todos os Funcionários: ");
                    universidade.listagemTodosFuncionarios();
                    break;
                case 10:
                    System.out.println("Lista de todos os Departamentos:");
                    universidade.listagemDepartamentos();
                    break;
                case 11:
                    System.out.println("Lista departamentos e seus funcionarios: ");
                    universidade.listagemDepartamentoComFuncionarios();
                    break;
                case 12:
                    System.out.println("Todos os Funcionarios Docentes: ");
                    universidade.listagemFuncionariosDocente();
                    break;
                case 13:
                    System.out.println("Todos os Funcionarios Tecnicos: ");
                    universidade.listagemFuncionariosTecnicos();
                    break;
                default:
                    System.out.println("Essa opção não existe tente outra.");
            }


        }while (op != 0);



        sc.close();
    }

}