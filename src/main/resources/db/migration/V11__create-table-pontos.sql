CREATE TABLE pontos (
  id_ponto bigint not null auto_increment,
  entrada1 VARCHAR(100) NOT NULL,
  saida1 VARCHAR(30) NOT NULL,
  entrada2 VARCHAR(100) NOT NULL,
  saida2 VARCHAR(100) NOT NULL,
  observacao VARCHAR(100) NULL,

  PRIMARY KEY (id_ponto)
);
