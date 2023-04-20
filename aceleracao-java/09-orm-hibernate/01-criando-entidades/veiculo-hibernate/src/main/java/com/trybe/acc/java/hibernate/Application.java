package com.trybe.acc.java.hibernate;

import com.trybe.acc.java.hibernate.entity.Veiculo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 * Class Application.
 */
public class Application {

  /**
   * Método principal.
   * 
   * @param args argumentos da linha de comando
   */
  public static void main(String[] args) {
    Veiculo veiculo = new Veiculo();
    veiculo.setAno(2016);
    veiculo.setModelo("HB20");
    veiculo.setQuilometragem("40000");
    
    EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("com.trybe.acc.java.hibernate.veiculo-hibernate");
    EntityManager em = emf.createEntityManager();
    
    em.getTransaction().begin();
    em.persist(veiculo);
    em.getTransaction().commit();
    em.close();
  }

}
