import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Variáveis
		int idade, ano, idadeFinal;
		Scanner leitor = new Scanner(System.in);
		
		//Obtenção de dados
		System.out.println("Cálculadora de idade");
		System.out.println("Por favor, informe o ano de nascimento: ");
		idade = leitor.nextInt();
		
		System.out.println("Por favor, informe o ano que deseja calcular: ");
		ano = leitor.nextInt();
		
		//Cálculo
		idadeFinal = ano - idade;
		
		//Resposta
		System.out.println("A idade nesse ano será de: " + idadeFinal);
		
		leitor.close();

	}

}
