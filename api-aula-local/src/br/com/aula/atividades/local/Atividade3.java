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
		
		int choi;
		
		Scanner scan = new Scanner(System.in);
		Scanner sca = new Scanner(System.in);
		Scanner choice = new Scanner(System.in);
		Scanner notaaluno = new Scanner(System.in);
		
		
		System.out.println("Quantos alunos? ");
		int aluno = scan.nextInt();	
		System.out.println("Quantas materias?");
		int mat = sca.nextInt();
		
		
		String[] Nomes = new String[aluno];
		Integer[] Notas = new Integer[Not];
		Integer[] materias = new Integer[mat];
		

		for(int y = 0; y < mat; y++) {	
			int cont = 1;
			System.out.println("Materia: "+ cont);
		}
			System.out.println("Qual materia vamos ver as notas?");
			choi = choice.nextInt();	
			
			switch (choi) {
			case 1:
				System.out.println("Veremos a primeira entao..");
				for(int i = 0; i < aluno; i++) {
					System.out.println("Escreva o nome do aluno: ");
					Nomes[i] = scan.next();
					
					for(int x = 0; x < 4; x++) {
						int cont = 1;
						System.out.println("Fale a" + cont + "nota" + Nomes[x]);
						
						Notas[x] = Not.nextInt();
						cont++;
					
					}
					
				}
				break;
			case 2:
				System.out.println("Selecionou a opcao 2");
				break;
			}	
		
		
		for(int i = 0; i < aluno; i++) {
			System.out.println("Escreva o nome do aluno: ");
			Nomes[i] = scan.next();
			
		}
			
		
			
		
		for(int x = 0; x < 4; x++) {
			System.out.println("Fale a nota do aluno: ");
			//Notas[x] = sca.nextInt();
		}
		
		
	}

}
