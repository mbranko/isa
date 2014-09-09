FTN / Katedra za informatiku
Internet softverske arhitekture / 2014.
=================================

1. Lokacija primera
-------------------
isa.pr01

2. Opis primera
---------------
Primer elementarnog RMI klijenta i servera. Server klijentima nudi jednu
metodu i broji ukupan broj poziva metode. U sastav serverskog programa 
ulaze:
- isa.pr01.ServerI
- isa.pr01.Server
- isa.pr01.ServerMain

U sastav klijentskog programa ulaze:
- isa.pr01.Client
- isa.pr01.ServerI

3. Sadrzaj primera
------------------
ServerI.java    - definicija RMI interfejsa
Server.java     - implementacija RMI interfejsa
ServerMain.java - klasa za pokretanje serverskog programa
Client.java     - klijentski program

4. Pokretanje primera
---------------------
[dist/pr01]$ rmiregistry -J-Djava.rmi.server.codebase=file://full-path-to-Server.jar
[dist/pr01]$ java -jar Server.jar
[dist/pr01]$ java -jar Client.jar
