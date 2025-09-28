
/**
 *
 * @author Yumi
 */

import fatec.poo.Funcionario;
import fatec.poo.FuncionarioComissionado;
import fatec.poo.FuncionarioHorista;
import java.util.Scanner;

public class aplic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[100];
        int qtdFuncionarios = 0;

        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== Sistema de Funcionários ===");
            System.out.println("1. Adicionar funcionário");
            System.out.println("2. Listar salários");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opc = sc.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Nome do funcionário: ");
                    String nome = sc.next();

                    System.out.println("Data de admissão (dd/mm/yyyy): ");
                    String dtAdmissao = sc.next();

                    System.out.println("Tipo (1 = Horista, 2 = Comissionado): ");
                    int tipo = sc.nextInt();

                    switch (tipo) {
                        case 1:
                            System.out.println("Valor da hora: ");
                            double valHora = sc.nextDouble();
                            System.out.println("Quantidade de horas trabalhadas: ");
                            int qtdHoras = sc.nextInt();
                            FuncionarioHorista horista = new FuncionarioHorista(qtdFuncionarios + 1, nome, dtAdmissao, valHora);
                            horista.setQtdHorTrab(qtdHoras);
                            funcionarios[qtdFuncionarios] = horista;
                            qtdFuncionarios++;
                            break;
                        case 2:
                            System.out.println("Salário base: ");
                            double salBase = sc.nextDouble();
                            System.out.println("Taxa de comissão (0.05 = 5%): ");
                            double taxa = sc.nextDouble();
                            System.out.println("Total de vendas: ");
                            double totalVendas = sc.nextDouble();
                            FuncionarioComissionado comissionado = new FuncionarioComissionado(qtdFuncionarios + 1, nome, dtAdmissao, salBase, taxa, totalVendas);
                            funcionarios[qtdFuncionarios] = comissionado;
                            qtdFuncionarios++;
                            break;
                        default:
                            System.out.println("Tipo inválido!");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("\n=== Salários dos Funcionários ===");
                    for (int i = 0; i < qtdFuncionarios; i++) {
                        Funcionario f = funcionarios[i];
                        System.out.println("Nome: " + f.getNome());
                        System.out.println("Salário Bruto: " + f.calcSalBruto());
                        System.out.println("Salário Líquido: " + f.calcSalLiquido());
                        System.out.println("------------------------");
                    }
                    break;

                case 3:
                    continuar = false;
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}
