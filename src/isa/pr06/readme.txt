FTN / Katedra za informatiku
Internet softverske arhitekture / 2014.
=================================

1. Lokacija primera
-------------------
isa.pr06

2. Opis primera
---------------
Primer elementarnog stateful session beana. Radi ilustracije moze se pokrenuti
vise klijenata istovremeno, gde ce svaki od njih pozivati svoj primerak beana.

3. Sadrzaj primera
------------------
Count.java       - remote interfejs
CountLocal.java  - local interfejs
CountBean.java   - bean klasa
CountClient.java - klijentski program

4. Pokretanje primera
---------------------
[]$ ant deploy
[dist/pr06]$ java -jar Client.jar

5. TomEE 7.0.x podesavanje
--------------------------
U fajlu conf/system.properties treba da stoje sledeca tri parametra:
tomee.remote.support = true
tomee.serialization.class.blacklist = -
tomee.serialization.class.whitelist = *
