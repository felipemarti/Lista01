import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		
		// Iniciando var�aveis
		int a, b;
		Scanner leitor = new Scanner(System.in);
		
		// Intera��o com o usu�rio:
		System.out.println("INVERTENDO VALORES");
		
		System.out.println("Por favor, digite o 1� valor inteiro:");
		a = leitor.nextInt();
		
		System.out.println("Por favor, digite o 2� valor inteiro:");
		b = leitor.nextInt();
		
		
		// Realizando a invers�o
		
		b = a + b;
		a = b - a;
		b = b - a;
		
		System.out.println("O 1� valor ficou: " + a + " e o 2� valor: " + b);
		
		leitor.close();
	}

}
