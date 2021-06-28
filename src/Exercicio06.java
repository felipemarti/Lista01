import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		// Iniciando as variáveis
		double preco, precoFinal;
		int opcao;
		String cupom;
		Scanner leitor = new Scanner(System.in);
		
		// Interagindo com o vendedor
		System.out.println("CALCULADORA DO PREÇO: ");
		System.out.println("Por favor, informe o preço do produto: ");
		preco = leitor.nextDouble();
		System.out.println("O cliente possui cupom de desconto? Informar 1 para sim e 2 para não");
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
			System.out.print("O preço final do produto é: R$" + precoFinal);
			break;
		case 2:
			precoFinal = preco;
			System.out.print("O preço final do produto é: R$" + precoFinal);
			break;
		}
		leitor.close();
	}
	
}


