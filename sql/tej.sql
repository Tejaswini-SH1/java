/*CREATE DATABASE database_name;*/
CREATE DATABASE Xworkz;
SHOW DATABASES;
/*CREATE TABLE table_name(column datatype, column datatype);*/
CREATE TABLE employee(id int, emp_name varchar(20), emp_sal bigint, emp_loc varchar(10)); 
/*(bigint is used for long numbers)*/
CREATE TABLE students(id int, stu_name varchar(10), stu_cls bigint, stu_loc varchar(22));
SHOW DATABASEs; 

/*day3 july.12*/
CREATE DATABASE product;
SHOW DATABASES;
/*ALTER TABLE product ADD COLUMN p_brand varchar (30);*/
ALTER TABLE PROJECT_DETAILS ADD COLUMN project_guide varchar(20);

/*day4 juky.13*/
CREATE DATABASE employee_details;
USE employee_details;
create table emp_det;
INSERT INTO emp_det values(1,'Teju','belagavi', 20000,8151072002);






