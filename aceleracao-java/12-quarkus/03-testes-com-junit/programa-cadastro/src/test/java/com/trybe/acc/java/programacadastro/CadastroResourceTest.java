package com.trybe.acc.java.programacadastro;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import com.trybe.acc.java.programacadastro.bean.DadosCadastro;
import com.trybe.acc.java.programacadastro.bean.DadosRetornoCadastro;
import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * CadastroResourceTest test class.
 */
@QuarkusTest
public class CadastroResourceTest {

  @Test
  @DisplayName("1 - Cadastra um cliente com sucesso.")
  public void testCadastroSucesso() {
    DadosCadastro dadosCadastro = new DadosCadastro();
    dadosCadastro.setNome("Lucas Pereira");
    dadosCadastro.setEmail("lucas@test.com");
    dadosCadastro.setProtegido(false);

    given()
        .contentType(ContentType.JSON)
        .body(dadosCadastro)
        .when()
        .post("/cadastro")
        .then()
        .statusCode(200)
        .body("nome", is("Lucas Pereira"))
        .body("email", is("lucas@test.com"))
        .body("protegido", is(false));
  }

  @Test
  @DisplayName("2 - Tenta cadastrar um cliente sem nome e recebe dados inválidos.")
  public void testCadastroSemNome() {
    DadosCadastro dadosCadastro = new DadosCadastro();
    dadosCadastro.setEmail("lucas@test.com");
    dadosCadastro.setProtegido(false);

    given()
        .contentType(ContentType.JSON)
        .body(dadosCadastro)
        .when()
        .post("/cadastro")
        .then()
        .statusCode(400);
  }

  @Test
  @DisplayName("3 - Tenta cadastrar um cliente com nome vazio e recebe internal server error.")
  public void testCadastroNomeVazio() {
    DadosCadastro dadosCadastro = new DadosCadastro();
    dadosCadastro.setNome("");
    dadosCadastro.setEmail("lucas@test.com");

    given()
        .contentType(ContentType.JSON)
        .body(dadosCadastro)
        .when()
        .post("/cadastro")
        .then()
        .statusCode(500);

  }

  @Test
  @DisplayName("4 - Tenta obter um cadastro com id inválido e recebe bad request.")
  public void testObterSemId() {
    given()
        .when()
        .get("/cadastro/fdgjs")
        .then()
        .statusCode(400);
  }

  @Test
  @DisplayName("5 - Tenta obter um cadastro com id que não está cadastrado e recebe bad request.")
  public void testObterIdInexistente() {
    given()
        .when()
        .get("/cadastro/555")
        .then()
        .statusCode(400);
  }

  @Test
  @DisplayName("6 - Tenta obter um cadastro protegido e recebe status 403.")
  public void testObterIdProtegido() {
    DadosCadastro dadosCadastro = new DadosCadastro();
    dadosCadastro.setNome("Lucas Pereira");
    dadosCadastro.setEmail("lucas@test.com");
    dadosCadastro.setProtegido(true);

    DadosRetornoCadastro dataRetuned = RestAssured.given()
        .contentType(ContentType.JSON)
        .body(dadosCadastro)
        .when()
        .post("/cadastro")
        .then()
        .statusCode(200)
        .extract()
        .as(DadosRetornoCadastro.class);

    given()
        .when()
        .get("/cadastro/" + dataRetuned.getIdCadastro())
        .then()
        .statusCode(403);

  }

  @Test
  @DisplayName("7 - Obtém um cadastro com sucesso.")
  public void testObterSucesso() {
    DadosCadastro dadosCadastro = new DadosCadastro();
    dadosCadastro.setNome("Lucas Pereira");
    dadosCadastro.setEmail("lucas@test.com");
    dadosCadastro.setProtegido(false);

    DadosRetornoCadastro dataRetuned = RestAssured.given()
        .contentType(ContentType.JSON)
        .body(dadosCadastro)
        .when()
        .post("/cadastro")
        .then()
        .statusCode(200)
        .extract()
        .as(DadosRetornoCadastro.class);

    given()
        .when()
        .get("/cadastro/" + dataRetuned.getIdCadastro())
        .then()
        .statusCode(200)
        .body("nome", is("Lucas Pereira"))
        .body("email", is("lucas@test.com"));
  }

}
