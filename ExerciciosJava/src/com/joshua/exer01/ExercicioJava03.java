package com.joshua.exer01;

import java.util.Scanner;

public class ExercicioJava03 {

	public static void main(String[] args) {
		
		//3 Faça um programa que peça dois números e imprima a soma.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um Número.");
		double num1 = scan.nextDouble();
		System.out.println("Insira outro Número");
		double num2 = scan.nextDouble();
		System.out.println("A soma dos números é: "+(num1+num2));

	}

}
