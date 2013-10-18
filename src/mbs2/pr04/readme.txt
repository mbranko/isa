FTN / Katedra za informatiku
Mrezno bazirani sistemi 2 / 2008.
=================================

1. Lokacija primera
-------------------
mbs2.pr04

2. Opis primera
---------------
Pristup RMI serverskom objektu, gde klijent koristi JNDI API. Jedina razlika
u odnosu na prvi primer je u klijentu.

3. Sadrzaj primera
------------------
ServerI.java    - RMI interfejs
Server.java     - implementacija RMI interfejsa
Client.java     - klijentski program

4. Pokretanje primera
---------------------
[dist/pr04]$ rmiregistry -J-Djava.rmi.server.codebase=file://full-path-to-Server.jar
[dist/pr04]$ java -jar Server.jar
[dist/pr04]$ java -jar Client.jar
