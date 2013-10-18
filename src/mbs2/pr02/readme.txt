FTN / Katedra za informatiku
Mrezno bazirani sistemi 2 / 2013.
=================================

1. Lokacija primera
-------------------
mbs2.pr02

2. Opis primera
---------------
Primer prenosenja programskog koda preko RMI. Serverska metoda kao parametar
ima interfejs, a klijentski program prilikom poziva metode prosledjuje instancu
podtipa (klase koja implementira interfejs, i koja nije poznata serveru).

Za RMI dynamic code downloading potrebno je ukljuciti RMISecurityManager i na
klijentu i na serveru. Ovaj security manager ne podrazumeva pravo aplikacije da
uspostavlja konekcije i cita fajlove iz fajl-sistema pa se ta prava moraju
eksplicitno dodeliti programima kroz "security policy" fajlove. Prilikom poziva
servera i klijenta definise se i security policy fajl.

3. Sadrzaj primera
------------------
Compute.java        - definicija RMI interfejsa
ComputeServer.java  - implementacija RMI interfejsa
Task.java           - interfejs koji predstavlja parametar metode RMI interfejsa
Pi.java             - implementacija Task interfejsa
ComputeClient.java  - klijentski program
server.policy       - security policy fajl za serverski program
client.policy       - security policy fajl za klijentski program

U sastav serverskog programa ulaze:
- mbs2.pr02.Compute
- mbs2.pr02.Task
- mbs2.pr02.ComputeServer

U sastav klijentskog programa ulaze:
- mbs2.pr02.Compute
- mbs2.pr02.Task
- mbs2.pr02.ComputeClient
- mbs2.pr02.Pi

4. Pokretanje primera
---------------------
[dist/pr02]$ rmiregistry -J-Djava.rmi.server.codebase=file://full-path-to-Server.jar
[dist/pr02]$ java -Djava.security.policy=server.policy -jar Server.jar
[dist/pr02]$ java -Djava.security.policy=client.policy -jar Client.jar
