package com.br.zup.agenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppAgenda {

	public static void main(String[] args) {

		List<Agenda> listaAgenda = new ArrayList<Agenda>();
		Scanner scan = new Scanner(System.in);
		int verificador = 1;

		while (verificador == 1) {

			System.out.println("\n\nDigite 1 para adicionar um contato\n"
					+ "Didite 2 para buscar o telefone pelo nome do contato\n" + "Digite 3 para excluir um contato\n"
					+ "Digite 4 para mostrar lista de contatos\n" + "Digite 5 para sair");
			int controle = scan.nextInt();

			if (controle == 1) {
				Scanner scanIf = new Scanner(System.in);
				int verifica2 = 1;

				while (verifica2 == 1) {
					Scanner scanwh = new Scanner(System.in);

					System.out.println("\n\n Deseja inserir um contato?\n" + "Digite 1 para sim ou 2 para não");
					int resposta = scanwh.nextInt();

					if (resposta == 1) {
						System.out.println("Digite o nome");
						String nome = scanIf.nextLine();

						System.out.println("Digite o telefone");
						String telefone = scanIf.nextLine();

						Agenda agenda = new Agenda(nome, telefone);

						listaAgenda.add(agenda);

					} else {
						verifica2 = 2;

					}

				}

			} else if (controle == 2) {

				Scanner scan2 = new Scanner(System.in);
				System.out.println("Digite o nome para buscar");
				String encontra = scan2.nextLine();

				System.out.println("O telefone do " + encontra + "\n" + encontraTelefone(encontra, listaAgenda));

			} else if (controle == 3) {

				Scanner scan1 = new Scanner(System.in);
				System.out.println("Digite o nome para buscar");
				String remove = scan1.nextLine();
				listaAgenda.remove(excluirContato(remove, listaAgenda));

				System.out.println(remove + " Foi removido dos contatos");

			} else if (controle == 4) {
				System.out.println("------Minha Agenda------");

				for (Agenda agenda : listaAgenda) {

					System.out.println(agenda);
				}
			} else if (controle == 5) {
				verificador = 2;

			}

		}

	}

	public static int excluirContato(String nome, List<Agenda> lista) {
		int posicao = 0;

		for (Agenda agenda : lista) {

			if (agenda.getNome().equalsIgnoreCase(nome)) {
				posicao = lista.indexOf(agenda);

			}

		}
		return posicao;

	}

	public static String encontraTelefone(String nome, List<Agenda> lista) {
		String fone = null;

		for (Agenda agenda : lista) {

			if (agenda.getNome().equalsIgnoreCase(nome)) {
				fone = agenda.getTelefone();

			}

		}

		return fone;

	}

}
