package com.joshua.exer01;

import java.util.Scanner;

public class ExercicioJava07 {

	public static void main(String[] args) {
		
		//07 Fa�a um programa que calcule a �rea de um quadrado, 
		//em seguida mostre o dobro desta �rea para o usu�rio.
		
		Scanner scan = new Scanner(System.in);
	  
		System.out.println("Informe o lado de um quadrado.");
	    float L = scan.nextFloat();
		
	    double Aq = Math.pow(L, 2);
		System.out.println("A �rea do quadrado �: "+Aq);
		System.out.println("O dobro da �rea do quadrado �: "+Aq*2);

	}

}
