
import facade.Facade;
import revisor.Revisor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan
 */
public class Main{
    
    public static void main(String[] args) {
        Facade f = new Facade();
        f.iniciarRevisao();
        f.addObserver(new Revisor());
        f.removeObserver(new Revisor());
        f.notificarTodos();
    }
    
}
