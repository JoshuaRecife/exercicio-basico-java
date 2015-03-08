package com.joshua.exer01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioJava12 {

	public static void main(String[] args) {
		//12 Tendo como dados de entrada a altura de uma pessoa, 
		//construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula (72.7*altura) - 58
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new 	DecimalFormat("0.00");
		
		double altura, pesoIdeal;
		
		System.out.println("Digite sua altura.");
		altura = scan.nextDouble();
		
		pesoIdeal = ((72.7*altura) - 58);
		System.out.println("O peso ideal para você é: "+df.format(pesoIdeal));
	}

}
