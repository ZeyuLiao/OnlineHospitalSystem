CREATE TABLE patient (
	PatientId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR ( 50 ) NOT NULL,
	PhoneNumber VARCHAR ( 50 ),#DOB YEAR(date)
	DOB VARCHAR ( 5 ),
	Address VARCHAR ( 50 ) 
);
INSERT INTO patient ( NAME, PhoneNumber, DOB )
VALUES
	( "Ruolin", "1213131415", "1999" ),
	( "PatientA", "1111111111", "1990" ),
	( "PatientB", "1211111111", "1980" ),
	( "PatientC", "1131111111", "1970" ),
	( "PatientD", "1114111111", "1960" ),
	( "PatientE", "1111511111", "2000" );