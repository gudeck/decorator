/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.*;
import domain.Roupa;
import java.util.ArrayList;

/**
 *
 * @author gudeck
 */
public class ControleDominio {

    private static ControleDominio uniqueInstance = new ControleDominio();
    private GenericDAO genericDao;

    private ControleDominio() {
        dao.ConexaoHibernate.getSessionFactory();
        genericDao = new GenericDAO();
    }

    public static ControleDominio getInstance() {
        return uniqueInstance;
    }

    public void createRoupa(Roupa roupa) {

        ArrayList<Roupa> listaRoupas = new ArrayList<>();
        Roupa aux = roupa;
        do {
            listaRoupas.add(aux);
            aux = aux.getRoupa();
        } while (aux != null);
        
        for (int i = listaRoupas.size() - 1; i >= 0; i--) {
            genericDao.create(listaRoupas.get(i));
        }

    }

}
