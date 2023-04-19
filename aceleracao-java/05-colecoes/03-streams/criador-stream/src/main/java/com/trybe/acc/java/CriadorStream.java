package com.trybe.acc.java;

import java.util.List;
import java.util.stream.Stream;

/**
 * Class CriadorStream.
 */
public class CriadorStream {

  public <T> Stream<T> criarDoItem(T item) {
    return Stream.of(item);
  }
  
  public <T> Stream<T> criarDoArray(T[] array) {
    return Stream.of(array);
  }
  
  public <T> Stream<T> criarDaLista(List<T> lista) {
    return lista.stream();
  }
}
