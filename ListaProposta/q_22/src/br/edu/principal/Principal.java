package br.edu.principal;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("Classificação do seu grupo de risco, com base na sua massa e na sua idade.");
		System.out.println("--------------------------------------------------------------------------\n");
		
		double massa = 0;
		double idade = 0;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor da sua idade: ");
		idade = sc.nextDouble();
		System.out.println(" ");
		
		System.out.println("Digite o valor da sua massa: ");
		massa = sc.nextDouble();
		System.out.println(" ");
		
		if (idade < 20) {
			if(massa < 60) {
				System.out.println("Você se encaixa no grupo de risco 9.");
			}
			if ((massa >= 60) && (massa <= 90)) {
				System.out.println("Você se encaixa no grupo de risco 8.");
			}
			if (massa > 90) {
				System.out.println("Você se encaixa no grupo de risco 8.");
			}
			
		}else if ((idade >= 20) && (idade <= 50)){
			if(massa < 60) {
				System.out.println("Você se encaixa no grupo de risco 6.");
			}
			if ((massa >= 60) && (massa <= 90)) {
				System.out.println("Você se encaixa no grupo de risco 5.");
			}
			if (massa > 90) {
				System.out.println("Você se encaixa no grupo de risco 4.");
			}
			
		}else if (idade > 50){
			if(massa < 60) {
				System.out.println("Você se encaixa no grupo de risco 3.");
			}
			if ((massa >= 60) && (massa <= 90)) {
				System.out.println("Você se encaixa no grupo de risco 2.");
			}
			if (massa > 90) {
				System.out.println("Você se encaixa no grupo de risco 1.");
			}			
		}
	}
}
