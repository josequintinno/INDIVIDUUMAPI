drop table if exists tb_tipo_pessoa cascade;
drop table if exists tb_pessoa cascade;
drop table tb_tipo_documento cascade;
drop table if exists tb_documento cascade;

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
	proprietario varchar not null, -- GERAL, <NOME_SISTEMA_CADASTRO>
	e_ativo boolean not null default true,
	constraint pk_pessoa primary key (codigo),
	constraint fk_tipo_pessoa foreign key (id_tipo_pessoa) references tb_tipo_pessoa (codigo),
	constraint ck_pessoa_nome unique (nome)
);

create table if not exists tb_tipo_documento (
	codigo serial not null,
	descricao varchar not null,
	sigla varchar not null,
	constraint pk_tipo_documento primary key (codigo),
	constraint ck_tipo_documento_descricao unique (descricao)
);

create table if not exists tb_documento (
	codigo serial not null,
	id_tipo_documento integer not null,
	id_pessoa integer not null,
	numero varchar not null,
	orgao_emissor varchar not null,
	constraint pk_documento primary key (codigo),
	constraint fk_pessoa foreign key (id_pessoa) references tb_pessoa (codigo)
);

insert into tb_tipo_pessoa (descricao) values ('Pessoa Física');
insert into tb_tipo_pessoa (descricao) values ('Pessoa Jurídica');
insert into tb_tipo_pessoa (descricao) values ('Pessoa Autoridade');

insert into tb_pessoa (id_tipo_pessoa, nome, proprietario, e_ativo) values (
(select codigo from tb_tipo_pessoa where descricao = 'Pessoa Física'), 
'José Quintinno',
'GERAL',
true
);

insert into tb_tipo_documento (sigla, descricao) values ('RG', 'Registro Geral');
insert into tb_tipo_documento (sigla, descricao) values ('CPF', 'Cadastro de Pessoa Física');
insert into tb_tipo_documento (sigla, descricao) values ('CNPJ', 'Cadastro Nacional de Pessoa Jurídica');

insert into tb_documento (id_pessoa, id_tipo_documento, numero, orgao_emissor) values (
	(select codigo from tb_pessoa where nome = 'José Quintinno'),
	(select codigo from tb_tipo_documento where sigla = 'RG'),
	'152783453',
	'Secretaria de Seguranca Pública - DF'
);

/*
    select * from tb_tipo_pessoa;
    select * from tb_pessoa;
	select * from tb_tipo_documento;
	select * from tb_documento;
*/

tb_pessoa ();

tb_pessoa_fisica ();

tb_pessoa_juridica ();