
import java.util.Scanner;



/**
 *
 * @author Rafaela
 */
public class aplic {
    public static void main (String[] args){
        double medRaio;
        int opcao = 0;
        
        
        Scanner entrada = new Scanner (System.in);
        
        
        System.out.println("Digite a medida do raio do círculo ");
        
        medRaio = entrada.nextDouble();
        
        Circulo objCir = new Circulo();
        
        objCir.setRaio (medRaio);
        
        do {
            System.out.println("\n1 - Consultar medida da área");
            System.out.println("2 - Consultar medida do perímetro");
            System.out.println("3 - Consultar medida do diâmetro");
            System.out.println("4 - Encerrar");
            System.out.print("\n\nDigite a opção: ");
            
            opcao = entrada.nextInt();

            if (opcao == 1){
                System.out.println("Medida da área: " + objCir.calcArea());
            }
            else if (opcao == 2){
                System.out.println("Medida do perímetro: " + objCir.calcPerimetro());
            }
            else if (opcao == 3){
                System.out.println("Medida do diâmetro: " + objCir.calcDiametro());
            }
            else if (opcao == 4){
                System.out.println("Encerrando...");
            }
            else{
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);
    }
    
}
