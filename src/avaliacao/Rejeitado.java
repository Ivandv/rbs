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
public class Rejeitado extends AvaliacaoDoArquivo{

    Pessoa revisorSegundario;
    Pessoa revisorFinal;
    public Rejeitado() {
    }

    @Override
    public void avaliarEstudo() {
        System.out.println("Este arquivo foi rejeitado pelo(s) revisor(es)"+ revisorSegundario.toString()+" "+ revisorFinal.toString());
    }
    
    
}
