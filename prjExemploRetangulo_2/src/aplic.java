
import java.util.Scanner;

/*
 * @author Rafaela
 */
public class aplic {
    
    public static void main (String[] args){
        double medAlt, medBase;
        int opcao = 0;
        
        Scanner entrada = new Scanner (System.in);
     
           
        System.out.println("Digite a medida da altura dp retângulo");
        
        medAlt = entrada.nextDouble();
        
        System.out.println("Digite a medida da base do retângulo");
        
        medBase = entrada.nextDouble();
        
        Retangulo objRet = new Retangulo();
                
                
        objRet.setAltura (medAlt);
        objRet.setBase (medBase);
         
        do{
            System.out.println("\n\n1 - Consultar medida da área ");
            System.out.println("2 - Consultar medida perímetro ");
            System.out.println("3 - Consultar medida da diagonal ");
            System.out.println("4 - Encerrar ");
            System.out.println("\n\t\tDigite a opção: ");
            
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("\nMedida da área: "+ objRet.calcArea());
            }
            
            else 
                if (opcao == 2){
                    System.out.println("\nMedida perímetro: "+ objRet.calcPerimetro());
            }
            
            else
                if (opcao ==3){
                    System.out.println("\nMedida diagonal: "+ objRet.calcDiagonal());
            }

            else
                    System.out.println("\nEncerrando");
          
        }while (opcao <4);  
        
        
    }
}
