/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao;

/**
 *
 * @author Ivan
 */
public class Aprovado extends AvaliacaoDoArquivo {

    public Aprovado() {
    }

    @Override
    public void avaliarEstudo() {
        System.out.println("Este arquivo está aprovado");
    }
    
}
