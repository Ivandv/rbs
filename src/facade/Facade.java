/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import revisao.Revisao;
import revisor.Pessoa;

/**
 *
 * @author Ivan
 */
public class Facade {

    Revisao r;

    public void addObserver(Pessoa p) {
        r.addObserver(p);
    }

    public void removeObserver(Pessoa p) {
        r.removeObserver(p);
    }

    public void notificarTodos() {
        r.notificarTodos();
    }

    public Facade() {
        ////this.r = r
        r = new Revisao();
    }

    public void iniciarRevisao() {
        System.out.println("Iniciando Revisão pelo sistema de interface");
        r = new Revisao();
        r.iniciarRevisao();
        r.notificarTodos();
        r.imprimeDados();

    }

}
