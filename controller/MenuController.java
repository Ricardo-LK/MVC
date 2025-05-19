package controller;

import view.MenuView;

public class MenuController {

    private MenuView mv;

    public MenuController() {
        mv = new MenuView();
        int opcao = 0;
        while (opcao != 9) {
            opcao = mv.opcoesMenu();
            switch (opcao) {
                case 1:
                    new ListarEventosController();
                    break;
                case 2:
                    new ListarEventosController("segunda");
                    break;
                case 3:
                    new ListarEventosController("terça");
                    break;
                case 4:
                    new ListarEventosController("quarta");
                    break;
                case 5:
                    new ListarEventosController(mv.escolherCurso());
                    break;
                case 9:
                    mv.opcaoSair();
                    break;
                default:
                    mv.opcaoInvalida();
                    break;
            }
        }
    }
}
