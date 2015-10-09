/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import parametros.Criterios;
import parametros.FontesDeBusca;
import parametros.PalavrasChave;
import parametros.StringDeBusca;
import revisor.Pessoa;

/**
 *
 * @author Ivan
 */
public abstract class Template {

    public abstract void hook();
    
    public void definirPergunta(String pergunta) {
        System.out.println("Definindo pergunta.......");
        System.out.println(pergunta);
    }

    public void inserirRevisor(Pessoa p) {
        System.out.println(p.getClass() + " Inserido na revisao....");
    }

    public void definirConfiguracoes() {
        System.out.println("Definindo Configurações.....");
    }

    public void definirFontesDisponiveis() {
        System.out.println("Escolhendo Fontes de Dados Disponíveis....");
    }

    public void preencherCredenciais() {
        System.out.println("Preenchendo Credenciais para Acesso as fontes....");
    }

    public void definirPalavrasChave() {
        System.out.println("Definindo Palavras Chave....");
    }

    public void definirCriterios() {
        System.out.println("Definindo Critérios de Inclusão e Exclusão....");
    }

    public void gerarBusca(StringDeBusca s, ArrayList<FontesDeBusca> fontes) {
        System.out.println("Gerando Busca de Estudos......");
        System.out.println(s);
        for(FontesDeBusca f : fontes){
            if(f.getDescricao() != null)
            System.out.println(f.getDescricao());
        }
        this.atribuirEstudos();
    }

    public void atribuirEstudos() {
        System.out.println("Atrbiuindo Estudos aos revisores.....");
    }

    public void avaliarEstudos() {
        System.out.println("Avaliando os estudos.........");
    }

    public final void iniciarRevisao() {
        String s = JOptionPane.showInputDialog("Informe a pergunta");
        this.definirConfiguracoes();
        this.definirPergunta(s);
        definirFontesDisponiveis();
        this.preencherCredenciais();
        hook();
    }

    public void finalizarRevisao() {
        System.out.println("Finalizando A Revisão Sistemática..........");
    }
}
