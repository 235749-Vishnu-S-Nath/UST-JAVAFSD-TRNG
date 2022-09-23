create database ORG;
show databases;
use ORG;

create table Worker(
	WORKER_ID int not null primary key,
    FIRST_NAME varchar(20),
    LAST_NAME varchar(20),
    SALARY int,
    JOINING_DATE datetime,
    DEPARTMENT varchar(15)
);

insert into Worker values(1,"Monika","Arora",100000,"2014-02-20 09:00:00","HR"),(2,"Niharika","Varma",80000,"2014-06-11 09:00:00","Admin");
insert into Worker values(3,"Vishal","Singhal",300000,"2014-02-20 09:00:00","HR"),(4,"Amitabh","Singh",500000,"2014-02-20 09:00:00","Admin");
insert into Worker values(5,"Vivek","Bhati",500000,"2014-06-11 09:00:00","Admin"),(6,"Vipul","Diwan",200000,"2014-06-11 09:00:00","Account");
insert into Worker values(7,"Satish","Kumar",75000,"2014-01-20 09:00:00","Account"),(8,"Geetika","Chauhan",90000,"2014-04-11 09:00:00","Admin");

create table Bonus( 
	WORKER_REF_ID int references Worker(WORKER_ID),
    BONUS_DATE datetime,
    BONUS_AMOUNT int
);

insert into Bonus values(1,"2016-02-20 00:00:00",5000),(2,"2016-06-11 00:00:00",3000),(3,"2016-02-20 00:00:00",4000),(1,"2016-02-20 00:00:00",4500),(2,"2016-06-11 00:00:00",3500);

create table Title( 
	WORKER_REF_ID int references Worker(WORKER_ID),
    WORKER_TITLE varchar(20),
    AFFECTED_FROM datetime
);

insert into Title values(1,"Manager","2016-02-20 00:00:00"),(2,"Executive","2016-06-11 00:00:00"),(8,"Executive","2016-06-11 00:00:00");
insert into Title values(5,"Manager","2016-06-11 00:00:00"),(4,"Asst.Manager","2016-06-11 00:00:00"),(7,"Executive","2016-06-11 00:00:00");
insert into Title values(6,"Lead","2016-06-11 00:00:00"),(3,"Lead","2016-06-11 00:00:00");

select FIRST_NAME as WORKER_NAME from Worker;

select upper(FIRST_NAME) from Worker;

select distinct DEPARTMENT from Worker;

select substring(FIRST_NAME,1,3) from Worker;

select instr(FIRST_NAME, binary 'a') from Worker where FIRST_NAME="Amitabh";

select rtrim(FIRST_NAME) from Worker;

select ltrim(DEPARTMENT) from Worker;

select distinct length(DEPARTMENT) from Worker;

select replace(FIRST_NAME,'a','A') from Worker;

select concat(FIRST_NAME,' ',LAST_NAME) as COMPLETE_NAME from Worker;

select * from Worker order by FIRST_NAME asc;

select * from Worker order by FIRST_NAME asc,DEPARTMENT desc;

select * from Worker where FIRST_NAME in ("Vipul","Satish");

select * from Worker where FIRST_NAME not in ('Vipul','Satish');

select * from Worker where DEPARTMENT like 'Admin%';

select * from Worker where FIRST_NAME like '%a%';

select * from Worker where FIRST_NAME like '%a';

select * from Worker where FIRST_NAME like "_____h";

select * from Worker where SALARY between 100000 and 500000;

select * from Worker where year(JOINING_DATE) = 2014 and month(JOINING_DATE)=2;

select count(*) from Worker where DEPARTMENT = "Admin";

select concat(FIRST_NAME,' ',LAST_NAME) as Workers_Name, SALARY from Worker
where WORKER_ID in ( SELECT WORKER_ID from Worker where SALARY between 50000 and 100000);

select DEPARTMENT, count(WORKER_ID) as NO_OF_WORKERS from Worker
group by DEPARTMENT order by NO_OF_WORKERS desc;

select distinct w.FIRST_NAME, t.WORKER_TITLE from Worker w inner join Title t
on w.WORKER_ID = t.WORKER_REF_ID and t.WORKER_TITLE in ("Manager");

select WORKER_TITLE, AFFECTED_FROM, count(*)
from Title group by WORKER_TITLE, AFFECTED_FROM
having count(*) > 1;

select * from Worker where mod(Worker_ID,2) <> 0;

select * from Worker where mod(Worker_ID,2) = 0;