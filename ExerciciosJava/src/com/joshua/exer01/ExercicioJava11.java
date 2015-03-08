package com.joshua.exer01;

import java.util.Scanner;

public class ExercicioJava11 {

	public static void main(String[] args) {
//		11 Faça um programa que peça 2 números inteiros e um número real. Calcule e mostre:
//		a. O produto do dobro do primeiro com metade do segundo.
//		b. A soma do triplo do primeiro com o terceiro.
//		c. O terceiro elevado ao cubo.
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número inteiro.");
		int num1 = scan.nextInt();
		
		System.out.println("Digite outro número inteiro.");
		int num2 = scan.nextInt();
		
		System.out.println("Digite um número real.");
		float real = scan.nextFloat();
		
		float dobro1e2 = (2*num1)+(num2/2);
		float somaNum1 = (3*num1)+real;
		double cubo = Math.pow(real, 3);
		
		System.out.println("Dobro do 1º num. com metade do seg.: "+dobro1e2);
		System.out.println("A soma do triplo do 1º com o terceiro: "+somaNum1);
		System.out.println("O terceiro elevado ao cubo: "+cubo);

	}

}
