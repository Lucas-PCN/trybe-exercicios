package com.trybe.gerarpessoausuaria;

/**
 * Coment.
 *
 */
public class Usuario extends Pessoa {

  public Usuario(String nome, String sobrenome) {
    super(nome, sobrenome);
  }

  /**
   * Método para pegar o nome e sobrenome do usuário.
   *
   */
  public String getUsuario() {
    if (super.nome == null || super.sobrenome == null || super.nome.isEmpty()
            || super.sobrenome.isEmpty()) {
      return "Usuário inválido";
    } else {
      return super.nome + "." + super.sobrenome;
    }
  }
}
