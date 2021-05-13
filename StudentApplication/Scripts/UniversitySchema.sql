CREATE SCHEMA `university` ;

CREATE TABLE `university`.`student` (
  `studentId` INT NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(45) NULL,
  `lastName` VARCHAR(45) NULL,
  PRIMARY KEY (`studentId`));

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
DROP procedure IF EXISTS `deleteStudent`;

DELIMITER $$
USE `university`$$
CREATE PROCEDURE `deleteStudent` (Id int)
BEGIN
	delete from student
    where studentId = Id;
END$$

DELIMITER ;


 