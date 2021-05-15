package com.promineo.tech.Service;

import java.util.ArrayList;

import com.promineo.tech.Models.Student;

public interface IStudentService {
	ArrayList<Student> getStudents();
	Student getStudent(int studentId);
	void createStudent(Student student);
	void deleteStudent(Student student);
	void updateStudent(Student student);
}
