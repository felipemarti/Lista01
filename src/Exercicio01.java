import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// Vari�veis
		int idade, ano, idadeFinal;
		Scanner leitor = new Scanner(System.in);
		
		//Obten��o de dados
		System.out.println("C�lculadora de idade");
		System.out.println("Por favor, informe o ano de nascimento: ");
		idade = leitor.nextInt();
		
		System.out.println("Por favor, informe o ano que deseja calcular: ");
		ano = leitor.nextInt();
		
		//C�lculo
		idadeFinal = ano - idade;
		
		//Resposta
		System.out.println("A idade nesse ano ser� de: " + idadeFinal);
		
		leitor.close();

	}

}
