create table cities
(
    id         bigint       not null
        primary key,
    created_at datetime     not null,
    updated_at datetime     not null,
    country_id  bigint       not null,
    name       varchar(255) not null
);

create table countries
(
    id         bigint       not null
        primary key,
    created_at datetime     not null,
    updated_at datetime     not null,
    name       varchar(255) not null
);

create table hibernate_sequence
(
    next_val bigint null
);