package br.com.aula.atividades.local;

import java.util.Scanner;

public class Atividade5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] choice = new int[5];
		double nota = 0; 
		double beleza = 0;
		double simpatia = 0;
		double media = 0;
		
		System.out.println("Voce e geek? (1)Sim (2)nao");
		choice[0] = sc.nextInt();
		if(choice[0] == 1) {
			nota += 2;
			//System.out.println(nota);
		}
		
		System.out.println("Voce gosta de ler? (1)Sim (2)nao");
		choice[1] = sc.nextInt();
		if(choice[1] == 1) {
			nota += 2;
			//System.out.println(nota);
		}
		
		System.out.println("Voce gosta de jogos? (1)Sim (2)nao");
		choice[2] = sc.nextInt();
		if(choice[2] == 1) {
			nota += 2;
			//System.out.println(nota);
		}
		
		System.out.println("Voce joga truco? (1)Sim (2)nao");
		choice[3] = sc.nextInt();
		if(choice[3] == 1) {
			nota += 2;
			//System.out.println(nota);
		}
		
		System.out.println("Voce assiste the boys? (1)Sim (2)nao");
		choice[4] = sc.nextInt();
		if(choice[4] == 1) {
			nota += 2;
			//System.out.println(nota);
		}
		
		System.out.println("Beleza? (1 - 10) ");
		beleza = sc.nextInt();
		
		System.out.println("Simpatia? (1 - 10) ");
		simpatia = sc.nextInt();	
		media = (beleza + simpatia)/2;
			//System.out.println(media);
		
		if(nota == 10 && media == 10) {
			System.out.println("eita, ela e pra casar");			
		}
		else if(nota == 10 && media >= 5) {
			System.out.println("vou dar uma chance huehue, nem eu sou 10/10");
		}
		else if(nota == 10 && media < 5 && simpatia >= 6) {
			System.out.println("vou ser amigo dessa moça, quem sabe se pá");
		}
		else if(nota != 10 && media == 10) {
			System.out.println("vou apresentar ela pro meu melhor amigo, quem sabe");
		}
		else if(nota != 10 && media != 10 && simpatia >= 8) {
			System.out.println("vou ficar na amizade");
		}
		else if(nota != 10 && media != 10) {
			System.out.println("não é digna do meu tempo hueheue, pobre mortal");
		}
	}

}
