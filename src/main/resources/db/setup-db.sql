create database urlconverterdb;

create user 'converter'@'localhost' identified by 'converter12';
grant all privileges on urlconverterdb.* to 'converter'@'localhost';
flush privileges;