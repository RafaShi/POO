public class Retangulo {

    private double altura;

    private double base;
    
     public double getAltura(){
       return altura;
    }
    
    public double getBase(){
       return base;
    }

    public void setAltura(double a) {

        altura = a;

    }

    
    public void setBase(double b) {

        base = b;

    }

    public double calcArea() {

        return(altura * base);

    }

    public double calcPerimetro() {

        return(2 * (altura + base));

    }
    
    public double calcDiagonal(){
        return (Math.sqrt (Math.pow(base,2) + Math.pow(altura,2)));
    }

}
 