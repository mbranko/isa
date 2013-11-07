FTN / Katedra za informatiku
Mrezno bazirani sistemi 2 / 2013.
=================================

1. Lokacija primera
-------------------
mbs2.pr14

2. Opis primera
---------------
Ilustracija problema objektno/relacionog mapiranja: podaci u Java programu
su smesteni u objektima, a treba ih prepisati u relacionu bazu putem JDBC
poziva koji su brojni. Potrebno je puno linija koda da bi se jedan objekat
sacuvao u bazi podataka. 

3. Sadrzaj primera
------------------
User.java           - klasa cije instance se cuvaju u bazi podataka
Test.java           - primer rukovanja podacima putem JDBC-a
TestRunner.java     - kreira semu baze i pokrece primer

4. Pokretanje primera
---------------------
[dist/pr14]$ java -jar pr14.jar
