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
    int id;
    Pessoa avaliador;
    ArquivoDoEstudo arquivoAvaliado;

    public AvaliacaoDoArquivo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(Pessoa avaliador) {
        this.avaliador = avaliador;
    }

    public ArquivoDoEstudo getArquivoAvaliado() {
        return arquivoAvaliado;
    }

    public void setArquivoAvaliado(ArquivoDoEstudo arquivoAvaliado) {
        this.arquivoAvaliado = arquivoAvaliado;
    }
    
    
    public abstract void avaliarEstudo();
}
