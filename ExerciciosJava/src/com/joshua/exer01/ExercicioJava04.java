package com.joshua.exer01;

import java.util.Scanner;

public class ExercicioJava04 {

	public static void main(String[] args) {
		
		//4 Faça um programa que peça as 4 notas bimestrais e mostre a média.
		
		Scanner scan = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Insira a nota do 1º Bimestre.");
		nota1 = scan.nextFloat();
		System.out.println("Insira a nota do 2º Bimestre.");
		nota2 = scan.nextFloat();
		System.out.println("Insira a nota do 3º Bimestre.");
		nota3 = scan.nextFloat();
		System.out.println("Insira a nota do 4º Bimestre.");
		nota4 = scan.nextFloat();
		media = (nota1 + nota2 + nota3 + nota4) /4;
		System.out.println("A média das notas é: "+media);
	}

}
