CREATE SCHEMA `university` ;

CREATE TABLE `university`.`student` (
  `studentId` INT NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  PRIMARY KEY (`studentId`));

CREATE TABLE `university`.`teacher` (
  `teacherId` INT NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  PRIMARY KEY (`teacherId`));
  
  CREATE TABLE `university`.`classroom` (
  `classRoomId` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL,
  `subject` VARCHAR(45) NULL,
  PRIMARY KEY (`classRoomId`));

USE `university`;
DROP procedure IF EXISTS `getStudents`;

DELIMITER $$
USE `university`$$
CREATE PROCEDURE `getStudents` ()
BEGIN
	select * from student;
END$$

DELIMITER ;

USE `university`;
DROP procedure IF EXISTS `getStudentById`;

DELIMITER $$
USE `university`$$
CREATE PROCEDURE `getStudentById` (Id int)
BEGIN
	select * from student
    where studentId = Id;
END$$

DELIMITER ;

USE `university`;
DROP procedure IF EXISTS `createStudent`;

DELIMITER $$
USE `university`$$
CREATE PROCEDURE `createStudent` (fName varchar(45), lName varchar(45))
BEGIN
	insert into student (firstName, lastName)
    values (fName, lname);
END$$

DELIMITER ;

USE `university`;
DROP procedure IF EXISTS `updateStudent`;

DELIMITER $$
USE `university`$$
CREATE PROCEDURE `updateStudent` (Id int, fName varchar(45), lName varchar(45))
BEGIN
	update student set firstName = fName, lastName = lName
    where studentId = Id;
END$$

DELIMITER ;

USE `university`;
DROP procedure IF EXISTS `deleteStudent`;

DELIMITER $$
USE `university`$$
CREATE PROCEDURE `deleteStudent` (Id int)
BEGIN
	delete from student
    where studentId = Id;
END$$

DELIMITER ;

USE `university`;
DROP procedure IF EXISTS `getTeachers`;

DELIMITER $$
USE `university`$$
CREATE PROCEDURE `getTeachers` ()
BEGIN
	select * from teacher;
END$$

DELIMITER ;

USE `university`;
DROP procedure IF EXISTS `getTeacherById`;

DELIMITER $$
USE `university`$$
CREATE PROCEDURE `getTeacherById` (Id int)
BEGIN
	select * from teacher
    where teacherId = Id;
END$$

DELIMITER ;

USE `university`;
DROP procedure IF EXISTS `createTeacher`;

DELIMITER $$
USE `university`$$
CREATE PROCEDURE `createTeacher` (fName varchar(45), lName varchar(45))
BEGIN
	insert into teacher (firstName, lastName)
    values (fName, lname);
END$$

DELIMITER ;

USE `university`;
DROP procedure IF EXISTS `updateTeacher`;

DELIMITER $$
USE `university`$$
CREATE PROCEDURE `updateTeacher` (Id int, fName varchar(45), lName varchar(45))
BEGIN
	update teacher set firstName = fName, lastName = lName
    where teacherId = Id;
END$$

DELIMITER ;

USE `university`;
DROP procedure IF EXISTS `deleteTeacher`;

DELIMITER $$
USE `university`$$
CREATE PROCEDURE `deleteTeacher` (Id int)
BEGIN
	delete from teacher
    where teacherId = Id;
END$$

DELIMITER ;

USE `university`;
DROP procedure IF EXISTS `getClassrooms`;

DELIMITER $$
USE `university`$$
CREATE PROCEDURE `getClassrooms` ()
BEGIN
	select * from classroom;
END$$

DELIMITER ;

USE `university`;
DROP procedure IF EXISTS `getClassroomById`;

DELIMITER $$
USE `university`$$
CREATE PROCEDURE `getClassroomById` (Id int)
BEGIN
	select * from classroom
    where classRoomId = Id;
END$$

DELIMITER ;

USE `university`;
DROP procedure IF EXISTS `createClassroom`;

DELIMITER $$
USE `university`$$
CREATE PROCEDURE `createClassroom` (cName varchar(45), subj varchar(45))
BEGIN
	insert into classroom (name, subject)
    values (cName, subj);
END$$

DELIMITER ;

USE `university`;
DROP procedure IF EXISTS `updateClassroom`;

DELIMITER $$
USE `university`$$
CREATE PROCEDURE `updateClassroom` (Id int, cName varchar(45), subj varchar(45))
BEGIN
	update classroom set name = cName, subject = subj
    where classroomId = Id;
END$$

DELIMITER ;

USE `university`;
DROP procedure IF EXISTS `deleteClassroom`;

DELIMITER $$
USE `university`$$
CREATE PROCEDURE `deleteClassroom` (Id int)
BEGIN
	delete from classroom
    where classRoomId = Id;
END$$

DELIMITER ;


 