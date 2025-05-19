package view;

import java.util.Scanner;

public class MenuView {
    private Scanner sc;

    public MenuView() {
        this.sc = new Scanner(System.in);
    }

    public int opcoesMenu() {
        this.sc = new Scanner(System.in);
        System.out.println("\n*** MENU ***");
        System.out.println("\n[1] Listar eventos\n");
        System.out.println("[2] Listar eventos (segunda)\n");
        System.out.println("[3] Listar eventos (terça)\n");
        System.out.println("[4] Listar eventos (quarta)\n");
        System.out.println("[5] Listar por curso\n");
        System.out.println("[9] Sair\n");
        System.out.print("Opcão: ");
        return sc.nextInt();
    }

    public void opcaoInvalida() {
        System.out.println("Opção Inválida!");
    }

    public void opcaoSair() {
        System.out.println("Sistema encerrado!");
    }

    public int escolherCurso()
    {
        this.sc = new Scanner(System.in);
        System.out.println("Qual curso?\n");

        System.out.println("[1] Ciência da Computação");
        System.out.println("[2] Sistemas de Informação\n");

        System.out.print("Opção: ");
        return sc.nextInt();
    }

}