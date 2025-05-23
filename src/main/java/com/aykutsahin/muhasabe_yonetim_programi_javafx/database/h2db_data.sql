-- Database Create
CREATE DATABASE user_management;

-- Oluşturulmuş database seçmek
USE user_management;

-- user adında bir tablo oluştur
CREATE TABLE IF NOT EXISTS usertable (
    id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    username VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
);

-- ###################################################################################################################

-- Insert
MERGE INTO usertable (id, username, password, email) KEY(id) VALUES (1,'Aykut','123456','aykutsahin@gmail.com' )

-- Select
select * FROM usertable;

-- Find User
SELECT  *  FROM usertable WHERE username="Aykut" AND "123456";

-- Update
UPDATE usertable SET username="Aykut44", password="12345644", email="aykutsahin@gmail.com44" WHERE id=1;

-- delete
DELETE FROM usertable  WHERE id=1;
