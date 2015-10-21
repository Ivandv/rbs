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
public class DaoCloud implements Dao {
    private String user;
    private String pass;

    @Override
    public void inserir(Object o) {
        System.out.println("Inserindo registros na base de dados na nuvem");
    }

    @Override
    public void remover(Object o) {
        System.out.println("Removendo registros na base de dados na nuvem");
    }

    @Override
    public Object find(int id, String name) {
        System.out.println("Buscando registro na base de dados da nuvem");
        Object o = new Object();
        return o;
    }

    @Override
    public List<Object> findAll() {
        System.out.println("Retornando todos os registros da base de dados da nuvem");
        ArrayList<Object> lista = new ArrayList<>();
        return lista;
    }
}

