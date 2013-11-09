DROP TABLE IF EXISTS bank_account_opt;
DROP TABLE IF EXISTS bank_account_pes;

CREATE TABLE bank_account_opt (
  acct_id      INTEGER       NOT NULL AUTO_INCREMENT,
  acct_number  CHAR(13)      NOT NULL,
  balance      DECIMAL(12,2) NOT NULL,
  version      INTEGER       NOT NULL,
  PRIMARY KEY (acct_id)
)
ENGINE = INNODB
DEFAULT CHARSET = UTF8
DEFAULT COLLATE = UTF8_UNICODE_CI;

CREATE TABLE bank_account_pes (
  acct_id      INTEGER       NOT NULL AUTO_INCREMENT,
  acct_number  CHAR(13)      NOT NULL,
  balance      DECIMAL(12,2) NOT NULL,
  PRIMARY KEY (acct_id)
)
ENGINE = INNODB
DEFAULT CHARSET = UTF8
DEFAULT COLLATE = UTF8_UNICODE_CI;

INSERT INTO bank_account_opt (acct_number, balance, version) VALUES ('1234567890123', 2500, 1);
INSERT INTO bank_account_pes (acct_number, balance) VALUES ('1234567890123', 2500);