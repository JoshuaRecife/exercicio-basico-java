package com.joshua.exer01;

import java.util.Scanner;

public class ExercicioJava06 {

	public static void main(String[] args) {
		
		//6 Fa�a um programa que pe�a o raio de um c�rculo, calcule e mostre a sua �rea.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o 'raio' do 'circulo'.");
		float r2 = scan.nextFloat();

		double A = Math.PI * Math.pow(r2, 2);
		
		System.out.println("A �rea do circulo �: "+A);

	}

}
