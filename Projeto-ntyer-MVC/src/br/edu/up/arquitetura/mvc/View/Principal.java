package br.edu.up.arquitetura.mvc.View;

import java.util.Scanner;

import br.edu.up.arquitetura.mvc.Controller.PessoaControle;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int opcao = 0;
		do {
			   System.out.println("\nMenu de opções:");
			   System.out.println("1 - Cadastrar");
			   System.out.println("2 - Listar");
			   System.out.println("0 - Sair");
			   opcao = in.nextInt();
			switch (opcao) {
			case 1:
				Cadastrar();
				break;
			case 2:
				Listar();
				break;  
			case 0:
				System.out.println("\nO sistema será finalizado");
				return;
			default:
				System.out.println("\nOpção Inválida!");
				break;
			}
		} while (opcao != 0);

	}

	private static void Listar() {
		PessoaControle pessoaControle = new PessoaControle();
		System.out.println(pessoaControle.Listar());
		
	}

	private static void Cadastrar() {		
		Scanner in = new Scanner(System.in);
		PessoaControle pessoaControle = new PessoaControle();
		String nome;
		int idade;
		System.out.println("\nMenu Cadastro");
		System.out.println("Informe o seu nome: ");
		nome = in.nextLine();
		
		System.out.println("Informe a sua idade: ");
		idade = in.nextInt();
		
		System.out.println(pessoaControle.cadastrarPessoa(nome, idade) + "\n");
	}

}
