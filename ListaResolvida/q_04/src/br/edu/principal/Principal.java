package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		System.out.println("##########################################################################");
		System.out.println("Programa que coloca três números recebidos pelo usuário em ordem crescente");
		System.out.println("##########################################################################\n");
		
		double num1 = 0;
		double num2 = 0;
		double num3 = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextDouble();
		System.out.println("Digite o terceiro número: ");
		num3 = sc.nextDouble();
		
		if ((num1 < num2) & (num1 < num3)){
		  if(num2 < num3){
		 System.out.println("A ordem crescente dos números fornecidos é: " + num1+ " - " +num2+ " - " + num3);
		  
		   }else {
			   System.out.println("A ordem crescente dos números fornecidos é: " + num1+ " - " + num3+ " - "+ num2);
		}
		}
		
		
		if((num2<num3) & (num2<num1)) {
			if(num1< num3) {
				System.out.println("A ordem crescente dos números fornecidos é: " + num2+ " - " + num1+ " - "+ num3);
			  }else {
				  System.out.println("A ordem crescente dos números fornecidos é: " + num2+ " - " + num3+ " - "+ num1);
			}
		}
		
		
		if((num3<num1)& (num3<num2)) {
			if(num1< num2) {
				System.out.println("A ordem crescente dos números fornecidos é: " + num3+ " - " + num1+ " - "+ num2);
			  }else {
				  System.out.println("A ordem crescente dos números fornecidos é: " + num3+ " - " + num2+ " - "+ num1);
			}
		}	
		
	}

}
