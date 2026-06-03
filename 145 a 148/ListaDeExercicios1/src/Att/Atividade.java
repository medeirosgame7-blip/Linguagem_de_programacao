package Att;

import java.util.Scanner;

public class Atividade {
	
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int produto;
		
		System.out.print("Digite o primeiro numero: "); 
		x = ler.nextInt();
		
		System.out.print("Digite o segundo numero: "); 
		y = ler.nextInt();
		
		System.out.print("Digite o terceiro numero: "); 
		z = ler.nextInt();
		
	    produto = x * y * z;
	    
	    
	    System.out.printf("O produto é: %d%n", produto);
	    
	    
	    

     }

}
