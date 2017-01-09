/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Entities.Autentificare;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rox
 */
@Stateless
public class AutentificareFacade extends AbstractFacade<Autentificare> {

    @PersistenceContext(unitName = "PlataTaxePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AutentificareFacade() {
        super(Autentificare.class);
    }
    
}
