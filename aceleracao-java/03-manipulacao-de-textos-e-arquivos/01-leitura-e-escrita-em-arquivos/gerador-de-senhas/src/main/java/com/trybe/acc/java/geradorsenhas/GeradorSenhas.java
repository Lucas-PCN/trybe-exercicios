package com.trybe.acc.java.geradorsenhas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorSenhas {
  public static final Integer NUM_SENHAS = 10;

  // TROQUE O CAMINHO PARA O DIRETORIO DE DESTINO DOS SEUS ARQUIVOS
  public static final String DIRETORIO_DESTINO = "/home/turma-19-e-20-Tribo-B/aceleracao-java";

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    GeradorSenhas gerador = new GeradorSenhas();

    for (int i = 0; i < NUM_SENHAS; i++) {

      File arquivo = new File(DIRETORIO_DESTINO + File.separator + "arquivo_" + i + ".txt");
      String senha = gerador.gerarSenhaCompleta(i);

      try {
        gerador.escreverSenhaNoArquivo(senha, arquivo);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * Recebe uma senha e a escreve em arquivo.
   */
  public void escreverSenhaNoArquivo(String senha, File arquivo) throws IOException {
    FileWriter fileWriter = new FileWriter(arquivo);
    BufferedWriter writer = new BufferedWriter(fileWriter);
    
    writer.write(senha);
    writer.flush();
    writer.close();
  }

  /**
   * Gera senha completa a partir do índice.
   */
  public String gerarSenhaCompleta(int indice) {
    String[] partesDasSenhas = {"A5$2", "B55S", "CFFG", "D&54", "EEDF",
      "FEGG", "G15E", "H123", "I81F", "JWEF", "####"};

    String senhaCompleta = partesDasSenhas[indice] + partesDasSenhas[indice + 1];

    return senhaCompleta;
  }
}
