/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisor;

import java.util.Date;
import observer.*;


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataAcesso() {
        return dataAcesso;
    }

    public void setDataAcesso(Date dataAcesso) {
        this.dataAcesso = dataAcesso;
    }

    public boolean getSenha(String s) {
        if (s.equals(this.senha) != true)
            return false;
        else
            return true;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
