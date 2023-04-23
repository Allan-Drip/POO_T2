package br.edu.principal; 
 import java.util.Scanner; 
  
 public class Principal { 
         public static void main(String[] args) { 
  
                 Scanner sc = new Scanner(System.in); 
                 double preco = 0; 
                 double codigo = 0; 
                 System.out.println("Digite o preço do produto: "); 
                 preco = sc.nextDouble(); 
                 System.out.println("Digite o código do produto: "); 
                 codigo = sc.nextDouble(); 
                 if(codigo == 1) { 
                         System.out.println("O produto é do Sul"); 
                 } 
                 else if(codigo == 2) { 
                         System.out.println("O produto é do Norte"); 
                 } 
                 else if(codigo == 3) { 
                         System.out.println("O produto é do Leste"); 
                 } 
                 else if(codigo == 4) { 

                         System.out.println("O produto é do Oeste"); 
                 } 
                 else if(codigo == 5 || codigo == 6) { 
                         System.out.println("O produto é do Nordeste"); 
                 } 
                 else if(codigo >= 7 & codigo <= 9) { 
                         System.out.println("O produto é do Sudeste"); 
                 } 
                 else if(codigo >= 10 & codigo <=20) { 
                         System.out.println("O produto é do Centro-Oeste"); 
                 } 
                 else if(codigo >= 21 & codigo <=30) { 
                         System.out.println("O produto é do Nordeste"); 
                 } 
         } 
 }
