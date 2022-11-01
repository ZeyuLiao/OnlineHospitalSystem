CREATE TABLE encounter (
	encounter_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	doctor_id INT NOT NULL,
	patient_id INT NOT NULL,
	state boolean,
	symptom VARCHAR ( 100 ),
	diagnosis VARCHAR ( 100 ),
	start_date DATE,
	end_date DATE, 
	blood_pressure INT,
	heart_beat_rate INT,
	blood_sugar DOUBLE,
	white_blood_cells DOUBLE
);