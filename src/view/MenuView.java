package view;

import java.util.Scanner;

public class MenuView {

    private Scanner scan;

    public MenuView()
    {
        this.scan = new Scanner(System.in);
    }

    public int opcoesMenu()
    {
        System.out.println("Menu:");
        System.out.println("(1) Cadastrar usuario");
        System.out.println("(2) Listar usuario");
        System.out.println("(0) Sair\n");

        System.out.println("Opção: ");
        return scan.nextInt();
    }

    public void handleOpcaoInvalida()
    {
        System.out.println("opção invalida");
    }
}
