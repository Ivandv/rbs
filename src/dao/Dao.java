/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author Ivan
 */
public interface Dao {
  
    public void inserir(Object o);
    public void remover(Object o);
    public Object find(int id, String name);
    public List<Object> findAll();
    
}
