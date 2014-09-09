FTN / Katedra za informatiku
Internet softverske arhitekture / 2014.
=================================

1. Lokacija primera
-------------------
isa.pr18

2. Opis primera
---------------
Pristup session beanu iz servleta. Session bean se moze dobaviti preko JNDI
lookupa ili injekcijom - u ovom primeru se koristi injekcija. Napomena: nema
smisla injekcijom dobavljati stateful bean jer se servlet po svojoj prirodi
stateless. Stateful beanovi se mogu cuvati u HttpSession objektu (za svakog
korisnika posebno).

3. Sadrzaj primera
------------------
CreditCard.java      - podaci o kreditnoj kartici
Logger.java          - interceptor klasa
Order.java           - podaci o porudzbini
Payment.java         - remote interfejs 
PaymentLocal.java    - local interfejs
PaymentBean.java     - bean klasa za procesiranje kreditne kartice
Purchase.java        - remote interfejs
PurchaseLocal.java   - local interfejs
PurchaseBean.java    - bean klasa za procesiranje porudzbine
PurchaseServlet.java - servlet koji pristupa session beanu
web.xml              - deskriptor war aplikacije
index.html           - stranica sa HTML formom koja upucuje na servlet

4. Pokretanje primera
---------------------
[] ant deploy
http://localhost:8080/pr18/
