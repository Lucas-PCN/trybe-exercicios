package com.trybe.acc.java.planejadorviagens.challenge;

import com.trybe.acc.java.planejadorviagens.model.Country;
import com.trybe.acc.java.planejadorviagens.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlanejandoDestino {

  private String[] paises = new String[] {
    "BRASIL",
    "ARGENTINA",
    "URUGUAI",
    "PANAMA",
  };

  private String[] capitais = new String[] {
    "BRASILIA",
    "BUENOS AIRES",
    "MONTEVIDEO",
    "CIDADE DO PANAMA",
  };

  private String[] ddis = new String[] {
    "+55",
    "+54",
    "+598",
    "+507",
  };


  @Autowired
  private CountryRepository countryRepository;


  /**
   * Method inserir.
   */
  public void inserir() {
    for (int i = 0; i < paises.length; i += 1) {
      Country country = new Country();
      country.setName(paises[i]);
      country.setCapital(capitais[i]);
      countryRepository.save(country);
    }
  }

  /**
   * Method corrigir.
   */
  public void corrigir() {
    for (int i = 0; i < paises.length; i += 1) {
      Country country = countryRepository.findByName(paises[i]).get(0);
      country.setDdi(ddis[i]);
      countryRepository.save(country);
      
    }
  }

  /**
   * Method excluir.
   */
  public void excluir() {
    Country country = countryRepository.findByName(paises[paises.length - 1]).get(0);
    countryRepository.delete(country);
  }
}
