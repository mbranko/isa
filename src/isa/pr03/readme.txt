FTN / Katedra za informatiku
Internet softverske arhitekture / 2014.
=================================

1. Lokacija primera
-------------------
isa.pr03

2. Opis primera
---------------
Primeri koriscenja JNDI API-ja za pristup razlicitim servisima imenovanja.

3. Sadrzaj primera
------------------
FileClient.java    - pristup fajl sistemu preko JNDI
DNSClient.java     - pristup DNS-u preko JNDI
LDAPClient.java    - pristup LDAP serveru preko JNDI

4. Pokretanje primera
---------------------
[dist/pr03] $ java -jar FileClient.jar
[dist/pr03] $ java -jar DNSClient.jar
[dist/pr03] $ java -jar LDAPClient.jar
