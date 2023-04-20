package com.trybe.acc.java.datacenter.service;

import com.trybe.acc.java.datacenter.entity.Aplicacao;
import java.util.List;
import javax.persistence.EntityManager;

public class AplicacaoService implements ServiceInterface<Aplicacao, Long> {

  @Override
  public void save(Aplicacao aplicacao) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.persist(aplicacao);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void update(Aplicacao aplicacao) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    em.merge(aplicacao);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public void delete(Long id) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    Aplicacao aplicacao = em.find(Aplicacao.class, id);
    em.remove(aplicacao);
    em.getTransaction().commit();
    em.close();
  }

  @Override
  public List<Aplicacao> list() {
    EntityManager em = emf.createEntityManager();
    List<Aplicacao> aplicacoes = em.createQuery("from Aplicacao", Aplicacao.class).getResultList(); 
    em.close();
    return aplicacoes;
  }

  @Override
  public Aplicacao findById(Long id) {
    EntityManager em = emf.createEntityManager();
    em.getTransaction().begin();
    Aplicacao aplicacao = em.find(Aplicacao.class, id);
    em.close();
    return aplicacao;
  }

}
