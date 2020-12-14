use adlister_db;

DROP TABLE IF EXISTS users;
drop table if exists ads;

CREATE table users (
    id int unsigned not null auto_increment primary key,
    username varchar(50),
    name varchar(20),
    email varchar(75),
    password varchar(20)
);


CREATE TABLE ads (
    id int unsigned not null auto_increment,
    user_id int unsigned not null,
    title varchar(500),
    description text,
    primary key (id),
    foreign key (user_id) references users(id)
);












