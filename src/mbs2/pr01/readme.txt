FTN / Katedra za informatiku
Mrezno bazirani sistemi 2 / 2013.
=================================

1. Lokacija primera
-------------------
mbs2.pr01

2. Opis primera
---------------
Primer elementarnog RMI klijenta i servera. Server klijentima nudi jednu
metodu i broji ukupan broj poziva metode. U sastav serverskog programa 
ulaze:
- mbs2.pr01.ServerI
- mbs2.pr01.Server
- mbs2.pr01.ServerMain

U sastav klijentskog programa ulaze:
- mbs2.pr01.Client
- mbs2.pr01.ServerI

3. Sadrzaj primera
------------------
ServerI.java    - definicija RMI interfejsa
Server.java     - implementacija RMI interfejsa
ServerMain.java - klasa za pokretanje serverskog programa
Client.java     - klijentski program

4. Pokretanje primera
---------------------
[dist/pr01]$ rmiregistry
[dist/pr01]$ java -jar Server.jar
[dist/pr01]$ java -jar Client.jar
