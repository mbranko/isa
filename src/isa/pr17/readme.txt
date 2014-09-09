FTN / Katedra za informatiku
Internet softverske arhitekture / 2014.
=================================

1. Lokacija primera
-------------------
isa.pr17

2. Opis primera
---------------
Mapiranje objektnog modela koji se sastoji iz vise povezanih klasa na relacionu 
bazu. Test klasa ilustruje i 
- rad sa objektima unutar i izvan sesije, odnosno lazy/eager ucitavanje
- kaskadno upisivanje objekata u bazu

3. Sadrzaj primera
------------------
Admin.java         - anotirana perzistentna klasa
User.java          - anotirana perzistentna klasa
Category.java      - anotirana perzistentna klasa
Supplier.java      - anotirana perzistentna klasa
Product.java       - anotirana perzistentna klasa
PurchaseOrder.java - anotirana perzistentna klasa
OrderItem.java     - anotirana perzistentna klasa
ProductImage.java  - anotirana perzistentna klasa
Test.java          - primer rukovanja perzistentnim objektnim modelom
persistence.xml    - konfiguracija entity managera

4. Pokretanje primera
---------------------
[dist/pr17] java -jar pr17.jar