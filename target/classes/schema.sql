CREATE SCHEMA IF NOT EXISTS speak;
set search_path to speak;
CREATE TABLE  IF NOT EXISTS languages
(
 language_id serial NOT NULL,
  language_name varchar(11) NOT NULL,
 PRIMARY KEY (language_id)
);

INSERT INTO  languages (language_name)
VALUES ('Spanish');
