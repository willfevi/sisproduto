create DATABASE dbsisvenda character set utf8mb4 collate utf8mb4_bin;
use dbsisvenda;

create TABLE categoria(
    id int PRIMARY KEY,
    nome varchar(30)
    );
    
create table cliente(
	id int AUTO_INCREMENT PRIMARY KEY, 
	nome varchar(70), 
	cpf varchar(14), 
	email varchar(30), 
	senha varchar(30)
); 

create table produto(
id int primary key not null auto_increment,
nome varchar(30),
valor float,
idcategoria int, 
foreign key(idcategoria) references categoria(id));


