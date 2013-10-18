MBS2
====

Primeri sa predavanja iz Mrežno baziranih sistema 2.


Potreban softver
----------------

1. JDK 1.7.0_21+

1. Apache Ant 1.8+

1. Apache TomEE+ 1.5+


Instalacija
-----------

1. Podrazumeva se da su JDK i Ant instalirani.

1. Raspakovati TomEE+.

1. U Eclipse-u kreirati novi server: Window / Preferences ; u stablu pronaći
Server / Runtime Environment ; kliknuti Add ; izabrati Apache Tomcat v7.0 ;
klinkuti Next ; zadati ime servera: "Apache TomEE Plus 1.5.2" ; izabrati
direktorijum gde je TomEE instaliran ; kliknuti Finish

1. Preuzeti kod sa GitHub-a: git clone https://github.com/mbranko/mbs2.git

1. Kreirati projekat u Eclipse-u sa preuzetim kodom

1. U Java Build Path dodati: Add Library ; Server Runtime ; Apache TomEE Plus 1.5.2

1. Podesiti putanju do TomEE+ instalacije u fajlu tomee.properties.


