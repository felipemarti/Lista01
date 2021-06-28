import java.util.Scanner;
public class Exercicio05 {

	public static void main(String[] args) {
		// Iniciando as variáveis
		
		double lixo1, lixo2, lixo3;
		Scanner leitor = new Scanner(System.in);
		
		// Interagindo com o usuário
		System.out.println("INDENTIFICANDO O LIXO COM MENOR PESO");
		System.out.println("Por favor, informe o peso em gramas do 1º lixo:");
		lixo1 = leitor.nextDouble();
		System.out.println("Por favor, informe o peso em gramas do 2º lixo:");
		lixo2 = leitor.nextDouble();
		System.out.println("Por favor, informe o peso em gramas do 3º lixo:");
		lixo3 = leitor.nextDouble();
		
		// Identificando o lixo de menor peso
		
		if (lixo1 < lixo2 && lixo1 < lixo3) {
			System.out.println("O drone deve carregar o 1º lixo.");
		}
		if (lixo2 < lixo1 && lixo2 < lixo3) {
			System.out.println("O drone deve carregar o 2º lixo.");
		}
		if (lixo3 < lixo1 && lixo3 < lixo2) {
			System.out.println("O drone deve carregar o 3º lixo.");
		}
		leitor.close();
	}

}
