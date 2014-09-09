FTN / Katedra za informatiku
Internet softverske arhitekture / 2014.
=================================

1. Lokacija primera
-------------------
isa.pr12

2. Opis primera
---------------
Primeri za komunikaciju sa relacionom bazom podataka putem JDBC API-ja i
odgovarajuceg drajvera. Primeri su prilagodjeni za MySQL 5.0+. 

3. Sadrzaj primera
------------------
Db1.java            - postavljanje SELECT upita i citanje rezultata
Db2.java            - koriscenje PreparedStatement interfejsa
Db3.java            - pozivanje stored procedura
Db4.java            - primer servleta koji pristupa bazi podataka
TestRunner.java     - kreira semu baze i pokrece prva tri primera

4. Pokretanje primera
---------------------
[]$ ant deploy
[dist/pr12]$ java -jar DbExample.jar
(browser) http://localhost:8080/pr12/db4
