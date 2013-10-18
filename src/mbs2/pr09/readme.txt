FTN / Katedra za informatiku
Mrezno bazirani sistemi 2 / 2013.
=================================

1. Lokacija primera
-------------------
mbs2.pr09

2. Opis primera
---------------
Primer za dependency injection: slicno kao prethodni primer, samo PurchaseBean
dobija referencu na PaymentBean preko DI mehanizma, odnosno @EJB anotacije.
Napomena: injekcija i stateless/stateful beanovi
stateless -> stateful    OK
stateless -> stateless   OK
stateful  -> stateful    OK
stateful  -> stateless   zabranjeno

3. Sadrzaj primera
------------------
CreditCard.java      - podaci o kreditnoj kartici
Order.java           - podaci o porudzbini
Payment.java         - remote interfejs 
PaymentLocal.java    - local interfejs
PaymentBean.java     - bean klasa za procesiranje kreditne kartice
Purchase.java        - remote interfejs
PurchaseLocal.java   - local interfejs
PurchaseBean.java    - bean klasa za procesiranje porudzbine
PurchaseClient.java  - klijentski program

4. Pokretanje primera
---------------------
[]$ ant deploy
[dist/pr09]$ java -jar Client.jar
