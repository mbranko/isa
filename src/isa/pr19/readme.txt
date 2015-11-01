FTN / Katedra za informatiku
Mrezno bazirani sistemi 2 / 2008.
=================================

1. Lokacija primera
-------------------
yu.ac.ns.ftn.informatika.isa.pr19

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
- REST API za udaljene klijente
- konfiguracioni fajlovi za razlicite delove sistema

3. Sadrzaj primera
------------------
entity.*      - entity klase - model podataka
dao.*         - SLSB-ovi koji implementiraju pristup bazi
session.*     - SLSB-ovi za procesiranje placanja
jsp.*         - JSP stranice kao view iz MVC modela
servlet.*     - servleti kao kontroleri iz MVC modela
rest.*        - resursi za REST API

4. Pokretanje primera
---------------------
1. Iskopirati MySQL JDBC drajver u $CATALINA_HOME/lib
2. Iskopirati Jackson JSON parser u $CATALINA_HOME/lib
3. ant build
4. http://localhost:8080/pr19/
(obratite paznju na sadrzaj fajla tomee.properties, treba podesiti direktorijume)
5. isprobati API na http://localhost:8080/
- GET /pr19/api/users/login
- GET /pr19/api/orders/1
- POST /pr19/api/orders sa telom:
{
  "user": { "id": 1},
  "date": 1416986925000,
  "items": [
    {
      "quantity": 2,
      "product": { "id": 1}
    },
    {
      "quantity": 5,
      "product": { "id": 2}
    }
  ]
}
