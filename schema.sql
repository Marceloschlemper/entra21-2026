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
('2009-09-01', 'Marcelo Schlemper');

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


use atividade_loja
delimiter $$

CREATE PROCEDURE MostrarPedido(IN p_id_pedido INT)
BEGIN
    SELECT
        pr.nome AS produto,
        ip.quantidade,
        ip.valor_unitario,
        (ip.quantidade * ip.valor_unitario) AS subtotal
    FROM item_pedido ip
    JOIN produto pr
        ON ip.id_produto = pr.id_produto
    WHERE ip.id_pedido = p_id_pedido;
END$$

delimeter ;

delimiter $$
CREATE PROCEDURE AtualizarEstoque(
    IN p_id_produto INT,
    IN p_quantidade INT
)
BEGIN
    UPDATE produto
    SET estoque = estoque - p_quantidade
    WHERE id_produto = p_id_produto;
END$$

delimiter ;

CALL MostrarPedido(1);

SELECT * FROM produto;

CALL AtualizarEstoque(1, 2);


create procedure CadastrarProduto (
in p_nome  varchar(100),
in p_preço  decimal(10,2),
in p_estoque int
)
insert into produto (nome, preço, estoque) values 
(p_nome, p_preço, p_estoque);

CALL CadastrarProduto('abacaxi', 29.00, 9);

SELECT * FROM produto;

delimiter $$
create procedure NovoPedido (
in p_data  date,
in p_nome_cliente varchar(100)
)
BEGIN
insert into pedido (data_pedido, nome_cliente) values
(p_data, p_nome_cliente);
END $$
delimiter ;

CALL NovoPedido ('2010-01-09', 'lucas');
SELECT * FROM pedido;
