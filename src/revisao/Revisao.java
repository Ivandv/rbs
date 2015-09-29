/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import arquivo.ArquivoDoEstudo;
import avaliacao.AvaliacaoDoArquivo;
import java.util.ArrayList;

import parametros.Criterios;
import parametros.Pergunta;
import parametros.StringDeBusca;
import revisor.Pessoa;
import template.RevisaoPapers;
import template.Template;
import observer.*;

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
    private ArrayList<Pessoa> revisores = new ArrayList<>();
    private ArrayList<ArquivoDoEstudo> arquivos;
    private ArrayList<AvaliacaoDoArquivo> arquivosAvaliados;

    public Revisao() {
        this.t = new RevisaoPapers();
        this.criterios = new ArrayList<>();
        this.revisores = new ArrayList<>();
        this.arquivos = new ArrayList<>();
        this.arquivosAvaliados = new ArrayList<>();
        //this.id  verificar incrementação do ID
    }

    public Revisao(Template t) {
        this.t = t;
    }

    public void iniciarRevisao() {
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

    public ArrayList<Pessoa> getRevisores() {
        return revisores;
    }

    public ArrayList<ArquivoDoEstudo> getArquivos() {
        return arquivos;
    }

    public ArrayList<AvaliacaoDoArquivo> getArquivosAvaliados() {
        return arquivosAvaliados;
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

    public boolean addRevisores(Pessoa p) {
        try {
            this.revisores.add(p);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addArquivos(ArquivoDoEstudo a) {
        try {
            this.arquivos.add(a);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean addAvaliacaoDeArquivo(AvaliacaoDoArquivo a) {
        try {
            this.arquivosAvaliados.add(a);
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

    public Pessoa findByIdPessoa(int id) {
        for (Pessoa pe : revisores) {
            if (pe.getId() == id) {
                return pe;
            }
        }
        return null;
    }
    
    public ArquivoDoEstudo findByIdArquivo(int id){
        for(ArquivoDoEstudo ade : arquivos){
            if(ade.getId() == id){
                return ade;
            }
        }
        return null;
    }
    
    public AvaliacaoDoArquivo findByIdAvaliacao(int id){
        for (AvaliacaoDoArquivo ada : arquivosAvaliados ){
            if(ada.getId() == id){
                return ada;
            }
        }
        return null;
    }
    
}
