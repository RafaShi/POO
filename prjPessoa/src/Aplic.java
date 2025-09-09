import java.util.Scanner;

public class Aplic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int qtd, cont;
        
        System.out.println("Quantas pessoas? ");
        qtd = sc.nextInt();

        Pessoa[] pessoa = new Pessoa [qtd];
        
        for(cont=0; cont<qtd; cont++){
        pessoa[cont] = new Pessoa();
        System.out.println("Digite o nome da primeira pessoa: ");
        pessoa[cont].setNome(sc.next());

        System.out.println("Digite a idade da primeira pessoa: ");
        pessoa[cont].setIdade(sc.nextInt());
        }
        
        
        System.out.println("-----Lista de pessoas-----");
        for(cont = 0; cont<qtd; cont++){
            System.out.println("Pessoa "+ (cont+1)+ ": "+ pessoa[cont].getNome()+" - "+ pessoa[cont].getIdade() );
        }
        
        sc.close();
    }
    
}