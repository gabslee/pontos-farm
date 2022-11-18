CREATE TABLE usuarios (
  id_usuario bigint not null auto_increment,
  tipo_usuario VARCHAR(20) NOT NULL,
  login VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,
  senha VARCHAR(30) NOT NULL,

  PRIMARY KEY (id_usuario)

  );
