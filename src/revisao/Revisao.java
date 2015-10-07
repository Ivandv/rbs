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
    private ArrayList<Pessoa> revisores; //verificar a necessidade de uma lista de revisores para notifica-los
    
    public Revisao() {
        this.t = new RevisaoPapers();
        this.criterios = new ArrayList<>();
        this.avaliacao = new ArrayList<>();
        this.revisores = new ArrayList<>();
        //inseridos valores para tentar construir o fluxo da revisao
        
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
        this.notificarTodos();
    }
    @Override
    public void removeObserver(Pessoa p) {
        System.out.println("Removendo " + p.getNome()+ "....");
        this.notificarTodos();
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
        System.out.println("Imprimindo Dados da revisão criada ");
    }

    

    
}
