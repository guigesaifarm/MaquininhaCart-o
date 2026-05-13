CREATE DATABASE ecommerce;

CREATE TABLE cliente (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100),
    telefone VARCHAR(20),
    cpf VARCHAR(14),
    endereco TEXT
);
