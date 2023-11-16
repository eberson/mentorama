create table contact(
    id bigint not null primary key,
    uuid varchar(50) not null unique,
    name varchar(200) not null,
    email varchar(200),
    phone varchar(11) not null,
    phone_type enum('MOBILE', 'RESIDENTIAL', 'COMMERCE') not null,
    birth_date date,
    input_date timestamp,
    last_updated_date timestamp,
    version int
);