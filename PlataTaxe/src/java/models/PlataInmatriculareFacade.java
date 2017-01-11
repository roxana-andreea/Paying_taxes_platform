/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Entities.PlataInmatriculare;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author rox
 */
@Stateless
public class PlataInmatriculareFacade extends AbstractFacade<PlataInmatriculare> {

    @PersistenceContext(unitName = "PlataTaxePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PlataInmatriculareFacade() {
        super(PlataInmatriculare.class);
    }
    
}
