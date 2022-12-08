use Water
CREATE TABLE Users
(
UserId int IDENTITY(1,1),
Email varchar(50) NOT NULL,
Password varchar(50) NOT NULL,
FirstName varchar(50) NOT NULL,
LastName varchar(50) NOT NULL,
Address varchar(50) NOT NULL,
DateOfBirth varchar(50) NOT NULL,
Age int NOT NULL,
ContactNo int NOT NULL,
UserStatus varchar(50) NULL,
primary key( UserId,Email,Password,ContactNo)
)
CREATE TABLE Admins
(
AdminId int IDENTITY(1,1),
Email varchar(50) NOT NULL,
Password varchar(50) NOT NULL,
AdminName varchar(50) NOT NULL,
primary key( AdminId,Email,Password)
)
CREATE TABLE Employee
(
EmpId int IDENTITY(1,1),
ContactNo varchar(50) NOT NULL,
EmpName varchar(50) NOT NULL,
Salary int NOT NULL,
Address varchar(50) NOT NULL,
Age int NOT NULL,
primary key( EmpId,ContactNo)
)
CREATE TABLE Packages
(
PackageId int IDENTITY(1,1) PRIMARY KEY,
Description varchar(50) NOT NULL,
Price int NOT NULL,
Quantity int NULL,
Feedback varchar(50) NOT NULL,
Location varchar(50) NOT NULL,

EmpId int NOT NULL ,
EmpContactNo varchar(50) NOT NULL,
AdminId int NOT NULL,
AdminEmail varchar(50) NOT NULL,
AdminPassword varchar(50) NOT NULL,

foreign key(EmpId,EmpContactNo) references Employee (EmpId,ContactNo),
foreign key( AdminId,AdminEmail,AdminPassword) references Admins ( AdminId,Email,Password)
)


CREATE TABLE Delivery
(
DeliveryId int IDENTITY(1,1) PRIMARY KEY,
EmpId int NOT NULL ,
EmpContactNo varchar(50) NOT NULL,
UserContactNo int NOT NULL,
Email varchar(50) NOT NULL,
Password varchar(50) NOT NULL,
UserId int NOT NULL,
Status varchar(50) NOT NULL,
Address varchar(50) NOT NULL,
PackageId int NOT NULL FOREIGN KEY REFERENCES Packages(PackageId),


foreign key(EmpId,EmpContactNo) references Employee (EmpId,ContactNo),
foreign key(UserId,Email,Password,UserContactNo) references Users ( UserId,Email,Password,ContactNo)
)


CREATE TABLE Payment
(
PaymentId int IDENTITY(1,1) PRIMARY KEY,
UserId int NOT NULL,
TotalPrice int NOT NULL,
Method varchar(100) NOT NULL
)

CREATE TABLE Feedback
(
 Description varchar(50) NOT NULL,
 Pay int NOT NULL,
 Deliver int NOT NULL,
 PriceRate int NOT NULL,
 EmpService int NOT NULL,
 PRIMARY KEY (Pay,Deliver,PriceRate,EmpService)
)

INSERT INTO Users (Email,Password,FirstName,LastName,Address,DateOfBirth,Age,ContactNo,UserStatus)
Values	('a@gmail.com','1234','A','B','Dhaka','2000-02-01',25,5264,'Active'),
		('b@gmail.com','12345','C','G','Dhaka','2000-03-01',24,1264,'Active'),
		('c@gmail.com','12346','D','H','Dhaka','2000-04-01',28,3264,'Active'),
		('d@gmail.com','12347','E','I','Dhaka','2000-05-01',21,1324,'Active'),
		('e@gmail.com','12348','F','J','Dhaka','2000-06-01',29,1326,'Active'),
		('f@gmail.com','12341','G','K','Dhaka','2000-05-01',22,1224,'Active'),
		('g@gmail.com','12248','H','L','Dhaka','2000-07-01',31,1386,'Active'),
		('h@gmail.com','13347','E','M','Dhaka','2000-08-01',32,1394,'Active'),
		('i@gmail.com','14348','F','N','Dhaka','2000-09-01',34,1456,'Active'),
		('j@gmail.com','15347','E','O','Dhaka','2000-10-01',37,1077,'Active'),
		('k@gmail.com','16348','F','P','Dhaka','2000-11-01',40,1886,'Active')

