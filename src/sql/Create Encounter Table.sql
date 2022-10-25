CREATE TABLE encounter (
	encounter_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	doctor_id INT NOT NULL,
	patient_id INT NOT NULL,
	state boolean,
	vitalsign_id INT,
	symptom VARCHAR ( 100 ),
	diagnosis VARCHAR ( 100 ),
	start_date DATE,
	end_date DATE 
);