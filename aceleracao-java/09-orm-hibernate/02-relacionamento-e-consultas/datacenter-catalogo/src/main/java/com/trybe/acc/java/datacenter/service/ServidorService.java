package com.trybe.acc.java.datacenter.service;

import com.trybe.acc.java.datacenter.entity.Servidor;
import java.util.List;
import javax.persistence.EntityManager;

public class ServidorService implements ServiceInterface<Servidor, Long> {

  @Override
  public void save(Servidor servidor) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(servidor);
    em.getTransaction().commit();
    em.close();
  }


  @Override
  public void update(Servidor servidor) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.merge(servidor);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void delete(Long id) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    Servidor servidor = em.find(Servidor.class, id);
    em.remove(servidor);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public List<Servidor> list() {
    EntityManager em = emf.createEntityManager();
    List<Servidor> servidor = em.createQuery("from Servidor", Servidor.class).getResultList();
    em.close();
    return servidor;
  }

  @Override
  public Servidor findById(Long id) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    Servidor servidor = em.find(Servidor.class, id);
    em.close();
    return servidor;
  }
}
