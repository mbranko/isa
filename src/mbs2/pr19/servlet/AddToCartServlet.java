package mbs2.pr19.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mbs2.pr19.entity.OrderItem;
import mbs2.pr19.entity.Product;
import mbs2.pr19.entity.PurchaseOrder;

public class AddToCartServlet extends HttpServlet {
  
  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("UTF8");
    ServletContext ctx = getServletConfig().getServletContext();
    HttpSession session = request.getSession(true);
    
    try {
      String sQuantity = request.getParameter("quantity");
      int quantity = Integer.parseInt(sQuantity);
      Product prod = (Product)session.getAttribute("product");
      PurchaseOrder order = (PurchaseOrder)session.getAttribute("order");
      if (order == null) {
        order = new PurchaseOrder();
        order.setDate(new Date());
        session.setAttribute("order", order);
      }
      OrderItem item = new OrderItem();
      item.setOrder(order);
      item.setProduct(prod);
      item.setQuantity(quantity);
      order.add(item);

      ctx.getRequestDispatcher("/cart.jsp").forward(request, response);
    } catch (Exception ex) {
      throw new ServletException(ex);
    }
  }

}