INSERT INTO Admins(Email,Password,AdminName)
values('rahim@gmail.com',4566,'Rahim'),
      ('karim@gmail.com',4596,'karim'),
      ('rahian@gmail.com',4565,'Rahain'),
	  ('rahima@gmail.com',4564,'Rahima'),
      ('nilima@gmail.com',4563,'nilima'),
	  ('jamil@gmail.com',4562,'jamil'),
      ('samu@gmail.com',4561,'samu')

Insert Into Employee(ContactNo,EmpName,Salary,Address,Age)
values(01234,'sanjida',2214,'Dhaka',30),
      (01454,'tania',5677,'Dhaka',45),
	  (01980,'rumi',5678,'Nator',45),
	  (01645,'taher',5432,'Rajsha',35),
	  (014553,'abid',4678,'Khulna',40),
	  ( 01354,'parvin',5677,'Dhaka',45),
	  (01940,'sonia',5678,'Nator',45),
	  (01685,'tamim',5432,'Rajsha',35),
	  (0149053,'abir',4678,'Khulna',40),
	  (01933,'nafis',5078,'Nator',25),
	  (01632,'zaman',3332,'Rajsha',33),
	  (01453,'ayon',468,'Khulna',50)


insert into Packages(Description,Price,Quantity,Feedback,Location,EmpId,EmpContactNo,AdminId,AdminEmail,AdminPassword)
values  ('Package 1',2000,5,'Good','Dhaka',1,01234,1,'rahim@gmail.com',4566),
		('Package 2',1000,10,'Good','Dhaka',2,01454,2,'karim@gmail.com',4596),
		('Package 3',3000,3,'Average','Dinjapur',3,01980,3,'rahian@gmail.com',4565)
		/*8	package 4	4000	5	Good	Khulna	2	1454	1	rahim@gmail.com	4566
		9	package 9	2000	5	Good	Dhaka	2	1454	1	rahim@gmail.com	4566
		10	package 9	2000	900	Good	Sylhet	1	1234	1	rahim@gmail.com	4566
		11	package 10	2000	900	Good	Rangpur	1	1234	1	rahim@gmail.com	4566
		12	package 10	1000	3	Good	Barisal	3	1980	1	rahim@gmail.com	4566
		13	package 10	1000	8	Average	Barisal	3	1980	1	rahim@gmail.com	4566
		14	package 9	1000	8	Average	Dhaka	3	1980	1	rahim@gmail.com	4566
		15	package 9	1000	4	Average	Dhaka	3	1980	1	rahim@gmail.com	4566
		17	package 9	1000	4	Average	Dhaka	2	1454	1	rahim@gmail.com	4566
		18	package 9	1000	5	Average	Rajshahi	2	1454	1	rahim@gmail.com	4566
		19	package 10	1000	5	Average	Rajshahi	1	1234	1	rahim@gmail.com	4566
		20	package 10	1000	5	Average	Sirajgonj	1	1234	1	rahim@gmail.com	4566
		21	Package 21	850	15	Good	Munshigonj	4	1645	1	rahim@gmail.com	4566
		22	package 1	950	4	Average	Chittagong	1	1234	1	rahim@gmail.com	4566
		23	package 1	1000	4	Average	Chittagong	1	1234	1	rahim@gmail.com	4566*/

INSERT INTO Delivery(EmpId,EmpContactNo,UserContactNo,Email,Password,UserId,Status,Address,PackageId)
VALUES  (1,01234,5264,'a@gmail.com','1234',1,'Not Delivered','Dhaka',1),
		(2,01454,1264,'b@gmail.com','12345',2,'Not Delivered','Dhaka',2),
		(3,01980,3264,'c@gmail.com','12346',3,'Not Delivered','Dhaka',3)


INSERT INTO Payment(UserId,TotalPrice,Method)
VALUES  (1,10000,'Bkash'),
		(2,3000,'Rocket'),
		(3,12000,'Cash')

SELECT * FROM Users
SELECT * FROM Admins
SELECT * FROM Employee
SELECT * FROM Packages
SELECT * FROM Payment
SELECT * FROM Delivery
SELECT * FROM Feedback

drop table Payment
drop table Delivery

UPDATE Users SET UserStatus='Inactive'



