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
public class Criterios implements IParametros{

    int id;
    ArrayList<String> inclusao = new ArrayList<>();
    ArrayList<String> exclusao = new ArrayList<>();
    
    @Override
    public void adicionarCriterios() {
         int op=0;
         String s="";
         switch(op){
             case 1: inserirInclusao(s);
                break;
             case 2: removerInclusao(s);
                break;
             case 3: inserirExclusao(s);
                break;
             case 4: removerExclusao(s);
                break;
            
         }
             
    }
    
    public void inserirInclusao(String p){
        inclusao.add(p);
    }
    
    public void removerInclusao(String p){
        if (inclusao.contains(p))
            inclusao.remove(p);
        else
            System.out.println("Este Critério não existe nesta base");
    }
    
    public void inserirExclusao (String p){
        exclusao.add(p);
    }
    
    public void removerExclusao(String p){
        if (exclusao.contains(p))
            exclusao.remove(p);
        else
            System.out.println("Este Critério não existe nesta base");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getInclusao() {
        return inclusao;
    }

    public void setInclusao(ArrayList<String> inclusao) {
        this.inclusao = inclusao;
    }

    public ArrayList<String> getExclusao() {
        return exclusao;
    }

    public void setExclusao(ArrayList<String> exclusao) {
        this.exclusao = exclusao;
    }

    public Criterios() {
        inclusao = new ArrayList<>();
        exclusao = new ArrayList<>();
    }

    public Criterios(int id) {
        this.id = id;
        inclusao = new ArrayList<>();
        exclusao = new ArrayList<>();
    }
    
    
    
    
}
