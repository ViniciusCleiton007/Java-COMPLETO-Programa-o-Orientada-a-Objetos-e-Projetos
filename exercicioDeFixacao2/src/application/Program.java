package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		Banco conta;
		
		System.out.print("Entre com o número da conta: ");
		int numero  = sc.nextInt(); 
		
		System.out.print("Informe o nome da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.println("Deseja fazer um deposito inicial? (Sim/Nao)");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 'S') {
			System.out.println("Informe o valor do deposito: ");
			double depositoInical =  sc.nextDouble();
			conta = new Banco(numero, titular, depositoInical);
		}else {
			conta = new Banco(numero, titular);
		}
		
		System.out.println();
		System.out.println("Atualização da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Informe o valor do deposito: ");
		double depositoConta = sc.nextDouble();
		conta.deposito(depositoConta);
		System.out.println("Atualização  da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Informe o valor do saque: ");
		double saqueConta = sc.nextDouble();
		conta.saque(saqueConta);
		System.out.println("Atualização  da conta: ");
		System.out.println(conta);
		
		sc.close();
	}

}
