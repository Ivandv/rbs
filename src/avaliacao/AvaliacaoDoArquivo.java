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
public abstract class AvaliacaoDoArquivo {
   private Pessoa primeiroRevisor; 
   private ArquivoDoEstudo arquivo;
   String status;
   
   public abstract void designar();

    public AvaliacaoDoArquivo(Pessoa primeiroRevisor, ArquivoDoEstudo arquivo, String status) {
        this.primeiroRevisor = primeiroRevisor;
        this.arquivo = arquivo;
        this.status = status;
    }

    public Pessoa getPrimeiroRevisor() {
        return primeiroRevisor;
    }

    public void setPrimeiroRevisor(Pessoa primeiroRevisor) {
        this.primeiroRevisor = primeiroRevisor;
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
   
   
}
