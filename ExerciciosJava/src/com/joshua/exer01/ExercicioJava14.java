package com.joshua.exer01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioJava14 {

	public static void main(String[] args) {
		//14 Faça um programa que peça o tamanho de um arquivo para download
		//(em MB) e a velocidade de internet (em Mbps), calcule e
		//informe o tempo aproximado de download do arquivo (em minutos)
		//Obs: Pesquisar na internet como se faz o cálculo 
		
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		double tamArquivo, velocInternet, bits, kbps, kBps, kB, kB1, minutos, segundos;
		
		System.out.println("Digite o tamanho de um arquivo em (MB)");
		tamArquivo = scan.nextDouble();
		
		System.out.println("Digite a velocidade da internet em (Mpbs)");
		velocInternet = scan.nextDouble();

		kbps = velocInternet*1024;
		bits = kbps*1000; 
		kB1 =1024*8; 
		kBps = bits/kB1;
		
		kB = tamArquivo*1024;
		segundos = kB/kBps; 
		minutos = segundos/60;		

		System.out.println("Em uma conexão real de: "+velocInternet+"(MB)");
		System.out.println("A velocidade máxima de download seria: "+kBps+"kBps");
		System.out.println("Arquivo de "+tamArquivo +"(MB)");
		System.out.println("Tempo aproximado de download: "+df.format(minutos)+" - Min/Seg");
	}

}
