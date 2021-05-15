package com.promineo.tech.Service;

import java.util.ArrayList;

import com.promineo.tech.Models.Teacher;

public interface ITeacherService {
	ArrayList<Teacher> getTeachers();
	Teacher getTeacher(int teacherId);
	void createTeacher(Teacher teacher);
	void deleteTeacher(Teacher teacher);
	void updateTeacher(Teacher teacher);
}
