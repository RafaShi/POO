package prjRet;

public class retangulo {
	
	private double altura;
	private double base;
	
	public void setaltura(double a) {
		altura = a;
	}
	
	public void setbase (double b) {
		base = b;
	}
	
	public double calcArea (){
		return altura*base;
	}
	
	public double calcPerimetro() {
		return 2*(altura + base);
	}
	
	public double calcDiagonal() {
		return (Math.sqrt(Math.pow(altura, 2)+ Math.pow(base, 2)));
	}
}
