package com.promineo.tech.Repository;

import java.util.ArrayList;

import com.promineo.tech.Models.Classroom;

public interface IClassroomRepository {
	ArrayList<Classroom> getClassrooms();
	Classroom getClassroom(int classRoomId);
	void createClassroom(Classroom classroom);
	void deleteClassroom(Classroom classroom);
	void updateClassroom(Classroom classroom);
}
