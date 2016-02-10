package main;

import java.util.Scanner;

public class ControllerMain {
			
	public void actionIndex() {
		printProjectCategories(DataHardcode.allProjectCategories);
		handleInputProjectCategories(DataHardcode.allProjectCategories);
	}
	
	private String getDailyPhrase() {
		return(DataHardcode.dailyPhrase);
	}
		
	private Project[] getProjectsByCategory(int categoryId) {
		int resultCount = 0;
		Project projectList[];
		// First, we should calculate count of corresponding records.
		for (int i = 0; i < DataHardcode.allProjects.length; i++) {
			if (DataHardcode.allProjects[i].categoryId == categoryId) {
				resultCount++;
			}
		}
		projectList = new Project[resultCount];
		int projectListIndex = 0;
		for (int i = 0; i < DataHardcode.allProjects.length; i++) {
			if (DataHardcode.allProjects[i].categoryId == categoryId) {
				projectList[projectListIndex] = DataHardcode.allProjects[i];
				projectListIndex++;
			}
		}
		return(projectList);
	}
	
	public void printProjectCategories(ProjectCategory projectCategories[]){
		// Adding daily phrase to this view.
		System.out.println("Welcome to the Kickstarter.");
		System.out.println("********** The daily phraze **********");
		System.out.println(getDailyPhrase());
		System.out.println("**************************************");
		System.out.println("Please enter the category number or 0 for exit.");
		for (int i = 0; i < projectCategories.length; i++) {
			System.out.println((i + 1) + ": " + projectCategories[i].name);
		}
	}
	
	public void handleInputProjectCategories(ProjectCategory projectCategories[]) {
		int requestedNumber;
		Scanner scanner = new Scanner(System.in);
		requestedNumber = scanner.nextInt();
		scanner.close();
		if (0 == requestedNumber) {
			System.out.println("Goodbye! And thanks for all the fish.");
			System.exit(0);
		}
		else if (requestedNumber <= projectCategories.length) {
			// Redirecting to the category page.
			// Getting the list of projects for this category.
			Project projectList[];
			projectList = this.getProjectsByCategory(projectCategories[requestedNumber - 1].id);
			printProjects(projectList);
			handleInputProjects(projectList);
		}
		else {
			System.out.println("Invalid number. Try again.");
			handleInputProjectCategories(projectCategories);
		}
	}
	
	public void printProjects(Project projects[]){
		System.out.println("Please enter the project number or 0 for return:");
		
		for (int i = 0; i < projects.length; i++) {
			System.out.println((i + 1) + ": " + projects[i].name + " (collected: " + projects[i].collectedSum + "/" 
				+ projects[i].requiredSum + " expires after " + projects[i].daysLeft + " days)");
		}
	}
	
	public void handleInputProjects(Project projects[]) {
		int requestedNumber;
		Scanner scanner = new Scanner(System.in);
		requestedNumber = scanner.nextInt();
		scanner.close();
		if (0 == requestedNumber) {
			printProjectCategories(DataHardcode.allProjectCategories);
			handleInputProjectCategories(DataHardcode.allProjectCategories);
		}
		else if (requestedNumber <= projects.length) {
			// Redirecting to the project details page.
			printProjectDetails(projects[requestedNumber - 1]);
			handleInputProjectDetails(projects);
		}
		else {
			System.out.println("Invalid number. Try again.");
			handleInputProjects(projects);
		}
	}
	
	public void printProjectDetails(Project project){
		System.out.println("********** Project: " + project.name);
		System.out.println("Enter 0 for return");
		System.out.println("collected: " + project.collectedSum + "/" 
			+ project.requiredSum + " expires after " + project.daysLeft + " days");
		System.out.println("Project history: ");
		System.out.println(project.history);
		System.out.println("Video URL: " + project.videoURL);
		System.out.println(project.questionsAnswers);
	}
	
	public void handleInputProjectDetails(Project projects[]) {
		int requestedNumber;
		Scanner scanner = new Scanner(System.in);
		requestedNumber = scanner.nextInt();
		scanner.close();
		if (0 == requestedNumber) {
			printProjects(projects);
			handleInputProjects(projects);
		}
		else {
			System.out.println("Invalid number. Try again.");
			handleInputProjectDetails(projects);
		}
	}
}
