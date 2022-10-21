CREATE TABLE encounter (
	EncounterId INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	DoctorId INT NOT NULL,
	PatientId INT NOT NULL,
	State boolean,
	VitalSignId INT,
	Symptom VARCHAR ( 100 ),
	Diagnosis VARCHAR ( 100 ),
	StartDate DATE,
EndDate DATE 
);