CREATE TABLE patient (
	patient_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR ( 50 ) NOT NULL,
	phone_number VARCHAR ( 50 ),#DOB YEAR(date)
	DOB VARCHAR ( 5 ),
	community_name VARCHAR ( 50 ) 
);
INSERT INTO patient ( name, phone_number, DOB, community_name)
VALUES
	( "Ruolin", "1213131415", "1999","North York" ),
	( "PatientA", "1111111111", "1990","Toronto Downtown" ),
	( "PatientB", "1211111111", "1980","Toronto Downtown" ),
	( "PatientC", "1131111111", "1970","Markham" ),
	( "PatientD", "1114111111", "1960","Scarborough" ),
	( "PatientE", "1111511111", "2000","North York" );