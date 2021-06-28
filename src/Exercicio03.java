import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		
		// Iniciando varíaveis
		int a, b;
		Scanner leitor = new Scanner(System.in);
		
		// Interação com o usuário:
		System.out.println("INVERTENDO VALORES");
		
		System.out.println("Por favor, digite o 1º valor inteiro:");
		a = leitor.nextInt();
		
		System.out.println("Por favor, digite o 2º valor inteiro:");
		b = leitor.nextInt();
		
		
		// Realizando a inversão
		
		b = a + b;
		a = b - a;
		b = b - a;
		
		System.out.println("O 1º valor ficou: " + a + " e o 2º valor: " + b);
		
		leitor.close();
	}

}
