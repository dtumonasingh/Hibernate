create database hibernateDB;
use hibernateDB;
create table employee(
empID integer(20) primary key not null auto_increment,
firstName varchar(110),
lastName varchar(110),
salary integer(20),
created_at timestamp default current_timestamp,
updated_at timestamp default current_timestamp on update current_timestamp
);


create table address(
id integer(20) primary key not null auto_increment,
streetNo varchar(110),
city varchar(110),
created_at timestamp default current_timestamp,
updated_at timestamp default current_timestamp on update current_timestamp
);



alter table employee
add column address_id int(20);
alter table employee
add constraint fk_employee_addr foreign key
 employee(address_id) references address(id);

 create table phone(
 id int primary key auto_increment,
 number varchar(20)
);

alter table phone
add column employee_id int(20);

alter table phone
add constraint fk_employee_phone foreign key
 phone(employee_id) references employee(empID);