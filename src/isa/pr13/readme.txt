FTN / Katedra za informatiku
Internet softverske arhitekture / 2014.
=================================

1. Lokacija primera
-------------------
isa.pr13

2. Opis primera
---------------
Primer pravilnog rukovanja JDBC konekcijama u serverskim aplikacijama: ukoliko
je za obradu zahteva potrebna konekcija, ona se dobija iz pool-a i vraca se u
pool odmah po zavrsetku obrade.

3. Sadrzaj primera
------------------
ConnectionPool.java  - singleton klasa koja obezbedjuje pooliranje konekcija
DBServlet.java       - servlet kao primer koriscenja poola
ConnectionPool.properties - konfiguracija poola

4. Pokretanje primera
---------------------
[]$ ant deploy
http://localhost:8080/pr13/db