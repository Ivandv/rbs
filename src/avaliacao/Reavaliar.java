/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao;

import revisor.Pessoa;

/**
 *
 * @author Ivan
 */
public class Reavaliar extends AvaliacaoDoArquivo {

    Pessoa revisorSecundario;
    Pessoa revisorFinal;
    public Reavaliar() {
    }

    @Override
    public void avaliarEstudo() {
        if(revisorFinal == null){
        System.out.println("Este Arquivo está sob reavaliação de"+ revisorSecundario.toString());
        }else
        System.out.println("Este Arquivo está sob reavaliação de"+ revisorFinal.toString());
    }
    
    
}
