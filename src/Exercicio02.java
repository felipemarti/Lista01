import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Inicializando as variáveis
		Scanner leitor = new Scanner(System.in);
		int  minutos, segundos;
		double horas;
		
		// Obtendo informação do usuário
		System.out.println("CALCULADO DE TEMPO DE FILME");
		
		System.out.println("Por favor, informe o tempo do filme em minutos");
		minutos = leitor.nextInt();
		
		// Cálculo do tempo
		
		horas = minutos/60.0;
		segundos = minutos * 60;
		
		// Apresentando resultados
		
		System.out.println("O tempo do filme em horas é: " + horas + "h e o tempo em segundos é de: " + segundos + "s.");
		
		leitor.close();
	}

}
