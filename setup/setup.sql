create database if not exists agenda character set utf8mb4 collate utf8mb4_0900_ai_ci;

create user if not exists 'mentorama'@'%' identified with mysql_native_password by 'm3nt0r4m4';

grant all privileges on agenda.* to 'mentorama'@'%';

flush privileges;
