package com.joshua.exer01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioJava10 {

	public static void main(String[] args) {
		//10 Faça um programa que peça a temperatura em graus Celsius, 
		//transforme e mostre em graus Farenheit.
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double C, F;
		
		System.out.println("Digite a temperatura em Celsius.");
		C = scan.nextFloat();
		
		F = (C * 1.8) + 32;
		
		System.out.println("A temperatura em graus Farenheit é: "+df.format(F));
	}

}
