alter table usuarios add status varchar(20) null;
update usuarios set status = "ATIVO";