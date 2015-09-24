/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import arquivo.ArquivoDoEstudo;
import java.awt.List;
import java.util.ArrayList;
import java.util.Observable;
import parametros.Criterios;
import parametros.Pergunta;
import parametros.StringDeBusca;
import revisor.Pessoa;
import revisor.Revisor;
import template.Template;

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
    ArrayList<Pessoa> revisores;
    ArrayList<ArquivoDoEstudo> arquivos;
    
    
    
    @Override
    public void addObserver(Pessoa p) {
        System.out.println("Inserindo novo "+ p.getClass()+".....");
    }

    @Override
    public void removeObserver(Pessoa p) {
        System.out.println("Removendo "+p.getClass()+"....");
    }

    @Override
    public void notificarTodos() {
        System.out.println("Notificando Todos os Observadores.....");
        this.notifyAll();
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Atualizando");
    }
    
    public void iniciarRevisao(){
        t.iniciarRevisao();
        t.inserirRevisor(new Revisor());
        t.definirPergunta();
        t.definirCriterios();
        t.definirPalavrasChave();
        t.definirConfiguracoes();
        t.definirFontesDisponiveis();
        t.preencherCredenciais();
        t.gerarBusca();
        t.atribuirEstudos();
        t.avaliarEstudos();
        t.finalizarRevisao();
    }

    public Revisao(Template t) {
        
        this.t = t;
    }
    
    

}
