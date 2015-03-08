package com.joshua.exer01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioJava09 {

	public static void main(String[] args) {
		//09 Faça um programa que peça a temperatura em graus Farenheit, 
		//trasforme e mostre a temperatura em graus Celsius. Formula: C =(5 * (F-32) /9)
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double F, C;
		System.out.println("Digite a temperatura em graus Farenheit.");
		F = scan.nextDouble();
		
		C = (5*(F-32) /9);
		System.out.println("A temperatura em graus Celsius é: "+df.format(C));
	}

}
