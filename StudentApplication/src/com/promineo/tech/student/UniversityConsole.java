package com.promineo.tech.student;

import java.util.Scanner;
import com.promineo.tech.Models.UniversityViewModel;
import com.promineo.tech.Service.UniversityConsoleService;

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
				if(scanner.hasNextInt())
				{
					viewModel.MainMenuChoice = scanner.nextInt();
				}
				DisplayCrudMenu();
				if(scanner.hasNextInt())
				{
					viewModel.CrudChoice = scanner.nextInt();
				}
				DisplayDetailsScreen();
				
				UniversityConsoleService universityService = new UniversityConsoleService(viewModel);
				universityService.StartUniversityService();
				
			} 
			while(viewModel.MainMenuChoice != 4);	
			
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
	}
	
	private static void DisplayCrudMenu()
	{
		System.out.println("Please choose from the Crud Menu...");
		System.out.println("1. Create");
		System.out.println("2. Read");
		System.out.println("3. Update");
		System.out.println("4. Delete");
	}
	
	private static void DisplayDetailsScreen()
	{
		switch (viewModel.MainMenuChoice) 
		{
			case 1:
				switch (viewModel.CrudChoice)
				{
					case 1:
						System.out.println("Enter Student First Name: ");
						viewModel.StudentFirstName = scanner.next();
						System.out.println("Enter Student Last Name: ");
						viewModel.StudentLastName = scanner.next();
						break;
					case 3:
						System.out.println("Enter Student Id: ");
						viewModel.StudentId = scanner.nextInt();
						System.out.println("Enter Student First Name: ");
						viewModel.StudentFirstName = scanner.next();
						System.out.println("Enter Student Last Name: ");
						viewModel.StudentLastName = scanner.next();
						break;
					case 4:
						System.out.println("Enter Student Id: ");
						viewModel.StudentId = scanner.nextInt();
						break;
				}
				break;
			case 2:
				switch (viewModel.CrudChoice)
				{
					case 1:
						System.out.println("Enter Teacher First Name: ");
						viewModel.TeacherFirstName = scanner.next();
						System.out.println("Enter Teacher Last Name: ");
						viewModel.TeacherLastName = scanner.next();
						break;
					case 3:
						System.out.println("Enter Teacher Id: ");
						viewModel.TeacherId = scanner.nextInt();
						System.out.println("Enter Teacher First Name: ");
						viewModel.TeacherFirstName = scanner.next();
						System.out.println("Enter Teacher Last Name: ");
						viewModel.TeacherLastName = scanner.next();
						break;
					case 4:
						System.out.println("Enter Teacher Id: ");
						viewModel.TeacherId = scanner.nextInt();
						break;
				}
				break;
			case 3:
				switch (viewModel.CrudChoice)
				{
					case 1:
						System.out.println("Enter Classroom Name: ");
						viewModel.ClassroomName = scanner.next();
						System.out.println("Enter Classroom Subject: ");
						viewModel.ClassroomSubject = scanner.next();
						break;
					case 3:
						System.out.println("Enter Classroom Id: ");
						viewModel.ClassroomId = scanner.nextInt();
						System.out.println("Enter Classroom Name: ");
						viewModel.ClassroomName = scanner.next();
						System.out.println("Enter Classroom Subject: ");
						viewModel.ClassroomSubject = scanner.next();
						break;
					case 4:
						System.out.println("Enter Classroom Id: ");
						viewModel.ClassroomId = scanner.nextInt();
						break;
				}
				break;
		}
	}
}
