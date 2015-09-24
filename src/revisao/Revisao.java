/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import arquivo.ArquivoDoEstudo;
import java.util.ArrayList;

import parametros.Criterios;
import parametros.Pergunta;
import parametros.StringDeBusca;
import revisor.Pessoa;
import revisor.Revisor;
import template.RevisaoPapers;
import template.Template;
import observer.*;

/**
 *
 * @author Ivan
 */
public class Revisao implements Subject {

    Template t;
    Pergunta p;
    StringDeBusca st;
    ArrayList<Criterios> criterios;
    Pessoa editor;
    ArrayList<Pessoa> revisores = new ArrayList<>();
    ArrayList<ArquivoDoEstudo> arquivos;

    public Revisao() {
        this.t = new RevisaoPapers();
    }

    public void iniciarRevisao(){
        t.iniciarRevisao();
    }
    
    
    @Override
    public void addObserver(Pessoa p) {
        System.out.println("Inserindo novo " + p.getClass() + ".....");
        revisores.add(p);
    }

    @Override
    public void removeObserver(Pessoa p) {
        System.out.println("Removendo " + p.getClass() + "....");
        revisores.remove(p);
    }

    @Override
    public void notificarTodos() {
        System.out.println("Notificando Todos os Observadores.....");
        for (Pessoa p : revisores) {
            p.notificar();
        }
    }

   

    public Revisao(Template t) {

        this.t = t;
    }

}
