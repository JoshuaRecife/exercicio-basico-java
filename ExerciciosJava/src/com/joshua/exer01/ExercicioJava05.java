package com.joshua.exer01;
import java.util.Scanner;
public class ExercicioJava05 {

	public static void main(String[] args) {
		
		//5 Faša um programa que converta metros para centÝmetros
		
		Scanner scan = new Scanner(System.in);
		float metro, cent;
		
		System.out.println("Digite a metragem a ser trasnformada em centÝmetros.");
		metro = scan.nextFloat();
		
		cent = metro*100;
		System.out.println(+metro +" metro(s)"+", equivale a "+cent+" centÝmetros!");
		

	}

}
