package com.userapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Cadastro de Usuários ===");

        while (running) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar usuário");
            System.out.println("2. Listar usuários");
            System.out.println("3. Sair");
            System.out.print("Opção: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (choice) {
                case 1:
                    System.out.print("Digite o nome do usuário: ");
                    String name = scanner.nextLine();

                    System.out.print("Digite o email do usuário: ");
                    String email = scanner.nextLine();

                    userManager.addUser(new User(name, email));
                    System.out.println("Usuário cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nLista de Usuários:");
                    userManager.listUsers();
                    break;

                case 3:
                    running = false;
                    System.out.println("Encerrando aplicação...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
