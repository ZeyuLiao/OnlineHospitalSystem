# 5100 Assignment3 OnlineHospitalSystem
Cheers love! Ambulance here!

## Contributors

Zeyu Liao, Ruolin Li, Ziyu Lu

## Important features

- Databse Design. 
  - Use JDBC Driver for MySQL
  - Use NOT NULL, UNIQUE, Primary Key
  - Use foreign key，Cascade delete and Cascade update to ensure data integrity
  - The table structure is concise and clear, meeting 3NF Database Paradigm

- Multi-Layer Architecture Design
  - Implement Dao Pattern to implement data access from database
  - Have separated View, Model, Data Access Layer, Business Logic Layer

- UI Design
  - Have consistent layout designs
  - Have navigation bar to switch between pages
  - Implement picture display, supporting picture upload

- Have strong data validation
  - Include various test scenarios
  - Include Outlier and Null checks
  - Have Timely-updated Dynamic comboBox

## Implemented rich multi-role features：

1. Patient can book an appointment with doctor, supporting selecting hospital, doctor, managing appointments, updating personal information.
2. Docotor can record vital signs and give the diagnosis with new appointment notify features. 
   Support managing appointments and updating personal information.
3. Have Multi-role Administrator 
  - Hospital Admin can manage doctor profile
  - Community Admin can manage hospital profile
  - System Admin can manage patient, hospital, community
 
 ## Class diagram
 ![926f659cd50fe02ac1531841e85a9d3](https://user-images.githubusercontent.com/113488430/199385029-36a81eaf-09a3-41c9-95d7-b2dc06a608a3.png)

 ## Sequence Diagram
 ![sequence diagram](https://user-images.githubusercontent.com/113486280/199388400-3245456b-43e1-4182-a446-922a32c6ee42.png)


 
