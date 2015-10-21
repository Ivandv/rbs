/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ivan
 */
public class DaoLocalDataBase implements Dao{
   private String connection;
   private String user;
   private String password;

    @Override
    public void inserir(Object o) {
        System.out.println("Inserindo Objeto no banco de dados local utilizando SQL");
    }

    @Override
    public void remover(Object o) {
        System.out.println("Removendo objeto do banco de dados local" );
    }

    @Override
    public Object find(int id, String name) {
        System.out.println("Buscando os objetos nas tabelas do banco dedados local");
        Object o = new Object();
        return o;
    }

    @Override
    public List<Object> findAll() {
        ArrayList<Object> lista = new ArrayList<>();
        System.out.println("Buscando todos os registros no banco de dados local");
        return lista;
    }
}
