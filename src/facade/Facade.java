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
    Pessoa p;
    Revisao r;

    public Facade() {
        ////this.r = r
        r = new Revisao();
    }

    public void iniciarRevisao(Pessoa p) {
        System.out.println("Iniciando Revisão pelo sistema de interface do Facade");
        r.iniciarRevisao(p);
    }
    
    public void elaborarCriterios(){
        System.out.println("Elaborando a etapa de definição de critérios pelo sistema de interface facade");
        r.definirCriterios();
    }
    
    public void elaborarPalavrasChave(){
        System.out.println("Elaborando etapa de escolha da palavras-chave pelo sistema de interface facade");
        r.definirPalavrasChave();
    }
    
    public void elaborarBusca(){
        System.out.println("Elaborando o processo de montagem da busca pelo sistema de interface facade.....");
        r.efetuarBusca();
        r.notificarTodos();
    }
}
