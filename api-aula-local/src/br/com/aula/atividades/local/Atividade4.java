package br.com.aula.atividades.local;

import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String[] args) {
	//Scanner nom = new Scanner(System.in);
	Scanner qntd = new Scanner(System.in);
	
	//int choiceA = 0;
	int choice = 0;
	int choiceB = 0;
	int choiceC = 0;
	int carg = 0;
	int cargos = 0;
	
	
	System.out.println("Quantos candidatos?");
	
	int candi = qntd.nextInt();
	String[] arrayNome = new String[candi];
	int[] cargoA = new int[candi];
	int[] choiceA = new int[candi];
	int[] cargoB = new int[candi];
	String[] cargoF = new String[candi];
	
	for(int i = 0; i < candi; i++) {
		System.out.println("Escreva o nome do candidato: ");
		arrayNome[i] = qntd.next();
	}
	for(int x = 0; x < candi; x++) {
		System.out.println("candidato:" + arrayNome[x]);
		System.out.println("Voce sabe uma das seguintes linguagens? (JAVA ou C++) ");
		System.out.println("Sim(1) / Nao(2)");
		choiceA[x] = qntd.nextInt();
		++carg;
		if(choiceA[x] == 1) {
		cargoA[x] = 1;		
		}
		else {
			cargoB[x] = 2;
		}
		if(carg > 0) {
			cargos = choiceA[x];
		}
	}
	for(int y = 0; y < candi; y++) {
		System.out.println("candidato:" + arrayNome[y]);
		System.out.println("Voce conhece alguma das seguintes? (REACT ou ANGULAR) ");
		System.out.println("Sim(1) / Nao(2)");
		choice = qntd.nextInt();
		if(choice == 1) {
			cargoB[y] = 1; 
		}
		else {
			cargoB[y] = 2;
		}
		System.out.println("Voce se comunica bem com as pessoas?");
		System.out.println("Sim(1) / Nao(2)");
		choiceC = qntd.nextInt();
		if (choiceA[y] == 1 && choice == 1 && choiceC == 1) {
			cargoF[y] = " Tech Lead";
		}
		else if(choiceA[y] == 1 && choice == 1 && choiceC == 2) {
			cargoF[y] = " Programador Full Stack";
		}
		else if ((choiceA[y] == 1 && choice == 2) || cargos == 1 && choice == 2) {
			cargoF[y] = " Programador Backend";
		}
		else if(choiceA[y] == 2 && choice == 1){
			cargoF[y] = " Programador Frontend";
		}
		else {
				System.out.println("Gostaria de aprender?");
				System.out.println("Sim(1) / Nao(2)");
				choiceB = qntd.nextInt();
				if(choiceB == 2) {
					System.out.println("Nao temos mais perguntas");
					cargoF[y] = " Nao foi aprovado";
				}
				else {
					cargoF[y] = " Aprendiz de Desenvolvimento";
				}
			
		}

	}
	for(int z = 0; z < candi; z++) {
		System.out.println(arrayNome[z] + cargoF[z]);
	}

	
	}

}
