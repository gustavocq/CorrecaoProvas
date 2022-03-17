package program;

import java.util.*;

public class correcaoProva {

	static Scanner leitor = new Scanner (System.in);

	static String nomeAluno;
	static char gabarito[] = new char [8];
	static char provaAluno[] = new char [8];
	static int resulProva[] = new int [8];

	static void gabarito() {

		char gabaritoEntrada;

		for (int i=0; i<8; i++) {

			int numQuestoes=i+1;

			System.out.println("Insira o gabarito para a questão "+numQuestoes+":");
			gabaritoEntrada=leitor.next().charAt(0);

			gabarito[i]=gabaritoEntrada;
		}

	}
	static String prova() {

		char provaEntrada;

		System.out.println("Insira o nome do aluno, da qual a prova sera corrigida:");
		nomeAluno=leitor.next();

		for (int i=0; i<8; i++) {

			int numQuestoes=i+1;

			System.out.println("Insira o gabarito, do aluno, para a questão "+numQuestoes+":");
			provaEntrada=leitor.next().charAt(0);

			provaAluno[i]=provaEntrada;
		}
		return nomeAluno;
	}
	static void comparacao() {

		int resultado=0;

		for (int i=0; i<8; i++) {

			resulProva[i]= (int) (gabarito[i]-provaAluno[i]);

			if (resulProva[i]==0) {
				resultado++;
			}
		}

			if (resultado<6) {
				System.out.println("O aluno "+nomeAluno+" atingiu a nota "+resultado+", tendo assim nota abaixo da média.\n");
			}

			else {
				System.out.println("O aluno "+nomeAluno+" atingiu a nota "+resultado+", tendo assim nota acima da média.\n");
			}

		}


	static void continuidade() {

		String continuidade;

		System.out.println("Deseja corrigir outra prova? (Insira SIM ou NAO)");
		continuidade=leitor.next();

		if (continuidade.equalsIgnoreCase("sim")) {
			prova();
			comparacao();
			continuidade(); }

		if (continuidade.equalsIgnoreCase("nao")) {}

		else {
			System.out.println("Entrada inválida");
			continuidade();
		}

	}

	public static void main (String []args) {
		gabarito();
		prova();
		comparacao();
		continuidade();
		}
	}