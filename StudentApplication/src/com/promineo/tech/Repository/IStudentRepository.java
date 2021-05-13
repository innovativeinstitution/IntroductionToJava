package com.promineo.tech.Repository;

import java.util.ArrayList;

import com.promineo.tech.Models.Student;

public interface IStudentRepository {
	ArrayList<Student> getStudents();
	Student getStudent(int studentId);
	void createStudent(Student student);
	void deleteStudent(Student student);
}
