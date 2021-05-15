package com.promineo.tech.Service;

import java.util.ArrayList;

import com.promineo.tech.Models.Student;
import com.promineo.tech.Models.Teacher;
import com.promineo.tech.Repository.TeacherRepository;

public class TeacherService implements ITeacherService {
private TeacherRepository teacherRepository;
	
	public TeacherService()
	{
		teacherRepository = new TeacherRepository();
	}
	
	@Override
	public ArrayList<Teacher> getTeachers()
	{
		return teacherRepository.getTeachers();
	}

	@Override
	public Teacher getTeacher(int teacherId) {
		return teacherRepository.getTeacher(teacherId);
	}

	@Override
	public void createTeacher(Teacher teacher) {
		teacherRepository.createTeacher(teacher);
	}

	@Override
	public void deleteTeacher(Teacher teacher) {
		teacherRepository.deleteTeacher(teacher);
	}
	
	@Override
	public void updateTeacher(Teacher teacher) {
		teacherRepository.updateTeacher(teacher);
	}
}
