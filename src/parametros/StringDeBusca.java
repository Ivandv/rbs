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
public class StringDeBusca implements IParametros {

    int id;
    String stringBusca;
    
    
    public StringDeBusca() {
    }

    @Override
    public void adicionarCriterios() {
        //definir atribuicao da string
    
    }

    public StringDeBusca(int id, String stringBusca) {
        this.id = id;
        this.stringBusca = stringBusca;
    }
    
    
}
