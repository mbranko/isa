package mbs2.pr18;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PurchaseServlet extends HttpServlet {

  // Veza servleta i session beana preko dependency injection
  @EJB
  PurchaseLocal purchase;
  
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException, ServletException {
    
    response.setContentType("text/html; charset=utf-8");
    request.setCharacterEncoding(response.getCharacterEncoding());
    try {
      String cardNumber = request.getParameter("cardNumber");
      String cardHolder = request.getParameter("cardHolder");
      int expiryYear = Integer.parseInt(request.getParameter("expiryYear"));
      int expiryMonth = Integer.parseInt(request.getParameter("expiryMonth"));
      CreditCard card = new CreditCard(expiryMonth, expiryYear, cardHolder, 
          cardNumber);
      Order order = new Order(card, new Date(), new ArrayList<String>(), 
          new ArrayList<Integer>(), new BigDecimal(200.00));
      boolean status = purchase.processOrder(order);
      printSuccess(response, status);
    } catch (Exception ex) {
      printError(response, ex);
    }
  }
  
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws IOException, ServletException {
    doGet(request, response);
  }
  
  private void printError(HttpServletResponse response, Exception ex) 
      throws IOException {
    PrintWriter out = response.getWriter();
    out.println("<html><body><h1>Error</h1><pre>");
    StringWriter sw = new StringWriter();
    ex.printStackTrace(new PrintWriter(sw));
    out.println(sw.toString());
    out.println("</pre></body></html>");
    out.close();
  }

  private void printSuccess(HttpServletResponse response, boolean status) 
      throws IOException {
    PrintWriter out = response.getWriter();
    out.println("<html><body><h1>Order processed</h1> Status: ");
    out.println(status ? "processed" : "not processed");
    out.println("</body></html>");
    out.close();
  }
}
