FTN / Katedra za informatiku
Mrezno bazirani sistemi 2 / 2013.
=================================

1. Lokacija primera
-------------------
mbs2.pr05

2. Opis primera
---------------
Primer elementarnog stateless session beana.

3. Sadrzaj primera
------------------
Hello.java       - remote interfejs
HelloLocal.java  - local interfejs
HelloBean.java   - bean klasa
HelloClient.java - klijentski program

U serverski deo ulaze:
- mbs2.pr05.Hello
- mbs2.pr05.HelloLocal
- mbs2.pr05.HelloBean

U klijentski deo ulaze:
- mbs2.pr05.Hello
- mbs2.pr05.HelloClient
- EJB API (anotacije)
- JNDI provajder

4. Pokretanje primera
---------------------
[]$ ant deploy
[dist/pr05]$ java -jar Client.jar
