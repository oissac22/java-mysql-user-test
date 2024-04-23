create database if not exists testjava;

use testjava;

create table if not exists user (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name CHAR(100) NOT NULL,
    email CHAR(200) NOT NULL,
    password CHAR(100) NOT NULL,
    UNIQUE KEY uk_pass (password)
);