import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		
		// Inicializando as vari�veis 
		double dist;
		int opcao;
		boolean arma;
		Scanner leitor = new Scanner(System.in);
		
		// Intera��o com o Usu�rio
		System.out.println("CONTROLE DE ARMA DO ROB�");
		System.out.println("Por favor, informe a unidade de dist�ncia: ");
		System.out.println("1 - Metros");
		System.out.println("2 - Cent�metros");
		System.out.println("3 - Mil�metros");
		
		opcao = leitor.nextInt();
		
		switch (opcao) {
		
		case 1: 
			System.out.println("Por favor, informe a dist�ncia em metros: ");
			dist = leitor.nextDouble();
			dist = dist * 100.0;
			
			if(dist < 70.0) {
				arma = true;
				if(arma)
					System.out.println("Arma ativada!");
			}
			else {
				arma = false;
				System.out.println("Arma desativada!");
			}
			break;
		case 2: 
			System.out.println("Por favor, informe a dist�ncia em metros: ");
			dist = leitor.nextDouble();
			
			if(dist < 70.0) {
				arma = true;
				if(arma)
					System.out.println("Arma ativada!");
			}
			else {
				arma = false;
				System.out.println("Arma desativada!");
			}
			break;
		case 3: 
			System.out.println("Por favor, informe a dist�ncia em metros: ");
			dist = leitor.nextDouble();
			dist = dist / 10.0;
			
			if(dist < 70.0) {
				arma = true;
				if(arma)
					System.out.println("Arma ativada!");
			}
			else {
				arma = false;
				System.out.println("Arma desativada!");
			}	
			break;
		}
		leitor.close();
	}

}
