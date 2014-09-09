package isa.pr20.client;

import isa.pr20.container.Purchase;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.transaction.UserTransaction;

/**
 * Rucno upravljanje transakcijom sa strane klijenta.
 */
public class ClientTx {

  public static void main(String[] args) {
    System.setProperty(Context.INITIAL_CONTEXT_FACTORY, 
        "org.apache.openejb.client.RemoteInitialContextFactory");
    System.setProperty(Context.PROVIDER_URL, 
        "http://localhost:8080/tomee/ejb");
    try {
      Context ctx = new InitialContext();
      Purchase purchase = (Purchase) ctx.lookup(
          "Purchase20ContainerRemote");

      UserTransaction tx = (UserTransaction)ctx.lookup(
          "java:comp/UserTransaction");
      tx.begin();
      boolean status = purchase.processOrder(null, null);
      if (status)
        tx.commit();
      else
        tx.rollback();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
