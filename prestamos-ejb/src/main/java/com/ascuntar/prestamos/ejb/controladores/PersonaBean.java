/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ascuntar.prestamos.ejb.controladores;

import com.ascuntar.prestamos.bo.pruebaBO;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author martin
 */
@Named
@Stateless
@LocalBean
public class PersonaBean {

    private int numero;
    @Inject
    pruebaBO pruebabo;

    public void prueba() {
        System.out.println("probando");
        pruebabo.pruebaMetodo(numero);
    }

    public void businessMethod() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
