package com.joshua.exer01;

import java.util.Scanner;

public class ExercicioJava08 {

	public static void main(String[] args) {
		//08 Fa�a um programa que pergunte quanto voc� ganha por hora e o
		//n�mero de horas trabalhadas no m�s. Calcule e mostre o 
		//total do seu sal�rio no fererido m�s.
		Scanner scan = new Scanner(System.in);
		
		float salH, horaM;
		 
		System.out.println("Digite quanto voc� ganha por hora.");
		salH = scan.nextFloat();
		
		System.out.println("Digite quantas horas voc� trabalha em um m�s.");
		horaM = scan.nextInt();
		
		float salM = salH*horaM;
		
		System.out.println("Seu sal�rio mensal � de: "+salM);
		
		
		
	}

}
