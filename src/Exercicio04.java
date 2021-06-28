import java.util.Scanner;
public class Exercicio04 {

	public static void main(String[] args) {
		
		// Inicializando as variáveis 
		double dist;
		int opcao;
		boolean arma;
		Scanner leitor = new Scanner(System.in);
		
		// Interação com o Usuário
		System.out.println("CONTROLE DE ARMA DO ROBÔ");
		System.out.println("Por favor, informe a unidade de distância: ");
		System.out.println("1 - Metros");
		System.out.println("2 - Centímetros");
		System.out.println("3 - Milímetros");
		
		opcao = leitor.nextInt();
		
		switch (opcao) {
		
		case 1: 
			System.out.println("Por favor, informe a distância em metros: ");
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
			System.out.println("Por favor, informe a distância em metros: ");
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
			System.out.println("Por favor, informe a distância em metros: ");
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
