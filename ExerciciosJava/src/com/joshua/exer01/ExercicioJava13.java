package com.joshua.exer01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioJava13 {

	public static void main(String[] args) {
		//13 Fa�a um programa que pergunte quanto voc� ganha por hor
		//a e o n�mero de horas trabalhadas no m�s, sabendo-se que s�o descontados 11%
		// para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�;
		//a. sal�rio bruto.
		//b. quanto pagou ao INSS;
		//c. quanto pagou ao sindicato.
		//d. o sal�rio l�quido.
		//e. calcule os descontos e o sal�rio l�quido,conforme a tabela abaixo:
		//  a. + Sal�rio Bruto:R$
		//	b. - IR(11%):R$
		//	c. - INSS(8%):R$
		//	d. - Sindicato(5%):R$
		//	e. = Sal�rio Liquido:R$
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double valorH, hTm, salB, salL, inss, sinD, ir,totalD;
		
		System.out.println("Quanto voc� ganha por hora?");
		valorH = scan.nextDouble();
		
		System.out.println("Quantas horas voc� trabalha no m�s?");
		hTm = scan.nextDouble();

		salB = valorH*hTm;
		ir = (salB/100)*11;
		inss = (8*salB)/100;
		sinD = (5*salB)/100;
		totalD = ir + inss + sinD;
		salL = salB-ir-inss-sinD;
		
		System.out.println("");								// Acrescentei
		System.out.println("+ Sal�rio Bruto:R$ "+df.format(salB));
		System.out.println("- IR(11%):R$ "+df.format(ir));
		System.out.println("- INSS(8%):R$ "+df.format(inss));
		System.out.println("- Sindicato(5%):R$ "+df.format(sinD));
		System.out.println("Total de descontos: "+df.format(totalD));	// Acrescentei	
		System.out.println("= Sal�rio Liquido:R$ "+df.format(salL));
		
	}

}
