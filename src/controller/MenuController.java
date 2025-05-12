package controller;

import view.MenuView;

public class MenuController {
    private MenuView mv;

    public MenuController () {
        mv = new MenuView();

        int opcao = -1;
        while (opcao != 0)
        {
            opcao = mv.opcoesMenu();

            if (opcao == 1) { //Cadastrar
                new CadastrarUsuarioController();
            }
            else if (opcao == 2) { // Listar

            }
            else {
                mv.handleOpcaoInvalida();
            }
        }
    }
}
