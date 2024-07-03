drop table tb_tipo_pessoa cascade;
drop table tb_pessoa cascade;

create table if not exists tb_tipo_pessoa (
	codigo serial not null,
	descricao varchar not null,
	constraint pk_tipo_pessoa primary key (codigo),
	constraint ck_tipo_pessoa_descricao unique (descricao)
);

create table if not exists tb_pessoa (
	codigo serial not null,
	id_tipo_pessoa integer not null,
	nome varchar not null,
	constraint pk_pessoa primary key (codigo),
	constraint fk_tipo_pessoa foreign key (id_tipo_pessoa) references tb_tipo_pessoa (codigo),
	constraint ck_pessoa_nome unique (nome)
);

insert into tb_tipo_pessoa (descricao) values ('Pessoa Física');
insert into tb_tipo_pessoa (descricao) values ('Pessoa Jurídica');
insert into tb_tipo_pessoa (descricao) values ('Pessoa Autoridade');

insert into tb_pessoa (id_tipo_pessoa, nome) values (
(select codigo from tb_tipo_pessoa where descricao = 'Pessoa Física'), 
'José Quintinno'
);

/*
    select * from tb_tipo_pessoa;
    select * from tb_pessoa;
*/

tb_pessoa ();

tb_pessoa_fisica ();

tb_pessoa_juridica ();

tb_documento ();