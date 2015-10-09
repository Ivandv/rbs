/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametros;

import java.util.Date;

/**
 *
 * @author Ivan
 */
public class FontesDeBusca {
    private int id;
    private String descricao;
    private String url;
    private boolean credencial;
    private String login;
    private String senha;
    private boolean status;
    private Date dataVerificao;

    public FontesDeBusca(int id, String descricao, String url, boolean credencial, String login, String senha, boolean status, Date dataVerificao) {
        this.id = id;
        this.descricao = descricao;
        this.url = url;
        this.credencial = credencial;
        this.login = login;
        this.senha = senha;
        this.status = status;
        this.dataVerificao = dataVerificao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUrl() {
        return url;
    }

    public boolean isCredencial() {
        return credencial;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isStatus() {
        return status;
    }

    public Date getDataVerificao() {
        return dataVerificao;
    }

    
}
