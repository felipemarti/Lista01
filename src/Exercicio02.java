import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Inicializando as vari�veis
		Scanner leitor = new Scanner(System.in);
		int  minutos, segundos;
		double horas;
		
		// Obtendo informa��o do usu�rio
		System.out.println("CALCULADO DE TEMPO DE FILME");
		
		System.out.println("Por favor, informe o tempo do filme em minutos");
		minutos = leitor.nextInt();
		
		// C�lculo do tempo
		
		horas = minutos/60.0;
		segundos = minutos * 60;
		
		// Apresentando resultados
		
		System.out.println("O tempo do filme em horas �: " + horas + "h e o tempo em segundos � de: " + segundos + "s.");
		
		leitor.close();
	}

}
