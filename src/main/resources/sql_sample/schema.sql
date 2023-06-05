-- DROP TABLE IF EXISTS tbl_user;
--
-- CREATE TABLE tbl_User (
--                           id INT AUTO_INCREMENT  PRIMARY KEY,
--                           username VARCHAR(250) NOT NULL,
--                           password VARCHAR(250) NOT NULL
-- );

DROP TABLE IF EXISTS TBL_TECH_STACK;

CREATE TABLE TBL_TECH_STACK (
                          id VARCHAR(250)  PRIMARY KEY NOT NULL,
                          name VARCHAR(250) NOT NULL,
                          level INT NOT NULL,
                          since DATE
);