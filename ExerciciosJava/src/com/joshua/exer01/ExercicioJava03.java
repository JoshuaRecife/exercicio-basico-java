package com.joshua.exer01;

import java.util.Scanner;

public class ExercicioJava03 {

	public static void main(String[] args) {
		
		//3 Fa�a um programa que pe�a dois n�meros e imprima a soma.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um N�mero.");
		double num1 = scan.nextDouble();
		System.out.println("Insira outro N�mero");
		double num2 = scan.nextDouble();
		System.out.println("A soma dos n�meros �: "+(num1+num2));

	}

}
