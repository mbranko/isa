FTN / Katedra za informatiku
Mrezno bazirani sistemi 2 / 2013.
=================================

1. Lokacija primera
-------------------
mbs2.pr21

2. Opis primera
---------------
Primer optimistickog i pesimistickog zakljucavanja pomocu entitija. U obe 
varijante primer se sastoji iz jednog entitija i jedne test-klase koja u dva
threada izvrsava transakciju nad istim podacima.

3. Sadrzaj primera
------------------
optimistic.*   - primer sa optimistickim zakljucavanjem
pessimistic.*  - primer sa pesimistickim zakljucavanjem

4. Pokretanje primera
---------------------
[dist/pr21] java -jar pr21-optimistic.jar
[dist/pr21] java -jar pr21-pessimistic.jar

