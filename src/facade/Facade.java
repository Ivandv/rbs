/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import revisao.Revisao;

/**
 *
 * @author Ivan
 */
public class Facade {

    Revisao r;

    public Facade() {
        ////this.r = r
        r = new Revisao();
    }

    public void iniciarRevisao() {
        System.out.println("Iniciando Revisão pelo sistema de interface do Façade");
        r = new Revisao();
        r.iniciarRevisao();
        r.notificarTodos();
        r.imprimeDados();

    }

}
