/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.*;

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

}
