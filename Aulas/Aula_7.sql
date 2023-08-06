create database jogo_Aula_7;

USE jogo_Aula_7;

CREATE TABLE  heroi(id INT AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(30), ataque INT, defesa INT, pontos_vida INT);

CREATE TABLE inimigo(id INT, nome VARCHAR(30), ataque INT, defesa INT, pontos_vida INT);

CREATE TABLE dangeum(id INT, nome VARCHAR(30), altura INT, largura INT, qtndInimigos INT);

ALTER TABLE heroi ADD PRIMARY KEY (id);
ALTER TABLE heroi MODIFY COLUMN id INT AUTO_INCREMENT PRIMARY KEY;   

DESCRIBE heroi;    

INSERT INTO heroi(nome, ataque, defesa, pontos_vida)
VALUES ('Aroldo', '50', '20', '200');

INSERT INTO heroi(nome, ataque, defesa, pontos_vida)
VALUES ('Joles', '100', '5', '200');

INSERT INTO heroi(nome, ataque, defesa, pontos_vida)
VALUES ('Sena', '70', '50', '200');

INSERT INTO heroi(nome, ataque, defesa, pontos_vida)
VALUES ('Anthoá', '25', '50', '200');  

SELECT * FROM heroi;                 

DELETE FROM heroi WHERE id=4 LIMIT 1;

CREATE TABLE mascote(id INT AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(30), id_heroi int, FOREIGN KEY(id_heroi) REFERENCES heroi(id) );	

DESCRIBE mascote;

ALTER TABLE mascote MODIFY COLUMN id_heroi INT NOT NULL;	

INSERT INTO mascote(nome, id_heroi)
VALUES ('Robson', 3); 	

INSERT INTO mascote(nome, id_heroi)
VALUES ('Hami', 3);	

SELECT * FROM mascote;

UPDATE heroi
SET ataque = "55" WHERE id=4						