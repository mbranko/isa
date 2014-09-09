package isa.pr03;

import java.util.Properties;

import javax.naming.NamingEnumeration;
import javax.naming.directory.Attributes;
import javax.naming.directory.BasicAttribute;
import javax.naming.directory.BasicAttributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchResult;

public class LDAPClient {
  public static void main(String[] args) {
    try {
      Properties env = new Properties();
      // klasa za kreiranje inicijalnog konteksta
      env.put("java.naming.factory.initial",
        "com.sun.jndi.ldap.LdapCtxFactory");
      // adresa LDAP servera i inicijalni kontekst
      env.put("java.naming.provider.url",
        "ldap://ldap.ftninformatika.com:389");
      // kreiramo inicijalni kontekst
      DirContext ctx = new InitialDirContext(env);

      // Navodimo koje atribute trazimo
      Attributes match = new BasicAttributes(true); // ignore case
      match.put(new BasicAttribute("uid", "branko.milosavljevic"));

      // Postavljamo upit u okviru podkonteksta
      // dc=informatika, dc=com
      NamingEnumeration<SearchResult> answer = ctx.search(
          "dc=ftninformatika,dc=com", match);

      // ispisujemo rezultate upita
      while (answer.hasMore()) {
        SearchResult sr = answer.next();
        System.out.println("Objekat: " + sr.getAttributes());
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
