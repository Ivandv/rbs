/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao;

import arquivo.ArquivoDoEstudo;
import revisor.Pessoa;

/**
 *
 * @author Ivan
 */
public  class AvaliacaoDoArquivo{
   private Pessoa revisor; 
   private ArquivoDoEstudo arquivo;
   private String status; 

    public AvaliacaoDoArquivo(Pessoa revisor, ArquivoDoEstudo arquivo, String status) {
        this.revisor = revisor;
        this.arquivo = arquivo;
        this.status = status;
    }

    public Pessoa getRevisor() {
        return revisor;
    }

    public void setRevisor(Pessoa revisor) {
        this.revisor = revisor;
    }  
   
    public ArquivoDoEstudo getArquivo() {
        return arquivo;
    }

    public void setArquivo(ArquivoDoEstudo arquivo) {
        this.arquivo = arquivo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AvaliacaoDoArquivo{" + "revisor=" + revisor.getNome() + ", arquivo=" + arquivo.getPath() + ", status=" + status + '}';
    }
    
    
   
   
}
