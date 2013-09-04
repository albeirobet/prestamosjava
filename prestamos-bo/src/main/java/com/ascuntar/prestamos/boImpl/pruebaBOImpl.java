/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ascuntar.prestamos.boImpl;

import com.ascuntar.prestamos.bo.pruebaBO;
import com.ascuntar.prestamos.dao.PruebaDAO;
import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 *
 * @author root
 */
@Stateless
public class pruebaBOImpl implements pruebaBO{
    
    @Inject
    PruebaDAO pruebaDAO;
    @Override
    public void pruebaMetodo(int num) {
        System.out.println("Llegue al BOimpl con el numero:  "+num);
        pruebaDAO.pruebaDAO(num);
    }
    
}
