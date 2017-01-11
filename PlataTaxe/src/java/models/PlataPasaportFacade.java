/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Entities.PlataPasaport;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rox
 */
@Stateless
public class PlataPasaportFacade extends AbstractFacade<PlataPasaport> {

    @PersistenceContext(unitName = "PlataTaxePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlataPasaportFacade() {
        super(PlataPasaport.class);
    }
    
}
