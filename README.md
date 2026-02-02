# Student Management System

A simple Student Management System to manage students, courses, and enrollments. Fill in project-specific details below.

## Features

- Create, read, update, and delete student records
- Manage courses and enrollments
- Search and filter student data

## Technologies

- Java , Jdbc connector driver, MYSQL, JavaFx-Sdk , 
## Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/RajChaudhari7/StudentManagementSystem.git
   cd StudentManagementSystem
   ```

2. Follow project-specific setup steps (install dependencies, configure environment variables):

   First install the JDBC Driver.
   
   Then install javaFx-Sdk v-25.

   Then install Java v greater then 23.

   Then paste the path with lib in environment variables.

   Note: Place all the downloaded file in Program Files in Localdisk C (for safer side).

   And then run this command :

   For Compilation :

   javac --module-path "C:\Program Files\javafx-sdk-25.0.2\lib" ^
 --add-modules javafx.controls,javafx.fxml ^
 -cp "lib\mysql-connector-j-8.0.33.jar" ^
 -d out ^
 src\com\sms\*.java

After Compilation Succesful:

java --module-path "C:\Program Files\javafx-sdk-25.0.2\lib" ^
 --add-modules javafx.controls,javafx.fxml ^
 -cp "out;lib\mysql-connector-j-8.0.33.jar" ^
 com.sms.Main

 
   ```

## Usage

It is the simple Application where anyone can add student , update student details, can delete student details and lastly can view the student details. 

## Contributing

Contributions are welcome. Please open an issue to discuss changes and submit pull requests.
