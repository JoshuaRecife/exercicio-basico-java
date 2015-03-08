package com.joshua.exer01;

import java.util.Scanner;

public class ExercicioJava08 {

	public static void main(String[] args) {
		//08 Faça um programa que pergunte quanto você ganha por hora e o
		//número de horas trabalhadas no mês. Calcule e mostre o 
		//total do seu salário no fererido mês.
		Scanner scan = new Scanner(System.in);
		
		float salH, horaM;
		 
		System.out.println("Digite quanto você ganha por hora.");
		salH = scan.nextFloat();
		
		System.out.println("Digite quantas horas você trabalha em um mês.");
		horaM = scan.nextInt();
		
		float salM = salH*horaM;
		
		System.out.println("Seu salário mensal é de: "+salM);
		
		
		
	}

}
