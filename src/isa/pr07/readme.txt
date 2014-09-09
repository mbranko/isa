FTN / Katedra za informatiku
Internet softverske arhitekture / 2014.
=================================

1. Lokacija primera
-------------------
isa.pr07

2. Opis primera
---------------
Stateful session bean sa metodama za obradu life-cycle dogadjaja. 

3. Sadrzaj primera
------------------
Count.java          - remote interfejs
CountLocal.java     - local interfejs
CountBean.java      - bean klasa
CountClient.java    - klijentski program

4. Pokretanje primera
---------------------
[]$ ant deploy
[dist/pr07]$ java -jar Client.jar
