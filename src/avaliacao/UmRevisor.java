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
public class UmRevisor extends AvaliacaoDoArquivo {

    public UmRevisor(Pessoa primeiroRevisor, ArquivoDoEstudo arquivo, String status) {
        super(primeiroRevisor, arquivo, status);
    }

    

    @Override
    public void designar() {
        System.out.println("Designando Arquivo"+ getArquivo().getPath()+" para o revisor"+ getPrimeiroRevisor().getNome());
    }
    
}
