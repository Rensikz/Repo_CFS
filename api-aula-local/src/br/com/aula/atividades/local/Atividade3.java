package br.com.aula.atividades.local;

import java.util.Scanner;

public class Atividade3 {
	
	//Colete a quantidade de alunos de uma turma
	//Colete o nome de cada um
	//Colete a média do aluno para cada trimestre de cada matéria, ou seja 4 notas para cada materia, para cada um dos 4 periodos do ano
	//As materias podem estar fixa no código fonte, não precisa seguir um padrão de quantidade de materias e nomes especificos para cada uma delas
	
	//Diga se o aluno está aprovado, reprovado ou em recuperação
	//Como funciona nossa metrica
	//Aprovado média 7
	//Recuperação média >= 6,25
	//Reprovado < 6,25
	
	//Você deve usar concatenação, variáveis String, int e double
	//deve usar if, swtich, array e looping for
	
	//concluindo a atividade subir ela para seu repositório do Git
	//cada Aluno poderá ter seu código analisado em uma call privada depois da aula (de forma randon)
	public static void main(String[] args) {
		
		Scanner nom = new Scanner(System.in);
		Scanner alunos = new Scanner(System.in);
		Scanner mat = new Scanner(System.in);
		Scanner not = new Scanner(System.in);
		double med = 0;
		int matA = 0;
		int matB = 0;
		
		System.out.println("Quantos alunos?");
		
		int aln = alunos.nextInt();
		String[] arrayNome = new String[aln];
		
		for(int i = 0; i < aln; i++) {
			System.out.println("Escreva seu nome: ");
			arrayNome[i] = alunos.next();
		}
		
	for(int i = 0; i <= aln;) {	
		if (matA == 1 && matB == 1){
			matA = 0;
			matB = 0;
			i++;
		}
		
		System.out.println("Qual materia? Obs: Aluno: " + arrayNome[i]);
		
		System.out.println("materia_a [1]");
		System.out.println("materia_b [2]");
		
		int materia = mat.nextInt();
		
		switch (materia) {
		case 1:
			
			if (matA == 0) {
				double nota = 0;				
				int conta = 1;
				for(int x = 0; x <= 3; x++) {
					
					
				System.out.println("Diga a " + conta + " nota");
				nota = nota + not.nextInt();
				med = nota/4;
				conta = conta + 1;
				matA = 1;
				 
				}
				
				System.out.println("A nota do aluno: " + arrayNome[i] + " = " + med);
				if(med >= 7) {
					System.out.println("Aprovado!");
				}
				else if (med >= 6.25) {
					System.out.println("Em recuperacao!");
				}
				else {
					System.out.println("Reprovado!");
				}
			}
			else {
				System.out.println("A nota do aluno: " + arrayNome[i] + " = " + med);
				if(med >= 7) {
					System.out.println("Aprovado!");
				}
				else if (med >= 6.25) {
					System.out.println("Em recuperacao!");
				}
				else {
					System.out.println("Reprovado!");
				}
			
			}
			
			break;
		case 2:
			if (matB == 0) {
				double nota = 0;
				int conta = 1;
				
				for(int y = 0; y <= 3; y++) {
					
					System.out.println("Diga a " + conta + " nota");
					nota = nota + not.nextInt();
					med = nota/4;
					conta = conta + 1;
					matB = 1;	
					
				}
				System.out.println("A nota do aluno: " + arrayNome[i] + " = " + med);
				if(med >= 7) {
					System.out.println("Aprovado!");
				}
				else if (med >= 6.25) {
					System.out.println("Em recuperacao!");
				}
				else {
					System.out.println("Reprovado!");
				}
			
				
			}
			else {
				System.out.println("A nota do aluno: " + arrayNome[i] + " = " + med);
				if(med >= 7) {
					System.out.println("Aprovado!");
				}
				else if (med >= 6.25) {
					System.out.println("Em recuperacao!");
				}
				else {
					System.out.println("Reprovado!");
				}
			}
			
			
			
			break;

		default:
			System.out.println("Escolha nao reconhecida!");
			break;
		}
		

	}
	System.out.println("Notas Salvas!");
		
		
	}

}
