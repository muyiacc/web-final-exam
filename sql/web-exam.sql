create database web_exam;

use web_exam;

drop table if exists user;
create table user(
    id int auto_increment ,
    name varchar(50),
    gender boolean,
    birthday date,
    PRIMARY KEY (id)
);

insert into user(name, gender, birthday) values('小花',false,'2001-10-10');
insert into user(name, gender, birthday) values('小芳',false,'2002-06-05');

select * from user;

create table accout(
    id int,
    userName varchar(50),
    balance int,
    PRIMARY KEY (id)
)