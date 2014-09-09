FTN / Katedra za informatiku
Internet softverske arhitekture / 2014.
=================================

1. Lokacija primera
-------------------
isa.pr20

2. Opis primera
---------------
Primer rukovanja transakcijama u okviru session beanova. Implementirane su
tri varijante rukovanja transakcijama:
- container-managed: kontejner rukuje transakcijama, na osnovu anotacija
- bean-managed: session bean rukuje transakcijama koristeci JTA API
- client-managed: klijent rukuje transakcijama koristeci JTA API

3. Sadrzaj primera
------------------
CreditCard.java    - podaci o kreditnoj kartici
PurchaseOrder.java - podaci o porudzbini
bean.*             - SLSB-ovi sa bean-managed transakcijama
client.*           - SLSB-ovi koje poziva klijent koji kontrolise transakcije
container.*        - SLSB-ovi kojima kontejner rukuje transakcijama

4. Pokretanje primera
---------------------
[]$ ant deploy
[dist/pr20]$ java -jar Client.jar