
#create table communityList first
create table HospitalList(
hospital_id INT PRIMARY KEY,
hospital_name VARCHAR(50) not null,
hospital_communityname VARCHAR(50) not null,
CONSTRAINT fk_HospitalList_communityname FOREIGN KEY (hospital_communityname) REFERENCES communityList(community_name)  ON UPDATE CASCADE ON DELETE RESTRICT
);

INSERT into HospitalList
VALUES(1,'North York Hospital','North York');
INSERT into HospitalList
VALUES(2,'Downtown Hospital','Toronto Downtown');
INSERT into HospitalList
VALUES(3,'Toronto Hospital','Toronto Downtown');
INSERT into HospitalList
VALUES(4,'Markham Hospital','Markham');
INSERT into HospitalList
VALUES(5,'Medical Examination Center','Scarborough');
