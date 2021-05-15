package com.promineo.tech.Service;

import java.util.ArrayList;

import com.promineo.tech.Models.Classroom;

public interface IClassroomService {
	ArrayList<Classroom> getClassrooms();
	Classroom getClassroom(int classroomId);
	void createClassroom(Classroom classroom);
	void deleteClassroom(Classroom classroom);
	void updateClassroom(Classroom classroom);
}
