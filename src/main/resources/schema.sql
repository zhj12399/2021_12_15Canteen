use canteen;

create table if not exists people
(
    id integer not null auto_increment,
    name char(255) not null,
    password char(128) not null,
    primary key(id)
);

alter table people auto_increment = 10000;

create table if not exists recipe
(
    id integer not null,
    name char(255) not null,
    star integer not null,
    primary key(id)
)