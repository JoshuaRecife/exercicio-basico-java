package com.joshua.exer01;

import java.util.Scanner;

public class ExercicioJava02 {

	public static void main(String[] args) {
		
		//02 Fa�a um programa que pe�a um n�mero e ent�o mostre a mensagem:
		//"O n�mero informado foi: [n�mero]."
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insira um N�mero Inteiro");
		int num1 = scan.nextInt();
		System.out.println("O N�mero informado foi: "+num1);

	}

}
