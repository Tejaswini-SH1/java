

CREATE DATABASE destination;
USE destination;

create table trip(tripid int primary key,tripname varchar(30),location varchar(30));
CREATE TABLE travels(id INT PRIMARY KEY,name VARCHAR(30) NOT NULL,email VARCHAR(30) UNIQUE NOT NULL,phone VARCHAR(15),
deptid INT,FOREIGN KEY (tripid) REFERENCES trip(tripid));
insert into trip(tripid,tripname,location) values(1,'stachu','hampi'),(2,'temple','halebidu'),(3,'kamalbasti','belgaum'),
(4,'abbefalls','khanapur'),(5,'siddarudha temple','hubli')(6,'engg','china'),(7,'trainer','newyork')
(8,'murugamata','dharwad'),(9,'iskon temple','bangalore'),(10,'nandi hills','Bangalore');
insert into travels(travelsid,name,email,phone,ticketno) values
(1,'srs','srs@gmail.com','8660058812',201), 
(2,'vijayanand','vijaya@gmail.com',8660058813,202),
(3,'sugama','sugmi@gmail.com','8660058814',203),
(4,'reshma','reshmi@gmail.com','8660058815',204);
(5,'vrl','vrl@gmail.com','8660058816',205),
(6,'orange','orange@gmail.com','8660058817',206),
(7,'ambari','ambari@gmail.com','8660058815',207),
(8,'redbus','redbus@gmail.com','8660058815',208),
(9,'sm','sm@gmail.com','8660058815',209),
(10,'aarohi','aarohi@gmail.com','8660058815',200);



