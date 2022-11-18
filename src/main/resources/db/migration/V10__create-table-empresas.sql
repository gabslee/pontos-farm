CREATE TABLE empresas (
  id_empresa bigint not null auto_increment,
  cnpj VARCHAR(100) NOT NULL,
  nome_empresa VARCHAR(30) NOT NULL,
  telefone VARCHAR(100) NOT NULL,
  email VARCHAR(100) NOT NULL,

  PRIMARY KEY (id_empresa)
);
