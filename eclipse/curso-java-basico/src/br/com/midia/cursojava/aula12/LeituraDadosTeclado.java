package br.com.midia.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");		
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu nome primeiro nome: ");
		String primeiroNome1 = scan.next();
		System.out.println("Seu primeiro nome é : " + primeiroNome1);
		
		System.out.println("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite a sua altura: ");
		double altura1 = scan.nextDouble();
		System.out.println("Sua altura é: " + altura1);
		
		
		String primeiroNome2 = scan.nextLine();		
		int idade02 = scan.nextInt();	
		double altura2 = scan.nextDouble();			
		int quantidadeFilhos = scan.nextInt();
		boolean temPet = scan.hasNextBoolean();
		
		System.out.println("Nome: " + primeiroNome2);
		System.out.println("Idade: " + idade02);
		System.out.println("Altura: " + altura2);
		System.out.println("Filho: " + quantidadeFilhos);
		System.out.println("Bichinho: " + temPet);
		
		
		
		
		
				
		
		
		
		
		
		
		

	}

}
