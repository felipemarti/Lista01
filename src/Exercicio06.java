import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		// Iniciando as vari�veis
		double preco, precoFinal;
		int opcao;
		String cupom;
		Scanner leitor = new Scanner(System.in);
		
		// Interagindo com o vendedor
		System.out.println("CALCULADORA DO PRE�O: ");
		System.out.println("Por favor, informe o pre�o do produto: ");
		preco = leitor.nextDouble();
		System.out.println("O cliente possui cupom de desconto? Informar 1 para sim e 2 para n�o");
		opcao = leitor.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Por favor, informe o cupom de desconto: ");
			cupom = leitor.next();
			if (cupom.equalsIgnoreCase("DIADEFESTA")) {
				precoFinal = preco * 0.97;
			}else {
				precoFinal = preco;
				System.out.println("Cupom expirado!");
			}
			System.out.print("O pre�o final do produto �: R$" + precoFinal);
			break;
		case 2:
			precoFinal = preco;
			System.out.print("O pre�o final do produto �: R$" + precoFinal);
			break;
		}
		leitor.close();
	}
	
}


