/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testeback.dao;

import com.mycompany.testeback.entity.ContaCliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author SUPORTE116
 */
public class ContaClienteDAO {
    
    //método utilizado para obter o entityManager
    private EntityManager getEntityManager(){
        EntityManagerFactory factory = null;
        EntityManager em = null;
        try{
            factory = Persistence.createEntityManagerFactory("BackPU");
            em = factory.createEntityManager();
        }finally{
            factory.close();
        }
        return em;
    }
    
    public ContaCliente salvar(ContaCliente c)throws Exception{
        EntityManager em = getEntityManager();
        try{
            em.getTransaction().begin();
            
            //verifica se a conta ainda não esta salva no banco
            if(c.getId_customer() == null){
                em.persist(c);
            }else{
                c = em.merge(c);
            }
            em.getTransaction().commit();
        }finally{
            em.close();
        }
        return c;
    }
}
