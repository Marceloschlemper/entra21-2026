create database atividade_loja;
 
use atividade_loja;
 
create table produto (

id_produto int primary key auto_increment,

nome varchar(100),

preço decimal(10,2),

estoque int

);
 
create table pedido (

id_pedido int primary key auto_increment,

data_pedido date,

nome_cliente varchar(100)

);
 
create table item_pedido (

id_item int primary key auto_increment,

id_pedido int ,

id_produto int ,

quantidade int,

valor_unitario decimal (10,2),
 
foreign key (id_pedido) references pedido(id_pedido),

foreign key (id_produto) references produto(id_produto)

);
 
insert  into produto (nome, preço, estoque) values

('arroz', 25.00, 7),

('feijão', 8.50, 8),

('macarrão', 6.00, 9),

('refrigerante', 9.90, 10),

('chocolate',4.50,11);
 
insert into pedido (data_pedido, nome_cliente) values

(09/01/2009, 'Marcelo Schlemper');
 
select * from pedido;
 
insert into item_pedido (id_pedido, id_produto, quantidade, valor_unitario)

values

(1,1,2,25.00),

(1, 2, 3, 8.50),

(1, 5, 4, 4.50);

-------------------------------------------

select * from produto

where estoque > 10;
 
select * from produto

order by preço;
 
select * from pedido

where id_pedido = 1;
 
select * from item_pedido

where id_pedido = 1;
 
select * from item_pedido where id_pedido;

-------------------------------------------

update produto 

set preço = 27.50

where id_produto = 1;
 
update produto

set estoque = 14

where id_produto = 3;
 
update produto 

set nome = 'bolacha'

where id_produto = 2;
 
update pedido

set nome_cliente = 'maria'

where id_pedido = 1;
 
select * from pedido;
 
select 

     pr.nome as produto,

     ip.quantidade,

     ip.valor_unitario,

     (ip.quantidade * ip.valor_unitario) as subtotal

from item_pedido ip

join produto pr 

on ip.id_produto = pr.id_produto

where ip.id_pedido = 1;
 
SHOW tables;
 
select

sum(ip.valor_unitario * ip.quantidade) as 'total compra'

from item_pedido ip 

where ip.id_pedido =1;

 
