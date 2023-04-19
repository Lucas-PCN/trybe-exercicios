package com.trybe.agenda;

import java.util.HashMap;

public class AgendaMapa {
  private HashMap<String, String> agendaDeContatos = new HashMap<String, String>();

  public void incluirContato(String nome, String telefone) {
    agendaDeContatos.put(nome, telefone);
  }

  public void excluirContato(String nome) {
    agendaDeContatos.remove(nome);
  }

  public boolean verificaContato(String nome) {
    return agendaDeContatos.containsKey(nome);
  }

  public int tamanhoAgenda() {
    return agendaDeContatos.size();
  }

  public void atualizarTelefone(String nome, String telefone) {
    agendaDeContatos.put(nome, telefone);
  }

  public String obterTelefone(String nome) {
    return agendaDeContatos.get(nome);
  }
}
