FTN / Katedra za informatiku
Mrezno bazirani sistemi 2 / 2013.
=================================

1. Lokacija primera
-------------------
mbs2.pr16

2. Opis primera
---------------
Primer O/R mapiranja putem JPA biblioteke - klasa Admin se mapira na tabelu 
ADMINS u bazi podataka. Za operacije nad podacima u bazi koristi se objektni 
model i entity manager.

3. Sadrzaj primera
------------------
Admin.java      - anotirana perzistentna klasa
Test.java       - primer rada sa perzistentnom klasom i entity managerom
persistence.xml - konfiguracija entity managera

4. Pokretanje primera
---------------------
[dist/pr16] java -jar pr16.jar