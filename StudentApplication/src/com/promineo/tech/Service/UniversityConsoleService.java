package com.promineo.tech.Service;

import java.util.ArrayList;

import com.promineo.tech.Models.Classroom;
import com.promineo.tech.Models.Student;
import com.promineo.tech.Models.Teacher;
import com.promineo.tech.Models.UniversityViewModel;

public class UniversityConsoleService {
	private UniversityViewModel viewModel;
	private StudentService studentService;
	private TeacherService teacherService;
	private ClassroomService classroomService;
	
	public UniversityConsoleService(UniversityViewModel model)
	{
		viewModel = model;
		studentService = new StudentService();
		teacherService = new TeacherService();
		classroomService = new ClassroomService();
	}
	
	public void StartUniversityService()
	{
		Student student;
		Teacher teacher;
		Classroom classroom;
		
		switch (viewModel.MainMenuChoice)
		{
			case STUDENT:
				switch (viewModel.CrudChoice) 
				{
					case CREATE:
						studentService.createStudent(new Student(0, viewModel.StudentFirstName, viewModel.StudentLastName));
						System.out.println("Student created!...");
						break;
					case READ:
						System.out.println("All students...");
						ArrayList<Student> students = studentService.getStudents();
						for (Student s : students)
						{
							System.out.println(s);
						}
						break;
					case UPDATE:
						student = studentService.getStudent(viewModel.StudentId);
						if(student != null)
						{
							student.setFirstName(viewModel.StudentFirstName);
							student.setLastName(viewModel.StudentLastName);
							studentService.updateStudent(student);
							System.out.println("Student updated!...");
						}
						else
						{
							System.out.println("Student does not exist...");
						}
						break;
					case DELETE:
						student = studentService.getStudent(viewModel.StudentId);
						if(student != null)
						{
							studentService.deleteStudent(student);
							System.out.println("Student deleted!...");
						}
						else
						{
							System.out.println("Student does not exist...");
						}
						break;
					default:
						System.out.println("Invalid Crud Choice...");
						break;
				}
				break;
			case TEACHER:
				switch (viewModel.CrudChoice) 
				{
					case CREATE:
						teacherService.createTeacher(new Teacher(0, viewModel.TeacherFirstName, viewModel.TeacherLastName));
						System.out.println("Teacher created!...");
						break;
					case READ:
						System.out.println("All teachers...");
						ArrayList<Teacher> teachers = teacherService.getTeachers();
						for (Teacher t : teachers)
						{
							System.out.println(t);
						}
						break;
					case UPDATE:
						teacher = teacherService.getTeacher(viewModel.TeacherId);
						if(teacher != null)
						{
							teacher.setFirstName(viewModel.TeacherFirstName);
							teacher.setLastName(viewModel.TeacherLastName);
							teacherService.updateTeacher(teacher);
							System.out.println("Teacher updated!...");
						}
						else
						{
							System.out.println("Teacher does not exist...");
						}
						break;
					case DELETE:
						teacher = teacherService.getTeacher(viewModel.TeacherId);
						if(teacher != null)
						{
							teacherService.deleteTeacher(teacher);
							System.out.println("Teacher deleted!...");
						}
						else
						{
							System.out.println("Teacher does not exist...");
						}
						break;
					default:
						System.out.println("Invalid Crud Choice...");
						break;
				}
				break;
			case CLASSROOM:
				switch (viewModel.CrudChoice) 
				{
					case CREATE:
						classroomService.createClassroom(new Classroom(0, viewModel.ClassroomName, viewModel.ClassroomSubject));
						System.out.println("Classroom created!...");
						break;
					case READ:
						System.out.println("All classrooms...");
						ArrayList<Classroom> classrooms = classroomService.getClassrooms();
						for (Classroom c : classrooms)
						{
							System.out.println(c);
						}
						break;
					case UPDATE:
						classroom = classroomService.getClassroom(viewModel.ClassroomId);
						if(classroom != null)
						{
							classroom.setName(viewModel.ClassroomName);
							classroom.setSubject(viewModel.ClassroomSubject);
							classroomService.updateClassroom(classroom);
							System.out.println("Classroom updated!...");
						}
						else
						{
							System.out.println("Classroom does not exist...");
						}
						break;
					case DELETE:
						classroom = classroomService.getClassroom(viewModel.ClassroomId);
						if(classroom != null)
						{
							classroomService.deleteClassroom(classroom);
							System.out.println("Classroom deleted!...");
						}
						else
						{
							System.out.println("Classroom does not exist...");
						}
						break;
					default:
						System.out.println("Invalid Crud Choice...");
						break;
				}
				break;
			default:
				System.out.println("Invalid Main Menu Choice...");
				break;
		}
		
	}
}
