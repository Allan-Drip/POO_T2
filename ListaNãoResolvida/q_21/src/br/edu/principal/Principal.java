package br.edu.principal; 
 import java.util.Scanner; 
  
 public class Principal { 
         public static void main(String[] args) { 
  
                 Scanner sc = new Scanner(System.in); 
                 double preco = 0; 
                 double codigo = 0; 
                 System.out.print("Digite o pre�o do produto: "); 
                 preco = sc.nextDouble(); 
                 System.out.print("Digite o c�digo do produto: "); 
                 codigo = sc.nextDouble(); 
                 if(codigo == 1) { 
                         System.out.println("O produto � do Sul"); 
                 } 
                 else if(codigo == 2) { 
                         System.out.println("O produto � do Norte"); 
                 } 
                 else if(codigo == 3) { 
                         System.out.println("O produto � do Leste"); 
                 } 
                 else if(codigo == 4) { 

                         System.out.println("O produto � do Oeste"); 
                 } 
                 else if(codigo == 5 || codigo == 6) { 
                         System.out.println("O produto � do Nordeste"); 
                 } 
                 else if(codigo >= 7 & codigo <= 9) { 
                         System.out.println("O produto � do Sudeste"); 
                 } 
                 else if(codigo >= 10 & codigo <=20) { 
                         System.out.println("O produto � do Centro-Oeste"); 
                 } 
                 else if(codigo >= 21 & codigo <=30) { 
                         System.out.println("O produto � do Nordeste"); 
                 } 
         } 
 }

