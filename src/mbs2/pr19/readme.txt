FTN / Katedra za informatiku
Mrezno bazirani sistemi 2 / 2008.
=================================

1. Lokacija primera
-------------------
yu.ac.ns.ftn.informatika.mbs2.pr19

2. Opis primera
---------------
Primer kompletne web aplikacije koja se sastoji iz sledecih delova:
- entity klase kao model podataka aplikacije
- DAO (data access object) SLSB-ovi koji implementiraju operacije nad 
  entitijima (tj. nad bazom podataka)
- SLSB-ovi koji implementiraju posebne funkcije obrade (npr. procesiranje 
  kreditne kartice)
- servleti koji predstavljaju kontrolere u web aplikaciji sa MVC arhitekturom, 
  pristupaju SLSB-ovima i entitijima
- JSP stranice koje predstavljaju prikaze (view) u MVC modelu
- konfiguracioni fajlovi za razlicite delove sistema

3. Sadrzaj primera
------------------
entity.*      - entity klase - model podataka
dao.*         - SLSB-ovi koji implementiraju pristup bazi
session.*     - SLSB-ovi za procesiranje placanja
jsp.*         - JSP stranice kao view iz MVC modela
servlet.*     - servleti kao kontroleri iz MVC modela
manifest.*    - konfiguracioni fajlovi

4. Pokretanje primera
---------------------
1. Iskopirati easybeans.xml u $CATALINA_HOME/webapps/ow2-easybeans-hibernate-1.1.0/WEB-INF/classes
2. Iskopirati mysql-connector-java-5.1.18-bin.jar u u $CATALINA_HOME/webapps/ow2-easybeans-hibernate-1.1.0/WEB-INF/lib
3. ant deploy
4. http://localhost:8080/pr19/
(obratite paznju na sadrzaj fajla build.properties, treba podesiti direktorijume)
