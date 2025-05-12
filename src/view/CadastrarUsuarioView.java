package view;

import model.Usuario;

import java.util.Scanner;

public class CadastrarUsuarioView {

    private Scanner scan;
    private Usuario user;

    public CadastrarUsuarioView()
    {
        this.scan = new Scanner(System.in);

    }

    public Usuario cadastro ()
    {
        System.out.println("Cadastrar usuario");
        System.out.print("Nome: ");
        String nome = scan.nextLine();

        System.out.print("Senha");
        String email = scan.nextLine();

        user = new Usuario(nome, email);
        return user;
    }

    public void handleOpcaoInvalida()
    {
        System.out.println("opção invalida");
    }
}
