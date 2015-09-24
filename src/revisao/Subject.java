/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;


import java.util.Observer;
import revisor.Pessoa;

/**
 *
 * @author Ivan
 */
public interface Subject extends Observer{
    public void addObserver(Pessoa p);
    public void removeObserver(Pessoa p);
    public void notificarTodos();
}
