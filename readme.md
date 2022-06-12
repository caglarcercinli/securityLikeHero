database needed to be runned every time (before launch)

a database example:

    set names utf8mb4;
    set charset utf8mb4;
    drop database if exists users;
    create database users charset utf8mb4;
    use users;

    CREATE TABLE user (
      id int unsigned NOT NULL AUTO_INCREMENT primary key,
      name varchar(50) NOT NULL,
      username varchar(50) NOT NULL,
      password varchar(100) NOT NULL
    );

    CREATE TABLE role (
    id int unsigned not null AUTO_INCREMENT primary key,
      name varchar(50) NOT NULL
    );

    CREATE TABLE user_roles (
      user_id int unsigned NOT NULL,
      roles_id int unsigned NOT NULL,
      CONSTRAINT fk_user_userroles FOREIGN KEY (user_id) REFERENCES user(id),
      CONSTRAINT fk_roles_userroles FOREIGN KEY (roles_id) REFERENCES role(id)
    );

