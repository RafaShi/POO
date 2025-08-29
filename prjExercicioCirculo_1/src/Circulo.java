/**
 *
 * @author Rafaela
 */
public class Circulo {
    private double raio;
    
    double pi = 3.1416;
    
    public void setRaio (double r){
        raio = r;
    }
    
    public double getRaio(){
        return raio;
    }
    
    public double calcArea(){
        return (pi* Math.pow(raio,2));
    }
    
    public double calcPerimetro(){
        return (2*pi*raio);
    }
    
    public double calcDiametro(){
        return (raio*2);
    }
    
}
