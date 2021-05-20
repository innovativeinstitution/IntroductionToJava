package com.promineo.tech.student;

import java.util.Scanner;

import com.promineo.tech.Controllers.UniversityController;
import com.promineo.tech.Models.CrudChoice;
import com.promineo.tech.Models.MainMenuChoice;
import com.promineo.tech.Models.UniversityViewModel;

public class UniversityConsole {
	private static UniversityViewModel viewModel;
	private static Scanner scanner;
	
	public static void main(String[] args) {

		System.out.println("Welcome to the University!!!");
		
		try
		{
			scanner = new Scanner(System.in);
			
			do
			{
				viewModel = new UniversityViewModel();
				DisplayMainMenu();
				DisplayCrudMenu();
				DisplayDetailsScreen();
				
				if(viewModel.MainMenuChoice != MainMenuChoice.EXIT)
				{
					UniversityController universityController = new UniversityController(viewModel);
					universityController.StartUniversityService();
				}
			} 
			while(viewModel.MainMenuChoice != MainMenuChoice.EXIT);	
			
			System.out.println("Goodbye!!!");
			scanner.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			scanner.close();
		}
	}

	private static void DisplayMainMenu()
	{
		System.out.println("Please choose from the Main Menu...");
		System.out.println("1. Students");
		System.out.println("2. Teachers");
		System.out.println("3. Classrooms");
		System.out.println("4. Exit");
		
		if(scanner.hasNextInt())
		{
			viewModel.MainMenuChoice = MainMenuChoice.values()[scanner.nextInt() - 1];
		}
	}
	
	private static void DisplayCrudMenu()
	{
		System.out.println("Please choose from the Crud Menu...");
		System.out.println("1. Create");
		System.out.println("2. Read");
		System.out.println("3. Update");
		System.out.println("4. Delete");
		
		if(scanner.hasNextInt())
		{
			viewModel.CrudChoice = CrudChoice.values()[scanner.nextInt() - 1];
		}
	}
	
	private static void DisplayDetailsScreen()
	{
		switch (viewModel.MainMenuChoice) 
		{
			case STUDENT:
				switch (viewModel.CrudChoice)
				{
					case CREATE:
						System.out.println("Enter Student First Name: ");
						viewModel.StudentFirstName = scanner.next();
						System.out.println("Enter Student Last Name: ");
						viewModel.StudentLastName = scanner.next();
						break;
					case READ:
						break;
					case UPDATE:
						System.out.println("Enter Student Id: ");
						viewModel.StudentId = scanner.nextInt();
						System.out.println("Enter Student First Name: ");
						viewModel.StudentFirstName = scanner.next();
						System.out.println("Enter Student Last Name: ");
						viewModel.StudentLastName = scanner.next();
						break;
					case DELETE:
						System.out.println("Enter Student Id: ");
						viewModel.StudentId = scanner.nextInt();
						break;
				}
				break;
			case TEACHER:
				switch (viewModel.CrudChoice)
				{
					case CREATE:
						System.out.println("Enter Teacher First Name: ");
						viewModel.TeacherFirstName = scanner.next();
						System.out.println("Enter Teacher Last Name: ");
						viewModel.TeacherLastName = scanner.next();
						break;
					case READ:
						break;
					case UPDATE:
						System.out.println("Enter Teacher Id: ");
						viewModel.TeacherId = scanner.nextInt();
						System.out.println("Enter Teacher First Name: ");
						viewModel.TeacherFirstName = scanner.next();
						System.out.println("Enter Teacher Last Name: ");
						viewModel.TeacherLastName = scanner.next();
						break;
					case DELETE:
						System.out.println("Enter Teacher Id: ");
						viewModel.TeacherId = scanner.nextInt();
						break;
				}
				break;
			case CLASSROOM:
				switch (viewModel.CrudChoice)
				{
					case CREATE:
						System.out.println("Enter Classroom Name: ");
						viewModel.ClassroomName = scanner.next();
						System.out.println("Enter Classroom Subject: ");
						viewModel.ClassroomSubject = scanner.next();
						break;
					case READ:
						break;
					case UPDATE:
						System.out.println("Enter Classroom Id: ");
						viewModel.ClassroomId = scanner.nextInt();
						System.out.println("Enter Classroom Name: ");
						viewModel.ClassroomName = scanner.next();
						System.out.println("Enter Classroom Subject: ");
						viewModel.ClassroomSubject = scanner.next();
						break;
					case DELETE:
						System.out.println("Enter Classroom Id: ");
						viewModel.ClassroomId = scanner.nextInt();
						break;
				}
				break;
		}
	}
}
