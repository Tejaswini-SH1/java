/*CREATE 2 TABLES WITH 5 COLUMNS(5 COLUMN WHILE CREATING TABLE).
1)TABLE NAME: movie_info, bank_details
2)5 columns varchar, 2 int, 2 bigint, 1 boolean
3)ADD 5 COLUMNS USING ALTER
4)RENAME 5 COLUMNS USING ALTER
5)INSERT 10 DATA FOR EACH TABLE.
6)UPDATE 10 DATA FOR DIFFERENT COLUMNS.
7)DELETE 3 DATA FOR DIFFERENT COLUMNS.
8)FETCH DATA USING WHERE, AND, OR,IN, NOT IN.*/



CREATE DATABASE movie;
USE movie;


CREATE TABLE movie(id int,num_of_heros int,budget bigint,hero_budget bigint,is_active boolean
,movie_name varchar(20),producer_name varchar(20),hero_name varchar(20),heroien_name varchar(10),cmd_name varchar(10));

CREATE TABLE BANK_DETAILS(ACCOUNT_NUMBERr VARCHAR(150),ACCOUNT_HOLDER VARCHAR(155),BRANCH VARCHAR(155),BALANCE BIGINT,IS_ACTIVE BOOLEAN);

ALTER TABLE movie
ADD COLUMN movie_title varchar(500),
ADD COLUMN budget bigint,
ADD COLUMN num_of_heros VARCHAR(255),
ADD COLUMN h_names VARCHAR(243),
ADD COLUMN comedian_name VARCHAR(255);

ALTER TABLE BANK_DETAILS
ADD COLUMN ACCOUNT_TYPE VARCHAR(255),
ADD COLUMN OPENED_DATE DATE,
ADD COLUMN LAST_TRANSACTION_DATE DATE,
ADD COLUMN OVER_DRAFT_LIMIT INT,
ADD COLUMN ACCOUNT_STATUS VARCHAR(244);

USE Teju;
ALTER TABLE movie
RENAME COLUMN movie_name TO movie_title,
RENAME COLUMN budget TO movie_budget,
RENAME COLUMN num_of_heros TO heros_num,
RENAME COLUMN heroien_name TO h_names,
RENAME COLUMN cmd_name TO comedian_name;


ALTER TABLE bank_details
RENAME COLUMN account_number TO acct_number,
RENAME COLUMN account_holder TO acct_holder,
RENAME COLUMN branch TO branch_name,
RENAME COLUMN balance TO acct_balance,
RENAME COLUMN is_active TO active_status;


insert into movie values(1,2,200000,100000,true,'kalki','prashanth neel','prabhas','samanta','sadukokil');
insert into movie values(2,1,2000000,300000,false,'kgf','kamalesh','sudeep','priya','chikkanna');
insert into movie values(3,3,2000000,100000,true,'googli','puneet','yash','radhika','bullet');
insert into movie values(4,1,2000000,200000,false,'kgf','kamalesh','darshan','pavitra','kuri');
insert into movie values(5,1,300000,100000,true,'appu','rajkumar','punit','ramya','nayana');
insert into movie values(6,2,500000,100000,true,'charliee','abhishek','rakshit shetty','sangitaa','charu');
insert into movie values(7,1,400000,30000,false,'kiss','arjun','siddharth','shreeleela','sadokokil');
insert into movie values(8,1,60000,10000,false,'kantara','rishab','rishab','saptami','prakash');
insert into movie values(9,1,7000000,200000,false,'hudugaru','venkatesh','pritam','radhika','kuri');
insert into movie values(10,2,400000,100000,true,'abhi','shashi','punit','ramya','doddanna');


INSERT INTO bank_details (acct_number, acct_holder, branch_name, acct_balance, active_status, account_type, opened_date, 
last_transaction_date, overdraft_limit, account_status)
VALUES 
('1234567890', 'Rajesh Kumar', 'Mumbai', 1500000, TRUE, 'Savings', '2020-01-01', '2024-07-01', 50000, 'Good'),
('2345678901', 'Suman Sharma', 'Delhi', 2500000, TRUE, 'Checking', '2019-05-15', '2024-06-28', 100000, 'Good'),
('3456789012', 'Anil Verma', 'Bangalore', 500000, FALSE, 'Savings', '2018-03-22', '2024-07-15', 20000, 'Closed'),
('4567890123', 'Priya Singh', 'Chennai', 7500000, TRUE, 'Checking', '2021-11-05', '2024-07-12', 150000, 'Good'),
('5678901234', 'Rohit Patel', 'Hyderabad', 3000000, TRUE, 'Savings', '2022-07-19', '2024-07-19', 70000, 'Good'),
('6789012345', 'Aarti Jain', 'Kolkata', 1200000, TRUE, 'Savings', '2017-02-14', '2024-07-01', 30000, 'Good'),
('7890123456', 'Vijay Malhotra', 'Pune', 4000000, TRUE, 'Checking', '2016-08-30', '2024-07-05', 200000, 'Good'),
('8901234567', 'Nidhi Gupta', 'Ahmedabad', 2000000, FALSE, 'Savings', '2020-12-01', '2024-07-08', 60000, 'Dormant'),
('9012345678', 'Karan Mehta', 'Jaipur', 600000, TRUE, 'Checking', '2023-04-15', '2024-07-16', 80000, 'Good'),
('0123456789', 'Sneha Agarwal', 'Lucknow', 5000000, TRUE, 'Savings', '2015-09-20', '2024-07-03', 100000, 'Good');

SELECT * FROM movie;
SELECT * FROM bank_details;

UPDATE movie
SET budget = movie_budget + 2000000
WHERE movie_title = 'kgf';

UPDATE movie
SET budget = movie_budget + 1000000
WHERE comedian_name = 'sadukokil';

UPDATE movie
SET h_name = h_name + 30000
WHERE movie_title = 'kiss';

UPDATE movie
SET num_of_heros = num_of_heros + 600000
WHERE movie_title = 'kantara';

UPDATE movie
SET heroien_name = heroien_name + 100000
WHERE movie_title = 'abhi';

UPDATE bank_details
SET acct_balance = acct_balance - 100000
WHERE acct_holder = 'Rajesh Kumar';

UPDATE bank_details
SET overdraft_limit = overdraft_limit + 20000
WHERE account_type = 'Checking';

UPDATE bank_details
SET active_status = FALSE
WHERE acct_number = '6789012345';

UPDATE bank_details
SET account_status = 'Overdue'
WHERE acct_balance < 1000000;

UPDATE bank_details
SET last_transaction_date = '2024-07-20'
WHERE acct_holder = 'Rohit Patel';


DELETE FROM bank_details WHERE acct_balance=500000 ;
DELETE FROM bank_details WHERE acct_holder= 'Aarti Jain' ;
DELETE FROM bank_details WHERE account_status= 'Closed' ;


DELETE FROM movie WHERE movie_title='abhi';
DELETE FROM movie WHERE movie_budget=400000;
DELETE FROM movie WHERE comedian_name ='doddanna';


SELECT * FROM movie
WHERE movie_title = 'kantara';

SELECT * FROM bank_details
WHERE acct_balance > 2000000 AND active_status = TRUE;

SELECT * FROM movie
WHERE movie_comedian = 'sadukokil' OR movie_comedian = 'chikkanna';

SELECT * FROM bank_details
WHERE acct_holder IN ('Rajesh Kumar', 'Suman Sharma', 'Rohit Patel');

SELECT * FROM movie
WHERE producer_name NOT IN ('Rishab');


