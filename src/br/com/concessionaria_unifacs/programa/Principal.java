package br.com.concessionaria_unifacs.programa;

import java.util.Scanner;

import br.com.concessionaria_unifacs.modelos.Database;

public class Principal {
	public static void main(String[] args) {
		Database dataBase = new Database();
		menu();
		
	}

	public static void menu() {
		Scanner leitor = new Scanner(System.in);
		Boolean validador = true;
		while (validador == true)  {	
			System.out.println("\n+----------------------+");
			System.out.println("|    MENU DE OPÇÕES    |");
			System.out.println("+----------------------+");
			System.out.println("| 1. Cadastrar veículo |");
			System.out.println("| 2. Listar veículos   |");
			System.out.println("| 3. Editar veículo    |");
			System.out.println("| 4. Excluir veículo   |");
			System.out.println("| 5. Sair              |");
			System.out.println("+----------------------+");
			System.out.println("Digite uma opção:");
			String resposta = leitor.next(); 
			switch (resposta) {
				case "1": {
					Database.cadastrar();
					validador = true;
					break;
				}
				case "2": {
					Database.listar();
					validador = true;
					break;
				}
				case "3": {
					Database.editar();
					validador = true;
					break;
				}
				case "4": {
					Database.excluir();
					validador = true;
					break;
				}
				case "5": {
					System.out.println("Saiu");
					validador = false;
					break;
				}
				default : {
					System.out.println("Erro");
					validador = true;
					break;
				}
			}
		}
	}
}
	
