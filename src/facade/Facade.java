/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import revisao.Revisao;
import revisor.Revisor;

/**
 *
 * @author Ivan
 */
public class Facade extends Revisao {
   
   
   @Override
   public void iniciarRevisao(){
       System.out.println("Iniciando Revisão pelo sistema de interface");
       super.iniciarRevisao();
       
   }
    

}
