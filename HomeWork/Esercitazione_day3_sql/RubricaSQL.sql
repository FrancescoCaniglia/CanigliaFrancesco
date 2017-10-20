DROP DATABASE IF EXISTS RubricaTel;			#delate old db if it exist
CREATE DATABASE RubricaTel				    #creaate a new db
	DEFAULT CHARACTER SET utf8
    DEFAULT COLLATE utf8_unicode_ci;

USE RubricaTel;								#use my new db


DROP TABLE IF EXISTS country;				#delete table country table if it exists

CREATE TABLE country (						#create new table country with columns and primary key
	code VARCHAR(2) NOT NULL,
	name VARCHAR(32) NOT NULL,
    PRIMARY KEY(code)
);

DROP TABLE IF EXISTS brand;					#the same of country table, but this table has a foreign key too

CREATE TABLE brand (
	id INT(11) NOT NULL AUTO_INCREMENT,
	name VARCHAR(32) NOT NULL,
	country VARCHAR(2) NOT NULL,
	CONSTRAINT pk_id PRIMARY KEY(id),
    CONSTRAINT fk_country FOREIGN KEY (country) REFERENCES country(code)
);


DROP TABLE IF EXISTS opsys;				

CREATE TABLE opsys (
	id INT(11) NOT NULL AUTO_INCREMENT,
	description VARCHAR(64) NOT NULL,
	company VARCHAR(64) NOT NULL,
	openSource TINYINT(1) NOT NULL,
    PRIMARY KEY(id)
);

DROP TABLE IF EXISTS smartphone;

CREATE TABLE smartphone(
id INT(11) NOT NULL AUTO_INCREMENT,
name VARCHAR(64) NOT NULL,
ram VARCHAR(5) NOT NULL,
cpu VARCHAR(64) NOT NULL,
displayPpi INT (11) NOT NULL,
displaySize VARCHAR(12) NOT NULL,
displayResolution VARCHAR(64) NOT NULL,
size VARCHAR(64) NOT NULL,
weight INT(4) NOT NULL,
notes VARCHAR(1024) NOT NULL,
brand INT(11) NOT NULL,
opsys INT(11) NOT NULL,
CONSTRAINT pk_id PRIMARY KEY(id),
CONSTRAINT fk_brand FOREIGN KEY (brand) REFERENCES brand(id),
CONSTRAINT fk_opSys FOREIGN KEY (opsys) REFERENCES opsys(id)
);

Drop table if exists contatto;

Create table contatto(							#new table for this homework
id INT(11) NOT NULL AUTO_INCREMENT,				#table contatti has a foreign key about smartphone table
name VARCHAR(64) NOT NULL,
cognome VARCHAR(64) NOT NULL,
numero varchar(15) NOT NULL,
smartphone INT(11) NOT NULL,
indirizzo varchar(64),
citta varchar(32),
provincia varchar(32),
email varchar(64),
CONSTRAINT pk_id PRIMARY KEY(id),
CONSTRAINT fk_smartphone FOREIGN KEY (smartphone) REFERENCES smartphone(id)
);





