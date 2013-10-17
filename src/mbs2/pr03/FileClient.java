package mbs2.pr03;

import java.io.File;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

public class FileClient {
  public static void main(String[] args) {
    try {
      Properties env = new Properties();
      // JNDI provajder
      env.put("java.naming.factory.initial",
        "com.sun.jndi.fscontext.RefFSContextFactory");
      // pocetni direktorijum
      env.put("java.naming.provider.url",
        "file:/home/branko");

      // kreiramo inicijalni kontekst
      Context ctx = new InitialContext(env);
      // lookup metoda ce vratiti instancu klase File
      // ako se radi o datoteci; ukoliko je u pitanju
      // direktorijum, vratice novu Context instancu
      // koju koristimo na isti nacin kao i inicijalni 
      // kontekst
      File file = (File)ctx.lookup("fajl.txt");

      // sa dobijenom instancom rukujemo kao da je
      // kreirana na klasican nacin
      System.out.println("Filename: " +
        file.getAbsolutePath());
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
