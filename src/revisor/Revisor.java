/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisor;

/**
 *
 * @author Ivan
 */
public class Revisor extends Pessoa {

    String graduacao;
    String instituicao;

    
    public Revisor(String name) {
        this.nome = name;
    }

    public Revisor() {
    }
    
    @Override
    public void notificar() {
        System.out.println("Atualizando Objeto" + this.nome + ".....");
    }
}
