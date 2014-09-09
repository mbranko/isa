FTN / Katedra za informatiku
Internet softverske arhitekture / 2014.
=================================

1. Lokacija primera
-------------------
isa.pr22

2. Opis primera
---------------
Primeri cetiri varijante za mapiranje nasledjivanja. U svim varijantama 
koriste se sledeci fajlovi:
BillingDetails.java - apstraktna klasa sa jednim atributom
CreditCard.java     - konkretna klasa sa podacima o kreditnoj kartici
BankAccount.java    - konkretna klasa sa podacima o bankovnom racunu
schema.sql          - SQL skript za kreiranje potrebnih tabela

Varijante za mapiranje su sledece:

1) Jedna tabela po konkretnoj klasi sa implicitnim polimorfizmom
Ovde nema eksplicitnog mapiranja nasledjivanja - konkretne klase naslednice se
mapiraju na odvojene tabele, a apstraktna klasa roditelj nije entity; neni
atributi se nasledjuju u konkretnim klasama i mapiraju na odgovarajuce kolone

2) Jedna tabela po konkretnoj klasi
Ovde se i apstraktna klasa proglasava za entity (iako nece biti mapirana na
tabelu, naznacava se nacin mapiranja nasledjivanja posebnom @Inheritance 
anotacijom). Na taj nacin se moze koristiti u JPAQL upitima.

3) Jedna tabela po hijerarhiji nasledjivanja
Za svaku (celu) hijerarhiju nasledjivanja formira se jedna tabela, sa unijom
svih kolona koje su potrebne za sve klase naslednice. Tip svakog objekta
predstavljenim jednim redom u bazi odredjuje se pomocu vrednosti posebne
kolone ("discriminator column"). U roditeljskoj klasi mora se navesti koja je
to kolona.

4) Jedna tabela za svaku klasu
Veze nasledjivanja se ovde prikazuju pomocu spoljnih kljuceva. Cak i apstraktne
klase se mapiraju na tabele u bazi. U tabelama koje odgovaraju klasama 
naslednicama ne ponavljaju se nasledjeni propertiji.

3. Sadrzaj primera
------------------
v1.* - jedna tabela po konkretnoj klasi sa implicitnim polimorfizmom
v2.* - jedna tabela po konkretnoj klasi
v3.* - jedna tabela po hijerarhiji
v4.* - jedna tabela po klasi

