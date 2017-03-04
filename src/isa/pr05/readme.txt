FTN / Katedra za informatiku
Internet softverske arhitekture / 2014.
=================================

1. Lokacija primera
-------------------
isa.pr05

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
- isa.pr05.Hello
- isa.pr05.HelloLocal
- isa.pr05.HelloBean

U klijentski deo ulaze:
- isa.pr05.Hello
- isa.pr05.HelloClient
- EJB API (anotacije)
- JNDI provajder

4. Pokretanje primera
---------------------
[]$ ant deploy
[dist/pr05]$ java -jar Client.jar

5. TomEE 7.0.x podesavanje
--------------------------
U fajlu conf/system.properties treba da stoje sledeca tri parametra:
tomee.remote.support = true
tomee.serialization.class.blacklist = -
tomee.serialization.class.whitelist = *
