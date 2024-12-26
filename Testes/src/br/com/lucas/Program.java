package br.com.lucas;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		//Cliente c1 = new Cliente();
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o nome do cliente: ");
		String nome = s.nextLine();
		s.close();
		System.out.println(nome);
		
	}
}
