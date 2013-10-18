FTN / Katedra za informatiku
Mrezno bazirani sistemi 2 / 2013.
=================================

1. Lokacija primera
-------------------
mbs2.pr06

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
