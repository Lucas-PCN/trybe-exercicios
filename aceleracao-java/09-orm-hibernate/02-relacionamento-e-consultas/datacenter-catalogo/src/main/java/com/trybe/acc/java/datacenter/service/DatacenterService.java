package com.trybe.acc.java.datacenter.service;

import com.trybe.acc.java.datacenter.entity.Datacenter;
import java.util.List;
import javax.persistence.EntityManager;

public class DatacenterService implements ServiceInterface<Datacenter, Long> {

  @Override
  public void save(Datacenter datacenter) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(datacenter);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void update(Datacenter datacenter) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.merge(datacenter);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void delete(Long id) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    Datacenter datacenter = em.find(Datacenter.class, id);
    em.remove(datacenter);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public List<Datacenter> list() {
    EntityManager em = emf.createEntityManager();
    List<Datacenter> datac = em.createQuery("from Datacenter", Datacenter.class).getResultList(); 
    em.close();
    return datac;
  }

  @Override
  public Datacenter findById(Long id) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    Datacenter datacenter = em.find(Datacenter.class, id);
    em.close();
    return datacenter;
  }

}
