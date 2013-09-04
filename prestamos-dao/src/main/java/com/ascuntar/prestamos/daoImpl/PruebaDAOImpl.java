/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ascuntar.prestamos.daoImpl;

import com.ascuntar.prestamos.dao.PruebaDAO;
import com.ascuntar.prestamos.dm.entidades.Departamento;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author root
 */
@Stateless
public class PruebaDAOImpl implements PruebaDAO {

    @PersistenceContext(unitName = "prestamos-PU")
    private EntityManager em;

    @SuppressWarnings("unchecked")
   
    
    

    public void pruebaFuncion() {
        System.out.println("Llegue al pruebaFuncion del PruebaJpaDAO");
        List<Departamento> listaDepartamentos = new ArrayList<Departamento>();
        try {
            String jpql = "SELECT dep FROM " + Departamento.class.getSimpleName() + " dep ";
            Query query = em.createQuery(jpql);
            listaDepartamentos = query.getResultList();
            System.out.println("El tamaño de la lista Departamentos es:  " + listaDepartamentos.size());
        } catch (Exception e) {
            System.out.println("Se presentro un error al realizar la consulta de Departamentos:  " + e);
        }
    }

    @Override
    public void pruebaDAO(int numero) {
        System.out.println("Llegue al pruebaDAOIMPL con el numerito:  " + numero);
        pruebaFuncion();
    }
}
