/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametros;

/**
 *
 * @author Ivan
 */
public class Pergunta implements IParametros{
    
    int id;
    String pergunta;
    
    @Override
    public void adicionarCriterios() {
        System.out.println("Inserido pergunta..............");
    }
    
}
