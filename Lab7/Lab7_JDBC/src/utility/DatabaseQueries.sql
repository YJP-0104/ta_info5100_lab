
create database medicaldb;
USE medicaldb;

CREATE TABLE patient (
    id int PRIMARY KEY AUTO_INCREMENT,
    
    firstname varchar(100),
    lastname varchar(100),
    gender varchar(10),
    age int,
    patient_type varchar(50)
    
);

INSERT INTO patient(firstname ,  lastname , gender , age  , patient_type) values ('YASH' , 'PATEL' , 'MALE' , 22 , 'Appointment');
SELECT * FROM patient; 

show databases;