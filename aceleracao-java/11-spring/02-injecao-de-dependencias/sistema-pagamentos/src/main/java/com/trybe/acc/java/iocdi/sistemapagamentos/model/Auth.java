package com.trybe.acc.java.iocdi.sistemapagamentos.model;

/**
 * Auth class.
 */
public class Auth {
  private String usuario;
  private String senha;
  private String nivelDeAcesso;

  /**
   * Auth constructor.
   */
  public Auth(String usuario, String senha, String nivelDeAcesso) {
    this.usuario = usuario;
    this.senha = senha;
    this.nivelDeAcesso = nivelDeAcesso;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getNivelDeAcesso() {
    return nivelDeAcesso;
  }

  public void setNivelDeAcesso(String nivelDeAcesso) {
    this.nivelDeAcesso = nivelDeAcesso;
  }
}
