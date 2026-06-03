package Execicico5;
import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double raio;
		double area;
		double circunferencia;
		double diametro;
		
		System.out.print("Digite o primeiro numero: "); 
		raio = ler.nextInt();
		
		
		
		System.out.printf("Diâmetro: %.2f%n",diametro =  2 * raio); 
		System.out.printf("Circunferência: %.2f%n", circunferencia = 2 * Math.PI * raio); 
		System.out.printf("Área: %.2f%n",area = Math.PI * Math.pow(2, diametro)); 
	}

}
