DROP TABLE IF EXISTS predaje;
DROP TABLE IF EXISTS predmeti;
DROP TABLE IF EXISTS nastavnici;

CREATE TABLE nastavnici
(
    NASTAVNIK_ID  INTEGER                not null,
    IME           VARCHAR(25)           not null,
    PREZIME       VARCHAR(35)           not null,
    ZVANJE        VARCHAR(15)           not null,
    primary key (NASTAVNIK_ID)
) ENGINE = InnoDB;

CREATE TABLE predmeti
(
    PREDMET_ID    INTEGER                not null,
    NAZIV         VARCHAR(150)          not null,
    primary key (PREDMET_ID)
) ENGINE = InnoDB;

CREATE TABLE predaje
(
    PREDMET_ID    INTEGER                not null,
    NASTAVNIK_ID  INTEGER                not null,
    primary key (PREDMET_ID, NASTAVNIK_ID),
    foreign key (PREDMET_ID) references predmeti (PREDMET_ID) on delete cascade,
    foreign key (NASTAVNIK_ID) references nastavnici (NASTAVNIK_ID) on delete cascade
) ENGINE = InnoDB;

INSERT INTO nastavnici (nastavnik_id, ime, prezime, zvanje) VALUES
  (1, 'Marko', 'Markovic', 'docent');
INSERT INTO nastavnici (nastavnik_id, ime, prezime, zvanje) VALUES
  (2, 'Petar', 'Petrovic', 'redovni');
INSERT INTO nastavnici (nastavnik_id, ime, prezime, zvanje) VALUES
  (3, 'Nikola', 'Nikolic', 'docent');

INSERT INTO predmeti (predmet_id, naziv) VALUES
  (1, 'Osnovi racunarstva');
INSERT INTO predmeti (predmet_id, naziv) VALUES
  (2, 'Programiranje i programski jezici');
INSERT INTO predmeti (predmet_id, naziv) VALUES
  (3, 'Operativni sistemi');

INSERT INTO predaje (nastavnik_id, predmet_id) VALUES
  (1, 1);
INSERT INTO predaje (nastavnik_id, predmet_id) VALUES
  (2, 2);
INSERT INTO predaje (nastavnik_id, predmet_id) VALUES
  (2, 3);
INSERT INTO predaje (nastavnik_id, predmet_id) VALUES
  (3, 1);
INSERT INTO predaje (nastavnik_id, predmet_id) VALUES
  (3, 3);
