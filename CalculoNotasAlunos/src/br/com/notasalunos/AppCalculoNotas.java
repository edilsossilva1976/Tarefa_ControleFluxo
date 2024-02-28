package br.com.notasalunos;

import java.util.Scanner;

public class AppCalculoNotas {

	static Scanner sc = new Scanner(System.in);
	static double nota1 = 0.0;
	static double nota2 = 0.0;
	static double nota3 = 0.0;
	static double nota4 = 0.0;
	static double soma = 0.0;
	static double media = 0.0;
	static String nome;
	
	public static void main(String[] args) {
		captarNomeAluno();
		captarNotasAluno();
		aprovarAluno(media);
	}
	
	public static void captarNomeAluno() {
		System.out.print("Nome do aluno: ");
		nome = sc.next();
	}
	
	public static void captarNotasAluno() {
		System.out.println("Digite as notas bimestrais do " + nome + " (use virgula).\n");
		System.out.print("Nota 1: ");
		nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		nota3 = sc.nextDouble();
		System.out.print("Nota 4: ");
		nota4 = sc.nextDouble();
		soma = (nota1 + nota2 + nota3 + nota4);
		System.out.println("Média: " + calculaMedia(soma));
	}
	
	public static double calculaMedia(double notaGeral) {
		media = notaGeral/4.0;
		return media;
	}
	
	public static void aprovarAluno(double notaFinal) {
		if (notaFinal < 5) {
			System.out.println("Aluno reprovado!!!");
		}else if(notaFinal > 5 && notaFinal < 7) {
			System.out.println("Aluno encontra-se em recuperação!!!");
		}else {
			System.out.println("Aluno aprovado!!!");
		}
	}
}
