package com.website;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class App extends HttpServlet {

  private String message;

  public void init() throws ServletException {
    message = "Hello World! How's tricks?";
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Set response content type
    response.setContentType("text/html");

    // Actual logic goes here.
    final PrintWriter out = response.getWriter();
    out.println("<h1>" + message + "</h1>");
  }
}
