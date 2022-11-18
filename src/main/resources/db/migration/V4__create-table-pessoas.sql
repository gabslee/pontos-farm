CREATE TABLE pessoas (
  id_pessoa INT NOT NULL,
  cpf VARCHAR(45) NOT NULL,
  email VARCHAR(45) NOT NULL,
  nascimento DATE NOT NULL,
  data_admissao DATE NOT NULL,
  data_demissao DATE NULL,
  foto VARCHAR(45) NOT NULL,

  PRIMARY KEY (id_pessoa)
  );
