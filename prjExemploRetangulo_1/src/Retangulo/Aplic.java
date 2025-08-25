public class Aplic {

    public static void main(String[] args) {

        // DEFINIÇÃO DO PONTEIRO:

        Retangulo objRet;

        //INSTANCIAÇÃO (ALOCAÇÃO) DO OBJETO DA CLASSE RETANGULO:

        objRet = new Retangulo();

        //IMPLEMENTAÇÃO DO CASO DE USO MONTAR FIGURA GEOMETRICA RETANGULO:

        objRet.setAltura(5.0);  //passagem de mensagem

        objRet.setBase(8.0);    //passagem de mensagem

        System.out.println("Media da altura do retângulo " + objRet.getAltura());
        System.out.println("Media da altura do retângulo " + objRet.getBase() );
        System.out.println("Medida da diagonal "+ objRet.calcDiagonal());
        //IMPLEMENTAÇÃO DO CASO DE USO CONSULTAR ÁREA DA FIGURA GEOMETRICA RETANGULO:

        System.out.println("Medida da área do retângulo: " + objRet.calcArea());

        //IMPLEMENTAÇÃO DO CASO DE USO CONSULTAR PERÍMETRO DA FIGURA GEOMETRICA RETANGULO:

        System.out.println("Medida da perímetro do retângulo: " + objRet.calcPerimetro());
        
        
        Retangulo objRet1 = new Retangulo();
        
        objRet1.setAltura (3.0);
        objRet1.setBase (4.0);
        System.out.println("\n\nMedia da altura do retângulo " + objRet1.getAltura());
        System.out.println("Media da altura do retângulo " + objRet1.getBase() );
        System.out.println("Medida da diagonal "+ objRet1.calcDiagonal());
        System.out.println("Medida da área do retângulo: " + objRet1.calcArea());
         System.out.println("Medida da perímetro do retângulo: " + objRet1.calcPerimetro());
    }

}
 