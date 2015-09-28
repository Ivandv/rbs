/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisor;

import java.util.Date;
import observer.*;
import sun.security.rsa.RSASignature;


/**
 *
 * @author Ivan
 */
public abstract class Pessoa implements Observer {

    int id;
    String nome;
    String email;
    String senha;
    Date dataCriacao;
    Date dataAcesso;

    public Pessoa() {
        dataAcesso = new Date();
    }

    public Pessoa(String nome, String email, String senha, Date dataAcesso) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataAcesso = dataAcesso;
    }
    
    
    
    
    @Override
    public abstract void notificar();
    
}
