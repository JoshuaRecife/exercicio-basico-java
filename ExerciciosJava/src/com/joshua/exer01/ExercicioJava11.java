package com.joshua.exer01;

import java.util.Scanner;

public class ExercicioJava11 {

	public static void main(String[] args) {
//		11 Fa�a um programa que pe�a 2 n�meros inteiros e um n�mero real. Calcule e mostre:
//		a. O produto do dobro do primeiro com metade do segundo.
//		b. A soma do triplo do primeiro com o terceiro.
//		c. O terceiro elevado ao cubo.
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro.");
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro n�mero inteiro.");
		int num2 = scan.nextInt();
		
		System.out.println("Digite um n�mero real.");
		float real = scan.nextFloat();
		
		float dobro1e2 = (2*num1)+(num2/2);
		float somaNum1 = (3*num1)+real;
		double cubo = Math.pow(real, 3);
		
		System.out.println("Dobro do 1� num. com metade do seg.: "+dobro1e2);
		System.out.println("A soma do triplo do 1� com o terceiro: "+somaNum1);
		System.out.println("O terceiro elevado ao cubo: "+cubo);

	}

}
