package com.joshua.exer01;

import java.util.Scanner;

public class ExercicioJava04 {

	public static void main(String[] args) {
		
		//4 Fa�a um programa que pe�a as 4 notas bimestrais e mostre a m�dia.
		
		Scanner scan = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		System.out.println("Insira a nota do 1� Bimestre.");
		nota1 = scan.nextFloat();
		System.out.println("Insira a nota do 2� Bimestre.");
		nota2 = scan.nextFloat();
		System.out.println("Insira a nota do 3� Bimestre.");
		nota3 = scan.nextFloat();
		System.out.println("Insira a nota do 4� Bimestre.");
		nota4 = scan.nextFloat();
		media = (nota1 + nota2 + nota3 + nota4) /4;
		System.out.println("A m�dia das notas �: "+media);
	}

}
