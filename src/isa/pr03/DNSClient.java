package isa.pr03;

import java.util.Properties;

import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

public class DNSClient {
  public static void main(String[] args) {
    try {
      Properties env = new Properties();
      // klasa za kreiranje inicijalnog konteksta
      env.put("java.naming.factory.initial",
        "com.sun.jndi.dns.DnsContextFactory");
      // adresa DNS servera
      env.put("java.naming.provider.url",
        "dns://147.91.173.3/");
        //"dns://192.168.1.1/");

      // kreiramo inicijalni kontekst
      DirContext ctx = new InitialDirContext(env);

      // trazimo A slog za ime www.uns.ac.rs
      Attributes attrs =
        ctx.getAttributes("www.uns.ac.rs");
      Attribute attr = attrs.get("A");
      System.out.println("A za www.uns.ac.rs: " +
        attr.get());

      // trazimo MX slog za ime gmail.com
      attrs = ctx.getAttributes("gmail.com");
      attr = attrs.get("MX");
      System.out.println("MX za gmail.com: " +
        attr.get());
      
      env.put("java.naming.provider.url", 
          "dns://147.91.173.3/ac.rs");
      ctx = new InitialDirContext(env);
      attrs = ctx.getAttributes("www.uns.ac.rs");
      attr = attrs.get("A");
      if (attr == null)
        System.out.println("Nije pronadjen A za www.uns.ac.rs.ac.rs");
      else
        System.out.println("A za www.uns.ac.rs.ac.rs: " +
          attr.get());
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}

