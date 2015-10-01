/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import avaliacao.AvaliacaoDoArquivo;
import java.util.ArrayList;

import parametros.Criterios;
import parametros.Pergunta;
import parametros.StringDeBusca;
import revisor.Pessoa;
import template.RevisaoPapers;
import template.Template;
import observer.*;
import revisor.Revisor;

/**
 *
 * @author Ivan
 */
public class Revisao implements Subject {

    private int id;
    private Template t;
    private Pergunta p;
    private StringDeBusca st;
    private ArrayList<Criterios> criterios;
    private Pessoa editor;
    private ArrayList<AvaliacaoDoArquivo> avaliacao;
    //verificar a necessidade de uma lista de revisores para notifica-los
    
    public Revisao() {
        this.t = new RevisaoPapers();
        this.criterios = new ArrayList<>();
        this.avaliacao = new ArrayList<>();
        //inseridos valores para tentar construir o fluxo da revisao
        p = new Pergunta(1,"O Sentido da vida, do universo e tudo mais");
        st = new StringDeBusca(1, "Sentido || Vida || UNIVERSO || Sentido do Universo || Sentido da Vida || Existencialismo || 42");
        Criterios e1 = new Criterios();
        e1.inserirInclusao("PDF");
        e1.inserirExclusao("Não Ser uma Poesia Vogon");
        e1.inserirExclusao("Ser antes da era da camisa de seda e corrente de prata");
        criterios.add(e1);
        String name = "Ford Prefect";
        editor = new Revisor(name) {
            
            @Override
            public void notificar() {
                System.out.println("Aqui não há ninguém para notificar, cuidado com o leopardo!");
            }
        };
        editor.notificar();
        //até aqui
    }

    public Revisao(Template t) {
        this.t = t;
    }

    public void iniciarRevisao() {
        t.iniciarRevisao();
    }

    @Override
    public void addObserver(Pessoa p) {
        System.out.println("Inserindo novo observador " +p.getNome()+ ".....");
        
    }
    @Override
    public void removeObserver(Pessoa p) {
        System.out.println("Removendo " + p.getNome()+ "....");
   
    }

    @Override
    public void notificarTodos() {
        System.out.println("Notificando Todos os Observadores.....");
    }

    public int getId() {
        return id;
    }

    public Template getTemplate() {
        return t;
    }

    public Pergunta getPergunta() {
        return p;
    }

    public void setPergunta(Pergunta p) {
        this.p = p;
    }

    public StringDeBusca getSringBusca() {
        return st;
    }

    public void setSringBusca(StringDeBusca st) {
        this.st = st;
    }

    public ArrayList<Criterios> getCriterios() {
        return criterios;
    }

    public Pessoa getEditor() {
        return editor;
    }

    public void setEditor(Pessoa editor) {
        this.editor = editor;
    }


    public boolean addCriterios(Criterios c) {
        try {
            this.criterios.add(c);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    

    
    public boolean addAvaliacaoDeArquivo(AvaliacaoDoArquivo a) {
        try {
            this.avaliacao.add(a);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Criterios findById(int id) {
        for (Criterios c : criterios) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    
    public void imprimeDados(){
        System.out.println("Esta é a revisao de: "+ editor.getNome());
    }

    

    
}
