/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao;

import arquivo.ArquivoDoEstudo;
import java.util.ArrayList;
import revisor.Pessoa;

/**
 *
 * @author Ivan
 */
public class DoisRevisores extends AvaliacaoDoArquivo{
    private Pessoa revisorSecundario;
    private ArrayList<Pessoa> revisoresSecundarios;
    public DoisRevisores(Pessoa primeiroRevisor, ArquivoDoEstudo arquivo, String status) {
        super(primeiroRevisor, arquivo, status);
    }


    @Override
    public void designar() {
        this.revisoresSecundarios.add(revisorSecundario);
    }

    public Pessoa getRevisorSecundario() {
        return revisorSecundario;
    }

    public void setRevisorSecundario(Pessoa revisorSecundario) {
        this.revisorSecundario = revisorSecundario;
    }
    
    public void toStringRevisores(){
        for(Pessoa p : revisoresSecundarios){
            System.out.println("Revisores responsaveis pelo estudo"+ p.getNome());
        }
    }
    
    
}
