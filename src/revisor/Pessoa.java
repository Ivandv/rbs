/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisor;

import observer.*;

/**
 *
 * @author Ivan
 */
public abstract class Pessoa implements Observer {

    @Override
    public abstract void notificar();
    
}
