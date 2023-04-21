package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Descubra o valor final do seu salário com base em descontos e gratificações!");
		System.out.println("----------------------------------------------------------------------------\n");

		
		
		double salario = 0;
		double imposto = 0;
		double gratificacao = 0;
		double sal_final = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do seu salário: ");
		salario = sc.nextDouble();
		
		imposto = 0.07 * salario;
		
		if (salario <= 350) {
			gratificacao = 100;
		}
		if ((salario > 350)  && (salario <= 600)){
			gratificacao = 75;
		}
		if ((salario > 600) && (salario <= 900)) {
			gratificacao = 50;
		}
		if (salario > 900) {
			gratificacao = 35;
		}
		
		sal_final = salario - imposto + gratificacao;
		System.out.println("\nO valor final do seu salário é de: " + sal_final+ " reais.");

		
		

	}

}
