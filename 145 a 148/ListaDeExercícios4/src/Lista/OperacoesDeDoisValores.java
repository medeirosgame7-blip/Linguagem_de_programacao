package Lista;

import java.util.Scanner;

public class OperacoesDeDoisValores {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
		
		int number1;
		int number2;
		int produto;
		int soma;
		int diferenca = 0;
		int quociente;
		
		System.out.print("Digite o primeiro numero: "); 
		number1 = ler.nextInt();
		
		System.out.print("Digite o segundo numero: "); 
		number2 = ler.nextInt();
		
		soma = number1 + number2;
		produto = number1 * number2;
		diferenca = number1 - number2;
		
		
		
		System.out.printf("A soma é %d%n", soma);
		System.out.printf("O produto é %d%n", produto);
		System.out.printf("A diferença é %d%n", diferenca);
		
		if (number1 != 0) {
			System.out.printf("quociente: %f%n", (double) number1 / number2); 
		} else {
			System.out.println("Não é possível dividir por zero. ");
		}
	}

}
