use ustdb;
create table Employee (
	EMP_ID int not null primary key,
    MANAGER_ID int,
    FIRST_NAME varchar(50) not null,
    LAST_NAME varchar(50) not null,
    EMP_TITLE varchar(50) not null,
    SALARY varchar(50) not null,
    JOINING_DATE varchar(50) not null,
    DEP varchar(50) not null
);

insert into Employee values (1,null,"Monika","Arora","Manager","100000","02/20/14 9:00","HR"),(2,1,"Niharika","Verma","Executive","80000","06/11/14 9:00","Admin");
insert into Employee values (3,1,"Vishal","Singhal","Executive","300000","02/20/14 9:00","HR"),(4,null,"Amitabh","Singh","Manager","500000","02/20/14 9:00","Admin");
insert into Employee values (5,4,"Vivek","Bhati","Asst.Manager","500000","06/11/14 9:00","Admin"),(6,5,"Vipul","Diwan","Executive","200000","06/11/14 9:00","Account");
insert into Employee values (7,4,"Satish","Kumar","Lead","75000","01/20/14 9:00","Admin"),(8,4,"Geetika","Chauhan","Lead","90000","04/11/14 9:00","Admin");

select* from Employee;

select FIRST_NAME,LAST_NAME from Employee where SALARY between 50000 and 100000;

select e1.FIRST_NAME as EMPLOYEE_NAME,e2.FIRST_NAME as MANAGER_NAME from Employee e1 , Employee e2 where e2.EMP_ID = e1.MANAGER_ID;

select count(*), DEP from Employee group by DEP order by DEP desc; 

select SALARY from Employee group by SALARY order by cast(SALARY as Decimal(6,0)) desc ; 

select EMP_ID from Employee group by EMP_ID having count(EMP_ID)>1;

select FIRST_NAME as "No Manager" from Employee where MANAGER_ID is null;

select Count(*) from Employee where JOINING_DATE like "%14 9%";