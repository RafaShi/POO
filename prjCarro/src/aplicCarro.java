
    import java.util.Scanner;

    /**
     *
     * @author Yumi
     */
    public class aplicCarro {

        public static void main(String[] args) {
            int qtd, cont;

            Scanner sc = new Scanner (System.in);

            System.out.println("Quantos carros serão? ");
            qtd = sc.nextInt();

            Carro[] carro = new Carro[qtd];
            
            for (cont=0; cont<qtd; cont++){
                
                carro[cont] = new Carro();

                
                System.out.println("Qual é a marca do carro "+ (cont+1)+"? ");
                carro[cont].setMarca(sc.next());
                

                System.out.println("Qual é o ano do carro "+(cont+1)+"? ");
                carro[cont].setAno(sc.nextInt());
                if (carro[cont].getAno()>2026){
                    System.out.println("Esse ano não condiz com a realidade, tente novamente");
                    cont --;
                }
            }
            
            
            System.out.println("-----Listagem-----");
            
            for(cont=0; cont<qtd; cont++){

                System.out.println("Carro " + (cont + 1) + ": " + carro[cont].getMarca() + " - " +carro[cont].getAno());
            }

        }

    }
