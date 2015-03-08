package com.joshua.exer01;

import java.util.Scanner;

public class ExercicioJava02 {

	public static void main(String[] args) {
		
		//02 Faça um programa que peça um número e então mostre a mensagem:
		//"O número informado foi: [número]."
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um Número Inteiro");
		int num1 = scan.nextInt();
		System.out.println("O Número informado foi: "+num1);

	}

}
