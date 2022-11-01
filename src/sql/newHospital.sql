-- 
-- #create table communityList first
-- create table HospitalList(
-- hospital_id INT PRIMARY KEY AUTO_INCREMENT,
-- hospital_name VARCHAR(50) not null,
-- hospital_communityname VARCHAR(50) not null,
-- CONSTRAINT fk_HospitalList_communityname FOREIGN KEY (hospital_communityname) REFERENCES communityList(community_name)  ON UPDATE CASCADE ON DELETE RESTRICT
-- );
-- 
-- INSERT into HospitalList (hospital_name, hospital_communityname)
-- VALUES('North York Hospital','North York'),
-- ('Downtown Hospital','Toronto Downtown'),
-- ('Toronto Hospital','Toronto Downtown'),
-- ('Markham Hospital','Markham'),
-- ('Medical Examination Center','Scarborough');



#create table communityList first
create table HospitalList(
hospital_id INT PRIMARY KEY AUTO_INCREMENT,
hospital_name VARCHAR(50) not null unique,
hospital_communityname VARCHAR(50) not null,
CONSTRAINT fk_HospitalList_communityname FOREIGN KEY (hospital_communityname) REFERENCES communityList(community_name)  ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT into HospitalList (hospital_name, hospital_communityname)
VALUES('North York Hospital','North York'),
('Downtown Hospital','Toronto Downtown'),
('Toronto Hospital','Toronto Downtown'),
('Markham Hospital','Markham'),
('Medical Examination Center','Scarborough');
