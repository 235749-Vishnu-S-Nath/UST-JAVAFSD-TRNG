create database USTDB;
show databases;
use USTDB;
create table UST_TABLE(
id int not null primary key,
name varchar(20),
state varchar(20),
age int );
show tables;
desc UST_TABLE;

insert into UST_TABLE value(1,"Vishnu","Kerala",21),
(2,"Ashiq","Kerala",23),
(3,"Sruthi","Kerala",22);

select* from UST_TABLE;

update UST_TABLE set age = 25 where id=3;


create table table2(
	id int not null primary key,
    dept varchar(20),
    city varchar(20));
    
insert into table2 values(1,"C++","Kochi"),(2,"java","banglore"),(3,"python","mumbai");
    
select dept,city,state from UST_TABLE join table2 on UST_TABLE.id=table2.id;

select count(id) from UST_TABLE;

insert into table2 values(4,"C#","Kochi"),(5,"ruby","banglore");

select city,count(*) from table2 group by city; 

select * from table2 group by city ;

select count(*) from table2;
select * from table2;
select dept,count(city) from table2 group by city having count(city)>3;