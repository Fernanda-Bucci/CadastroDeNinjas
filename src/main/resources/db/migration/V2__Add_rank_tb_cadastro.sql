-- V2: Migrations para adicionar a coluna Rank

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);
