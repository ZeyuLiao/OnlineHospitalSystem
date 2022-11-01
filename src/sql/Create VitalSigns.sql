create table VitalSigns(
vitalSign_id INT PRIMARY KEY AUTO_INCREMENT,
blood_pressure INT not null,
heat_beat_rate INT not null,
blood_sugar DOUBLE not null,
white_blood_cells DOUBLE not null
);

-- INSERT into HospitalList (blood_pressure, heat_beat_rate,blood_sugar,white_blood_cells)
-- VALUES(80,100,7.2,5.6),
-- (80,100,7.2,5.6)
