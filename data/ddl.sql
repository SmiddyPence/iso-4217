CREATE TABLE currency (
  name varchar(128) NOT NULL,
  alphabetic_code varchar(3) DEFAULT NULL,
  numeric_code varchar(3) DEFAULT NULL,
  minor_unit varchar(4) DEFAULT NULL,
  PRIMARY KEY (alphabetic_code)
); 

CREATE TABLE entity (
  name VARCHAR(64) NOT NULL,
  alphabetic_code VARCHAR(3),
  FOREIGN KEY (alphabetic_code) REFERENCES currency(alphabetic_code)
);