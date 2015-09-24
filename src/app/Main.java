package app;

import facade.Facade;
import revisao.Revisao;
import revisor.Revisor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ivan
 */
public class Main {

    public static void main(String[] args) {
        Revisor r = new Revisor("Joao");

        Facade f = new Facade();
        f.iniciarRevisao();

        f.addObserver(r);
        f.notificarTodos();
    }

}
