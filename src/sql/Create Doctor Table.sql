-- create table DoctorList(
-- doctor_id INT PRIMARY KEY AUTO_INCREMENT,
-- doctor_name VARCHAR(50) not null,
-- hospital_name VARCHAR(50) not null,
-- department VARCHAR(50) not null,
-- phone_number VARCHAR(50) not null,
-- photo_address VARCHAR(50) not null
-- );
-- 
-- INSERT into DoctorList (doctor_name, hospital_name,department,phone_number,photo_address)
-- VALUES ('Aaron Hendler','Downtown Hospital','Emergency Clinic','4378861089','src//photo//Aaron_Hendler.jpg'),
-- ('Stephen Herman','North York Hospital','pharmacy','6477879723','src//photo//Stephen_Herman.jpg');

create table DoctorList(
doctor_id INT PRIMARY KEY AUTO_INCREMENT,
doctor_name VARCHAR(50) not null,
hospital_name VARCHAR(50) not null,
CONSTRAINT fk_hospitalName FOREIGN KEY (hospital_name) REFERENCES HospitalList(hospital_name) ON UPDATE CASCADE ON DELETE CASCADE,
department VARCHAR(50) not null,
phone_number VARCHAR(50) not null,
photo_address VARCHAR(50) not null
);

INSERT into DoctorList (doctor_name, hospital_name,department,phone_number,photo_address)
VALUES ('Aaron Hendler','Downtown Hospital','Emergency Clinic','4378861089','src//photo//Aaron_Hendler.jpg'),
('Stephen Herman','North York Hospital','pharmacy','6477879723','src//photo//Stephen_Herman.jpg');