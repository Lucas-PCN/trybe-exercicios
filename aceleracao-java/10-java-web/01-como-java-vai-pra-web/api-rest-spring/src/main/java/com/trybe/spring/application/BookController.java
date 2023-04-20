package com.trybe.spring.application;

import com.trybe.spring.domain.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.springframework.stereotype.Controller;

/**
 * Class BookController.
 */
@Controller
@Path("/api/books")
public class BookController {
  private List<Book> books = new ArrayList<Book>();

  @POST
  @Consumes("application/json")
  @Produces("application/json")
  public Response add(Book book) {
    books.add(book);
    return Response.ok(book).build();
  }

  @GET
  @Consumes("application/json")
  @Produces("application/json")
  public Response findAll() {
    return Response.ok(books).build();
  }

  /**
   * Find by id.
   */
  @GET
  @Path("/{id}")
  @Consumes("application/json")
  @Produces("application/json")
  public Response findById(@PathParam("id") UUID id) {
    try {
      Book book = books.stream().filter(b -> b.getId().equals(id)).findAny().orElseThrow();
      return Response.ok(book).build();
    } catch (NoSuchElementException e) {
      return Response.status(404).build();
    }
  }

  /**
   * Update.
   */
  @PUT
  @Path("/{id}")
  @Consumes("application/json")
  @Produces("application/json")
  public Response update(@PathParam("id") UUID id, Book book) {
    try {
      Book bookToUpdate = books.stream().filter(b -> b.getId().equals(id)).findAny().orElseThrow();
      bookToUpdate.setName(book.getName());
      bookToUpdate.setAuthor(book.getAuthor());
      return Response.ok(bookToUpdate).build();
    } catch (NoSuchElementException e) {
      return Response.status(404).build();
    }
  }


  /**
   * Delete.
   */
  @DELETE
  @Path("/{id}")
  @Consumes("application/json")
  @Produces("application/json")
  public Response delete(@PathParam("id") UUID id) {
    try {
      Book bookToDelete = books.stream().filter(b -> b.getId().equals(id)).findAny().orElseThrow();
      books.remove(bookToDelete);
      return Response.ok(bookToDelete).build();
    } catch (NoSuchElementException e) {
      return Response.status(404).build();
    }
  }


}
