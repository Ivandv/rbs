package app;

import arquivo.ArquivoDoEstudo;
import arquivo.PaperInJournal;
import facade.Facade;
import revisao.Revisao;
import revisor.Pessoa;
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
        /*Revisor r = new Revisor("Joao");

        Facade f = new Facade();
        f.iniciarRevisao();*/
        
       ArquivoDoEstudo artigoMeditec = new PaperInJournal();
       artigoMeditec.setPath("c:\\windows\\teste.txt");
        
       Pessoa juliano = new Revisor("Juliano");
       Pessoa ivan = new Revisor("Ivan");
       Pessoa arnaldo = new Revisor("Arnaldo");
       Pessoa rodrigo = new Revisor("Rodrigo");
       
        Revisao revisao = new Revisao();
        revisao.iniciarRevisao(ivan);
        
        System.out.println("\n\n:: Vamos convidar algumas pessoas para fazer parte dessa revisão ::");
        revisao.convidarRevisores(juliano);
        revisao.convidarRevisores(ivan);
        revisao.convidarRevisores(arnaldo);
        
        System.out.println("\n\n:: Revisores adicionados, posso comecar a fazer a revisao ::");
        
        String resposta = revisao.efetuarUmaAvaliacao(juliano, artigoMeditec);        
        revisao.addAvaliacao(juliano, artigoMeditec, resposta);        
        
        System.out.println("\n\n:: Revisão efetuada.. vamos exibir o resultado dentro do array ::");
        revisao.listarStatusTodasAvaliacoes();
        
        revisao.imprimeDados();
        System.out.println(".........................a partir deste ponto temos o sistema de interface agindo...........");
        Facade f = new Facade();
        f.iniciarRevisao(ivan);
        f.elaborarCriterios();
        f.elaborarPalavrasChave();
        f.elaborarBusca();
       
        
        
    }

}
