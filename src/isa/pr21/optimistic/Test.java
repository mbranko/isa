package isa.pr21.optimistic;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
  
  public static void main(String[] args) {
    Logger.getLogger("").setLevel(Level.OFF);
    final EntityManagerFactory factory = 
      Persistence.createEntityManagerFactory("Bank");
    
    Thread t1 = new Thread() {
      public void run() {
        try {
          EntityManager em = factory.createEntityManager();
          em.getTransaction().begin();
          
          // ucitaj objekat
          System.out.println("[Thread 1] Ucitavam objekat...");
          BankAccount account = em.find(BankAccount.class, 1);

          // cekaj 10 sekundi
          System.out.println("[Thread 1] Cekam 10 sekundi...");
          try { Thread.sleep(10000); } catch (InterruptedException e) { }

          // dodaj 10000 na racun
          System.out.println("[Thread 1] Dodajem 10000 na racun...");
          account.deposit(new BigDecimal(10000));
          
          System.out.println("[Thread 1] Zavrsavam transakciju...");
          em.getTransaction().commit();
          em.close();
        } catch (Exception e) {
          System.out.println("GRESKA!!! [Thread 1] " + e.getMessage());
          //e.printStackTrace();
        }
      }
    };
    
    Thread t2 = new Thread() {
      public void run() {
        try {
          // cekaj 2 sekunde
          System.out.println("[Thread 2] Cekam 2 sekunde...");
          try { Thread.sleep(2000); } catch (InterruptedException e) { }
          
          EntityManager em = factory.createEntityManager();
          em.getTransaction().begin();
          
          // ucitaj objekat
          System.out.println("[Thread 2] Ucitavam objekat...");
          BankAccount account = em.find(BankAccount.class, 1);

          // skini 500 sa racuna
          System.out.println("[Thread 2] Skidam 500 sa racuna...");
          account.withdraw(new BigDecimal(500));

          System.out.println("[Thread 2] Zavrsavam transakciju  ...");
          em.getTransaction().commit();
          em.close();
        } catch (Exception e) {
          System.out.println("GRESKA!!! [Thread 2] " + e.getMessage());
          //e.printStackTrace();
        }
      }
    };

    t1.start();
    t2.start();
    
  }

}
