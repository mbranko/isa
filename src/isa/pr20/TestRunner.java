package isa.pr20;

import isa.pr20.bean.PurchaseClient;
import isa.pr20.container.PurchaseClient2;

public class TestRunner {
  public static void main(String[] args) throws Exception {
    
    System.out.println("Pokrecem primer 20 / bean-managed transakcije...");
    PurchaseClient.main(new String[0]);
    System.out.println("Pokrecem primer 20 / container-managed transakcije...");
    PurchaseClient2.main(new String[0]);
    // Apache TomEE nema UserTransaction za remote klijente
    //System.out.println("Pokrecem primer 20 / client-managed transakcije...");
    //ClientTx.main(new String[0]);
  }
}
