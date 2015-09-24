/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisor;

import java.util.Observable;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Ivan
 */
public class Revisor extends Pessoa {

    String name;

    public Revisor(String name) {
        this.name = name;
    }
    
    
    
    public Revisor() {
    }



    @Override
    public void notificar() {
        System.out.println("Atualizando Objeto"+ this.name+".....");
    }
}
