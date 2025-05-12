package controller;

import dao.UsuarioDAO;
import model.Usuario;
import view.CadastrarUsuarioView;

public class CadastrarUsuarioController {
    private CadastrarUsuarioView cuv;
    private UsuarioDAO dao;

    public CadastrarUsuarioController ()
    {
        cuv = new CadastrarUsuarioView();
        Usuario user = cuv.cadastro();
        dao = new UsuarioDAO();
        dao.criarUsuario(user);

    }


}
