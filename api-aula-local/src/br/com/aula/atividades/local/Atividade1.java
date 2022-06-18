package br.com.aula.atividades.local;

import java.util.Scanner;

public class Atividade1 {
	
	//colete o nome do usuário
	//colete a idade de usuário
	//faça o sistema dizer "<nome_usuario>, menores de idade nao são permitidos"
	//faça o sistema dizer "<nome_usuario> Seja Bem Vindo!"
	
	public static void main(String[] args) {
		Scanner nom = new Scanner(System.in);
		Scanner ida = new Scanner(System.in);
		
		System.out.println("Me diga seu nome:");
		String nome = nom.nextLine();

		System.out.println("Me diga sua idade:");
		int idade = ida.nextInt();		
		
		if (idade >= 18) {
			System.out.println(nome+" Seja Bem Vindo");						
		}
		else {
			System.out.println(nome + " menores de idade nao sao permitidos");
		}
		
	}

}
