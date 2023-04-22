package br.edu.principal; 
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
    	
        System.out.println("***********************************");
        System.out.println("Reajuste dos preços do supermercado");
        System.out.println("***********************************\n");
    	
        Scanner sc = new Scanner(System.in);
        double pre = 0, venda = 0, newpre = 0;

        System.out.println("Digite o preço atual do produto: ");
        pre = sc.nextDouble();

        System.out.print("Digite a quantidade de venda mensal do produto: ");
        venda = sc.nextDouble();

        if (venda < 500 && pre < 30) {
            newpre = pre * 1.1;
            System.out.println("O valor do preço sofreu aumento de 10%, e ficou de: " + newpre);
        }

        if (venda >= 500 && venda < 1200 && pre >= 30 && pre < 80) {
            newpre = pre * 1.15;
            System.out.println("O valor do preço sofreu aumento de 15%, e ficou de: " + newpre);
        }

        if (venda >= 1200 && pre >= 80) {
            newpre = pre * 0.8;
            System.out.println("O valor do preço sofreu uma redução de 20%, e ficou de: " + newpre);
        }

    }
}
