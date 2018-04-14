package modelo;

import java.util.Scanner;

public class MenuSistema {
	static Integer valorMenu = 6;
	static Scanner teclado = new Scanner(System.in);
	static Sistema sistema = new Sistema();

	public static void main(String[] args) {
		while (valorMenu != 3) {
			if (valorMenu == 1) {
				informarValores();
				sistema.cadastro();
				chamarMenu();
			} else if (valorMenu == 2) {
				System.err.println(sistema.getStoq());
				chamarMenu();
			} else if (valorMenu == 0) {
				System.exit(0);
			} else {
				chamarMenu();
			}
		}

	}

	private static void informarValores() {
		System.err.println("Informe o Produto");
		sistema.setNomeProduto(teclado.next());
		System.err.println("Informe o Preço");
		sistema.setValorProduto(teclado.nextFloat());
		System.err.println("Informe a quantia em Estoque");
		sistema.setQuantia(teclado.nextFloat());
	}

	private static void chamarMenu() {
		System.err.println("***********************");
		System.err.println("SISTEMA DE CONTROLE");
		System.err.println("1:CADASTRO DE PRODUTOS");
		System.err.println("2:RELATÓRIO");
		System.err.println("0:SAIR");
		valorMenu = teclado.nextInt();

	}
}
