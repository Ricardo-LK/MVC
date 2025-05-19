package controller;

import dao.EventoDAO;
import view.ListarEventosView;

public class ListarEventosController {
    private ListarEventosView ltev;
    private EventoDAO eventoDao;

    private String[] cursos = new String[10];

    public ListarEventosController() {
        this.ltev = new ListarEventosView();
        eventoDao = new EventoDAO();
        this.ltev.listarTodosEventos(eventoDao.listarTodosEventos());
    }

    public ListarEventosController(String diaSemana) {
        this.ltev = new ListarEventosView();
        eventoDao = new EventoDAO();
        this.ltev.listarTodosEventos(eventoDao.listarTodosEventosDiaSemana(diaSemana));
    }

    public ListarEventosController(int curso)
    {

        System.out.println("");
        this.cursos[0] = "Ciência da Computação";
        this.cursos[1] = "Sistemas de Informação";

        this.ltev = new ListarEventosView();
        eventoDao = new EventoDAO();

        this.ltev.listarTodosEventos(eventoDao.listarTodosEventosCurso(this.cursos[curso - 1]));
    }

}

