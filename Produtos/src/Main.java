import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String descricao;
        double valor, imposto, taxa, taxaImportacao;

        ArrayList<Produto> produtos = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 9){
            System.out.println("MENU");
            System.out.println("1 - Cadastrar Produto Estadual");
            System.out.println("2 - Cadastrar Produto Nacional");
            System.out.println("3 - Cadastrar Produto Importado");
            System.out.println("4 - Exibir Produtos Estaduais");
            System.out.println("5 - Exibir Produtos Nacionais");
            System.out.println("6 - Exibir Produtos Importados");
            System.out.println("7 - Exibir Todos Produtos");
            System.out.println("9 - Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Informe a descrição: ");
                    descricao = sc.next();
                    System.out.println("Informe o valor: ");
                    valor = sc.nextDouble();
                    System.out.println("Informe o imposto(%): ");
                    imposto = sc.nextDouble();

                    produtos.add(new Estadual(descricao, valor, imposto));
                    break;
                case 2:
                    System.out.println("Informe a descrição: ");
                    descricao = sc.next();
                    System.out.println("Informe o valor: ");
                    valor = sc.nextDouble();
                    System.out.println("Informe o imposto(%): ");
                    imposto = sc.nextDouble();
                    System.out.println("Informe a Taxa(%): ");
                    taxa = sc.nextDouble();

                    produtos.add(new Nacional(descricao, valor, imposto, taxa));
                    break;
                case 3:
                    System.out.println("Informe a descrição: ");
                    descricao = sc.next();
                    System.out.println("Informe o valor: ");
                    valor = sc.nextDouble();
                    System.out.println("Informe o imposto(%): ");
                    imposto = sc.nextDouble();
                    System.out.println("Informe a Taxa(%): ");
                    taxa = sc.nextDouble();
                    System.out.println("informe a taxa de importação(%): ");
                    taxaImportacao = sc.nextDouble();

                    produtos.add(new Importado(descricao, valor, imposto, taxa ,taxaImportacao));
                    break;
                case 4:
                    System.out.println("PRODUTOS ESTADUAIS: ");
                    for(Produto produto : produtos){
                        if(produto instanceof Estadual){
                            produto.descricao();
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("PRODUTOS NACIONAIS: ");
                    for(Produto produto : produtos){
                        if(produto instanceof Nacional){
                            produto.descricao();
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("PRODUTOS IMPORTADOS: ");
                    for(Produto produto : produtos){
                        if(produto instanceof Importado){
                            produto.descricao();
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.out.println("Todos Produtos:");
                    for(Produto produto : produtos){
                        produto.descricao();
                        System.out.println();
                    }
                    break;
                case 9:
                    System.out.println(("Encerrando programa..."));
                    break;
                default:
                    System.out.println("Opção invalida! \n Escolha uma opção valida.");
            }
        }

        sc.close();
    }
}