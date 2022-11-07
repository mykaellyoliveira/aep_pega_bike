create database dbaep;
use dbaep;
create table usuario(
id_usuario   int         not null primary key auto_increment, 
cpf          varchar(14) not null,
nome         varchar(60) not null,
email        varchar(40) not null, 
senha		 varchar(80) not null,
telefone     varchar(15) not null,
dtNascimento varchar(10) not null,
verificado   boolean     not null);

create table endereco(
id_endereco int         not null primary key auto_increment, 
id_usuario  int 		not null,
cep         varchar(9)  not null, 
rua         varchar(80) not null, 
numero      varchar(15) not null, 
bairro      varchar(60) not null, 
complemento varchar(30), 
cidade      varchar(20) not null,
estado      varchar(30) not null, 
foreign key (id_usuario) references usuario(id_usuario));

create table documento(
id_documento 	   int not null primary key auto_increment,
id_usuario         int not null, 
fotoDocFrente	   blob, 
fotoDocVerso       blob, 
fotoCompResidencia blob,
foreign key (id_usuario) references usuario(id_usuario));

select * from usuario;
select * from endereco;
select * from documento;

