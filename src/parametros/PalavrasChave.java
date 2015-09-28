/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parametros;

import java.util.ArrayList;

/**
 *
 * @author Ivan
 */
public class PalavrasChave implements IParametros {

    int id;
    ArrayList<String> listPalavras;
    
    public PalavrasChave() {
        listPalavras = new ArrayList<>();
    }

    @Override
    public void adicionarCriterios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
