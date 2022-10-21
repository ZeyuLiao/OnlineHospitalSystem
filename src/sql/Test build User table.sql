CREATE TABLE login (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(25) NOT NULL,
		password VARCHAR(25) NOT NULL,
		state INT NOT NULL comment '1: patient,2: doctor, 3: hospital administrator,4: community administrator,5: System administrator'

);




