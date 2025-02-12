-- create database HospitalManagementSystem;
use HospitalManagementSystem;
-- create table patient(
-- pid int unique auto_increment primary key,
-- name varchar(50),
-- age int,
-- diagnose varchar(250),
-- personalInfo varchar(300)
-- );
-- create table doctor(
-- did int unique auto_increment primary key,
-- name varchar(50),
-- doctype varchar(50),
-- salary int,
-- personalInfo varchar(250)
-- );
-- create table appointment(
-- aid int auto_increment primary key,
-- doctorid int not null,
-- patientid int not null,
-- date date not null,
-- fee int,
-- foreign key (doctorid) references doctor(did) on delete no action on update no action,
-- foreign key (patientid) references patient(pid) on delete no action on update no action
-- );
-- create table bill(
-- bid int auto_increment primary  key,
-- payment int not null,
-- name varchar(50),
-- patientid int not null,
-- doctorid int not null,
-- date date
-- );
-- select * from bill;
-- select * from appointment;
-- select * from patient;
--  select * from doctor;
-- create procedure inputDataInPatient(in name varchar(50), in age int, in diagnose varchar(250), in personalInfo varchar(50))
-- begin
-- insert into patient(name,age,diagnose,personalInfo) values (name,age,diagnose,personalInfo);
-- end //
-- call inputDataInPatient('ali',19,'calcium', 'lahore');
-- delimiter //
-- create procedure updateDataInPatient(in searchId int, in newName varchar(50), in newAge int, in newDiagnose varchar(250), in newPersonalInfo varchar(250))
-- begin
-- update patient set name = newName, age = newAge, diagnose = newDiagnose, personalInfo = newPersonalInfo where pid = searchId;
-- end //
-- call updateDataInPatient(1,'adnan',20,'fever','lahore');
-- create procedure showPateint()
-- begin
-- select * from patient;
-- end//
-- call showPateint();
-- delimiter //
-- create procedure deletePatient(in searchId int)
-- delete from patient where pid = searchId;
-- end//
delimiter //
-- call showPateint();
-- create procedure inputDataInDoctor(in name varchar(50), in doctype varchar(50), in salary int, in personalInfo varchar(250))
-- begin
-- insert into doctor (name,doctype,salary,personalInfo) values (name,doctype,salary,personalInfo);
-- end //
-- create procedure showDoctor()
-- begin
-- select * from doctor;
-- end//
-- create procedure updateDateInDoctor(in searchId int, in newName varchar(50), in newDoctype varchar(50), in newSalary int, in newPersonalInfo varchar(250))
-- begin
-- update doctor set name = newName, doctype = newDoctype, salary = newSalary, personalInfo = newPersonalInfo where did = searchId;
-- end //
-- create procedure deleteDoctor(in searchId int)
-- delete from doctor where did = searchId;
-- end//
-- create procedure insertDataInAppointment(in pid int, in did int, in date date, in fee int)
-- begin
-- insert into appointment(patientid,doctorid,date,fee) values (pid,did,date,fee);
-- end//
-- create procedure deleteAppointmentByPID(in pID int)
-- begin
-- delete from appointment where patientid = pID;
-- end//
-- create procedure deleteAppointmentByAID(in aID int)
-- begin
-- delete from appointment where aid = aID;
-- end//
-- create procedure insertDataInBill(in payment int, in name varchar(50), in pid int, in did int, in d date)
-- begin
-- insert into bill(payment,patientid,doctorid,date) values (payment,pid,did,d) ;
-- end//
-- create procedure showBill()
-- begin
-- select * from bill;
-- end//
-- delimiter //
-- call insertDataInAppointment(1,1,'2024-09-11',2000);
-- create procedure searchAppointmentByDid(in searchid int)
-- begin
-- select * from appointment where doctorid = searchid;
-- end//
-- create procedure searchBillByDate(in dateS date)
-- begin
-- select * from bill where date = dateS;
-- end//
-- create procedure searchBillByPatient(in searchName varchar(50))
-- begin
-- select * from bill where name = searchName;
-- end//