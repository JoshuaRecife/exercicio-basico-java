package com.joshua.exer01;

import java.util.Scanner;

public class ExercicioJava07 {

	public static void main(String[] args) {
		
		//07 Faça um programa que calcule a área de um quadrado, 
		//em seguida mostre o dobro desta área para o usuário.
		
		Scanner scan = new Scanner(System.in);
	  
		System.out.println("Informe o lado de um quadrado.");
	    float L = scan.nextFloat();
		
	    double Aq = Math.pow(L, 2);
		System.out.println("A área do quadrado é: "+Aq);
		System.out.println("O dobro da área do quadrado é: "+Aq*2);

	}

}
