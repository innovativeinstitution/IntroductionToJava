package com.promineo.tech.Service;

import java.util.ArrayList;

import com.promineo.tech.Models.Student;
import com.promineo.tech.Repository.StudentRepository;

public class StudentService implements IStudentService {
private StudentRepository studentRepository;
	
	public StudentService()
	{
		studentRepository = new StudentRepository();
	}
	
	@Override
	public ArrayList<Student> getStudents()
	{
		return studentRepository.getStudents();
	}

	@Override
	public Student getStudent(int studentId) {
		return studentRepository.getStudent(studentId);
	}

	@Override
	public void createStudent(Student student) {
		studentRepository.createStudent(student);
	}

	@Override
	public void deleteStudent(Student student) {
		studentRepository.deleteStudent(student);
	}
}
