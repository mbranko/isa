package isa.pr18;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order implements Serializable {

  private Date date;
  private CreditCard creditCard;
  private List<String> items;
  private List<Integer> quantities;
  private BigDecimal total;

  public Order(CreditCard creditCard, Date date, List<String> items,
      List<Integer> quantities, BigDecimal total) {
    this.creditCard = creditCard;
    this.date = date;
    this.items = items;
    this.quantities = quantities;
    this.total = total;
  }
  public Order() {
  }

  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }
  public CreditCard getCreditCard() {
    return creditCard;
  }
  public void setCreditCard(CreditCard creditCard) {
    this.creditCard = creditCard;
  }
  public List<String> getItems() {
    return items;
  }
  public void setItems(List<String> items) {
    this.items = items;
  }
  public List<Integer> getQuantities() {
    return quantities;
  }
  public void setQuantities(List<Integer> quantities) {
    this.quantities = quantities;
  }
  public BigDecimal getTotal() {
    return total;
  }
  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  private static final long serialVersionUID = -5513610924045074136L;
}
