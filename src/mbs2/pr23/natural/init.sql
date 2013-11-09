DROP TABLE IF EXISTS DRZAVA;
DROP TABLE IF EXISTS NASELJENOMESTO;

CREATE TABLE DRZAVA (
  drz_sifra  CHAR(3)      NOT NULL,
  drz_naziv  VARCHAR(50)  NOT NULL,
  PRIMARY KEY (drz_sifra)
);

CREATE TABLE NASELJENOMESTO (
  drz_sifra  CHAR(3)      NOT NULL,
  nm_pttbroj VARCHAR(5)   NOT NULL,
  nm_naziv   VARCHAR(50)  NOT NULL,
  PRIMARY KEY (drz_sifra, nm_pttbroj),
  FOREIGN KEY (drz_sifra) REFERENCES DRZAVA (drz_sifra) ON DELETE CASCADE
);

CREATE TABLE MESNAZAJEDNICA (
  drz_sifra  CHAR(3)      NOT NULL,
  nm_pttbroj VARCHAR(5)   NOT NULL,
  mz_redbroj VARCHAR(5)   NOT NULL,
  mz_naziv   VARCHAR(50)  NOT NULL,
  PRIMARY KEY (drz_sifra, nm_pttbroj, mz_redbroj),
  FOREIGN KEY (drz_sifra, nm_pttbroj) REFERENCES NASELJENOMESTO (drz_sifra, nm_pttbroj) ON DELETE CASCADE
);
