package com.promineo.tech.Service;

import java.util.ArrayList;

import com.promineo.tech.Models.Classroom;
import com.promineo.tech.Repository.ClassroomRepository;

public class ClassroomService implements IClassroomService {
private ClassroomRepository classroomRepository;
	
	public ClassroomService()
	{
		classroomRepository = new ClassroomRepository();
	}
	
	@Override
	public ArrayList<Classroom> getClassrooms()
	{
		return classroomRepository.getClassrooms();
	}

	@Override
	public Classroom getClassroom(int classroomId) {
		return classroomRepository.getClassroom(classroomId);
	}

	@Override
	public void createClassroom(Classroom classroom) {
		classroomRepository.createClassroom(classroom);
	}

	@Override
	public void deleteClassroom(Classroom classroom) {
		classroomRepository.deleteClassroom(classroom);
	}

	@Override
	public void updateClassroom(Classroom classroom) {
		classroomRepository.updateClassroom(classroom);
	}
}
