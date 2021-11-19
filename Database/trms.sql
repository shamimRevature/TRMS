----------------------------------- 01.Employee -----------------------------


drop table if exists employee;

create table if not exists employee(
	emp_id serial primary key,
	emp_name varchar(50),
	supervisor_id int references supervisor(sup_id),
	department varchar(50),
	fund_eligable int
);

insert into employee values (default,'Shamimur',2,'Production',5000);
insert into employee values (default,'Rahman',1,'Sales',5000);
insert into employee values (default,'Richard',2,'Marketing',5000);
insert into employee values (default,'Jony',1,'Production',5000);
insert into employee values (default,'Mike',2,'Production',5000);
insert into employee values (default,'Robert',2,'Testing',5000);
insert into employee values (default,'Steave',2,'Production',5000);
insert into employee values (default,'Jose',1,'Sales',5000);
insert into employee values (default,'Ron',1,'Sales',5000);
insert into employee values (default,'Kevin',1,'Sales',5000);
insert into employee values (default,'Albert',1,'Sales',5000);
insert into employee values (default,'Kristina',1,'Sales',5000);


select * from employee;
delete from employee;

------------------------------------ 02.Supervisor-------------------------
drop table if exists supervisor;

create table if not exists supervisor(
	sup_id serial primary key,
	emp_id int references employee(emp_id),
	sup_name varchar(50)
);

insert into supervisor values (default,3,'Richard');
insert into supervisor values (default,7,'Steave');


select * from supervisor;
delete from supervisor;

-------------------------------------- 03.Events------------------------------------

drop table if exists events;

create table if not exists events(
	event_id int primary key,
	event_name varchar(50),--university course, seminar, cert.prep, certification,tech,others
	req_gra numeric(12,2),
	req_letter char,
	req_number int,
	fund_ratio numeric(12,2)
);

insert into events values (1,'University Course',3.5,'B',80,0.8);
insert into events values (2,'Seminars',3.5,'B',80,0.6);
insert into events values (3,'Certification Preparation Classes',3.5,'B',80,0.75);
insert into events values (4,'Certification',3.5,'B',80,1.0);
insert into events values (5,'Technical Training',3.5,'B',80,0.9);
insert into events values (6,'Others',3.5,'B',80,0.3);

delete from events
select * from events


----------------------------------------- 4.Status------------------------------

drop table if exists status;

create table if not exists status(
	st_id int primary key,
	st_name varchar(100)
);

insert into status values (1,'Applied');
insert into status values (2,'Supervisor Reviewing');
insert into status values (3,'Supervisor Request Documents from Employee');
insert into status values (4,'Supervisor Approved');
insert into status values (5,'Supervisor Denied');
insert into status values (6,'Department Head Reviewing');
insert into status values (7,'Department Head Apporved');
insert into status values (8,'Department Head Denied');
insert into status values (9,'Department Head Request Document to Employee');
insert into status values (10,'Department Head Request Document to Supervisor');
insert into status values (11,'Benifit Coordinator Reviewing');
insert into status values (12,'Benifit Coordinator Requesting Documents from Employee');
insert into status values (13,'Benifit Coordinator Requesting Documents from Supervisor');
insert into status values (14,'Benifit Coordinator Requesting Documents from Department Head');
insert into status values (15,'Benifit Coordinator Initial Approved and waiting for Final Grade');
insert into status values (16,'Benifit Coordinator Denied');
insert into status values (17,'Benifit Coordinator Fund Updated');
insert into status values (18,'Benifit Coordinator Approved and Fund Released');


select * from status

delete from status

-----------------------------05.Application---------------------------------

drop table if exists application;

create table if not exists application (
	app_id serial Not Null primary key,
	event_id int references events(event_id) on delete set null,
	emp_id int references employee(emp_id),
	emp_name varchar(50),
	start_date int,
	end_date int,
	event_cost int,
	final_grade varchar(10) default null,
	urgent boolean default false ,
	work_rel boolean default true,
	status int references status(st_id) default 1
);

insert into application values (default, 1, 1,'Tony',10192021,10192022,5000,default,default,default,default);
insert into application values (default, 2, 2,'Jon',10192021,10192022,3000,default,default,default,default);
insert into application values (default, 1, 3,'Shamim',10192021,10192022,5000,default,default,default,6);
insert into application values (default, 2, 4,'Thomas',10192021,10192022,3000,default,default,default,7);
insert into application values (default, 1, 5,'Rahman',10192021,10192022,5000,default,default,default,4);
insert into application values (default, 2, 6,'Steave',10192021,10192022,3000,default,default,default,14);
insert into application values (default, 2, 7,'Jony',10192021,10192022,3000,default,default,default,11);

select * from application

delete from application where app_id >5





-----------------------------------6. login------------------------
drop table if exists login;

create table if not exists login(
	user_id int primary key references employee(emp_id),
	user_pass varchar(50)
);

insert into login values (1,'1234');
insert into login values (2,'1234');
insert into login values (3,'1234');
insert into login values (4,'1234');
insert into login values (5,'1234');
insert into login values (6,'1234');
insert into login values (7,'1234');


select * from login;
delete from login;




-------------------------------------7. Department Head---------------------

drop table if exists deptment_head;

create table if not exists deptment_head(
	dep_h_id serial primary key,
	emp_id int references employee(emp_id),
	dep_h_name varchar(50),
	department varchar(50)
);

insert into deptment_head values (default,5,'Mike','Production');
insert into deptment_head values (default,7,'Steave','Production');


select * from deptment_head;
delete from deptment_head;


----------------------------------- 8.Benifit coordinator------------------------

drop table if exists benifit_co;

create table if not exists benifit_co(
	ben_id serial primary key,
	emp_id int references employee(emp_id),
	emp_name varchar(50)
);

insert into benifit_co values (default,1,'Shamimur');


select * from benifit_co;
delete from benifit_co;




