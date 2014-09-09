FTN / Katedra za informatiku
Internet softverske arhitekture / 2014.
=================================

1. Lokacija primera
-------------------
isa.pr15

2. Opis primera
---------------
Ilustracija problema objektno/relacionog mapiranja: podaci u Java programu
su smesteni u objektima, a treba ih prepisati u relacionu bazu putem JDBC
poziva koji su brojni. Za razliku od prethodnog primera, JDBC pozivi su
"sakriveni" u klasi cije instance se cuvaju u bazi podataka, tako da je
koriscenje ove klase sada znatno jednostavnije. 

3. Sadrzaj primera
------------------
User.java           - klasa cije instance se cuvaju u bazi podataka
Test.java           - primer rukovanja podacima putem JDBC-a
TestRunner.java     - kreira semu baze i pokrece primer

4. Pokretanje primera
---------------------
[dist/pr15]$ java -jar pr15.jar
