CREATE TABLE tb_customer (
    id BIGINT,
    name VARCHAR(50) NOT NULL,
    cpf VARCHAR(11) NOT NULL
);

CREATE SEQUENCE sq_customer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

CREATE TABLE tb_product (
    id BIGINT NOT NULL,
    code VARCHAR(30),
    description VARCHAR(60),
    price NUMERIC(4,2)
);


CREATE SEQUENCE sq_product
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;

ALTER TABLE tb_customer ADD CONSTRAINT tb_customer_cpf_key UNIQUE (cpf);

ALTER TABLE tb_customer ADD CONSTRAINT tb_customer_id_key UNIQUE (id);

ALTER TABLE tb_product ADD CONSTRAINT tb_product_pkey PRIMARY KEY (id);
 ---------

ebac_user // secret
CREATE DATABASE ebac_store;
