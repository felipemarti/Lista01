import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		// Iniciando as vari�veis
		
		double lixo1, lixo2, lixo3;
		Scanner leitor = new Scanner(System.in);
		
		// Interagindo com o usu�rio
		System.out.println("INDENTIFICANDO O LIXO COM MENOR PESO");
		System.out.println("Por favor, informe o peso em gramas do 1� lixo:");
		lixo1 = leitor.nextDouble();
		System.out.println("Por favor, informe o peso em gramas do 2� lixo:");
		lixo2 = leitor.nextDouble();
		System.out.println("Por favor, informe o peso em gramas do 3� lixo:");
		lixo3 = leitor.nextDouble();
		
		// Identificando o lixo de menor peso
		
		if (lixo1 < lixo2 && lixo1 < lixo3) {
			System.out.println("O drone deve carregar o 1� lixo.");
		}
		if (lixo2 < lixo1 && lixo2 < lixo3) {
			System.out.println("O drone deve carregar o 2� lixo.");
		}
		if (lixo3 < lixo1 && lixo3 < lixo2) {
			System.out.println("O drone deve carregar o 3� lixo.");
		}
		leitor.close();
	}

}
