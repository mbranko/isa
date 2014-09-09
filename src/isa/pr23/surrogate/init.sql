-- tabela za IDENTITY primer   / MySQL-specific
CREATE TABLE pr23_identity (
  id     INTEGER     NOT NULL AUTO_INCREMENT,
  name   VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
);

-- tabela za SEQUENCE primer  / Oracle-specific
CREATE TABLE pr23_sequence (
  id     INTEGER     NOT NULL,
  name   VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
);
CREATE SEQUENCE pr23_gen;

-- tabela za TABLE primer    / vendor-agnostic
CREATE TABLE pr23_table (
  id     INTEGER     NOT NULL,
  name   VARCHAR(50) NOT NULL,
);
CREATE TABLE counters (
  counter_name  VARCHAR(50) NOT NULL,
  counter_value INTEGER     NOT NULL,
  PRIMARY KEY (counter_name)
);