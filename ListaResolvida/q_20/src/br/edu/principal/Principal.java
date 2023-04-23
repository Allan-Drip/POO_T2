package br.edu.principal;
import java.util.Scanner;
public class Principal {
	
	public static void main(String[] args) {
		
		System.out.println("======================================================================================== ");
		System.out.println("Valor total do preço de um produto, levando em conta impostos, códigos e massa em gramas ");
		System.out.println("======================================================================================== \n");
		
		int cod_prod = 0;
		int peso_quilos = 0;
		int cod_pais = 0;
		int peso_gramas = 0;
		int pre_total = 0;
		int imposto = 0;
		int valor_total = 0;
		int pre_grama = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do código do produto comprado: ");
		cod_prod = sc.nextInt();
		
		System.out.println("Digite o valor da massa do produto comprado em QUILOS: ");
		peso_quilos = sc.nextInt();
		
		System.out.println("Digite o valor do código do país de origem do produto comprado: ");
		cod_pais = sc.nextInt();
		System.out.println("\n");
		
		peso_gramas = peso_quilos * 1000;
		System.out.println("O valor da massa do produto comprado em GRAMAS é: \n" + peso_gramas);
		System.out.println("\n");
		
		if ((cod_prod >= 1) && (cod_prod <= 4)) {
			pre_grama = 10;
		}
		if ((cod_prod >= 5) && (cod_prod <= 7)) {
			pre_grama = 25;
		}
		if ((cod_prod >= 8) && (cod_prod <= 10)) {
			pre_grama = 35;
		}
		
		pre_total = peso_gramas * pre_grama;
		System.out.println("O valor do preço, em gramas, do produto comprado é: \n" + pre_total);
		
		System.out.println("\n");
		
		if (cod_pais == 1) {
			imposto = 0;
		}
		if (cod_pais == 2) {
			imposto = (int) (0.15 * pre_total);
		}
		if (cod_pais == 3) {
			imposto = (int) (0.25 * pre_total);
		}
		
		System.out.println("O valor do imposto do produto comprado é: " + imposto);
		
		System.out.println("\n");
		
		valor_total = imposto + pre_total;
		System.out.println("O valor do total do produto comprado é: \n" + valor_total);
	}
}
