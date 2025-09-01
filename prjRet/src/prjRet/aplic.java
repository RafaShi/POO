package prjRet;

import java.util.Scanner;

public class aplic {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		retangulo objRet;
		
		objRet = new retangulo();
		
		System.out.println("Escreva a altura: ");
		double altura = sc.nextDouble();
		objRet.setaltura(altura);
		
		System.out.println("Escreva a base: ");
		double base = sc.nextDouble();
		objRet.setbase(base);
		
		
		System.out.println("Área: "+ objRet.calcArea());
		
		System.out.println("Perímetro: "+ objRet.calcPerimetro());
		
		System.out.println("Diagonal: "+ objRet.calcDiagonal());
		
		sc.close();

	}

}
