CREATE TABLE pessoas (
  id_pessoa bigint not null auto_increment,
  cpf VARCHAR(100) NOT NULL,
  nome VARCHAR(30) NOT NULL,
  email VARCHAR(100) NOT NULL,
  nascimento VARCHAR(100) NOT NULL,
  foto VARCHAR(100) NOT NULL,
  data_admissao VARCHAR(100) NOT NULL,
  data_demissao VARCHAR(100) NOT NULL,

  PRIMARY KEY (id_pessoa)
);
