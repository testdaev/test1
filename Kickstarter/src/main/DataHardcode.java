package main;

public class DataHardcode {
	public static Project allProjects[];
	public static ProjectCategory allProjectCategories[];
	public static String dailyPhrase = "What a lovely day!";
	
	public static void getProjectCategoryList() {
		// The categories will be hardcoded for a while.
		int count = 3;
		allProjectCategories = new ProjectCategory[count];
		for (int i = 0; i < count; i++) {
			allProjectCategories[i] = new ProjectCategory();
		}
		allProjectCategories[0].name = "Sport";
		allProjectCategories[1].name = "Space investigation";
		allProjectCategories[2].name = "Game development";
	}
	
	public static void getProjectList() {
		// The projects will be hardcoded for a while.
		// And because of this it`s looking so fat and ugly.
		int count = 6;
		allProjects = new Project[count];
		for (int i = 0; i < count; i++) {
			allProjects[i] = new Project();
		}
		allProjects[0].categoryId = 1;
		allProjects[0].name = "Cube soccer ball";
		allProjects[0].shortDescription = "Test description ";
		allProjects[0].history = "Test history ";
		allProjects[0].requiredSum = 4000;
		allProjects[0].collectedSum = 2300;
		allProjects[0].daysLeft = 12;
		allProjects[1].videoURL = "http://sdfjhhfhjjj.ua";
		allProjects[0].questionsAnswers = "Questions and answers are not implemented yet";
		//
		allProjects[1].categoryId = 1;
		allProjects[1].name = "New stadium building";
		allProjects[1].shortDescription = "Test description ";
		allProjects[1].history = "Test history ";
		allProjects[1].requiredSum = 23000000;
		allProjects[1].collectedSum = 0;
		allProjects[1].daysLeft = 300;
		allProjects[1].videoURL = "http://arenakyiv.is";
		allProjects[1].questionsAnswers = "Questions and answers are not implemented yet";
		//
		allProjects[2].categoryId = 2;
		allProjects[2].name = "Mars colonization";
		allProjects[2].shortDescription = "Test description ";
		allProjects[2].history = "Test history ";
		allProjects[2].requiredSum = 100000;
		allProjects[2].collectedSum = 90500;
		allProjects[2].daysLeft = 40;
		allProjects[2].videoURL = "No video is available for this project";
		allProjects[2].questionsAnswers = "Questions and answers are not implemented yet";
		//
		allProjects[3].categoryId = 2;
		allProjects[3].name = "Changing the Earth orbit";
		allProjects[3].shortDescription = "Test description ";
		allProjects[3].history = "Test history ";
		allProjects[3].requiredSum = 500;
		allProjects[3].collectedSum = 12;
		allProjects[3].daysLeft = 5;
		allProjects[3].videoURL = "http://ChangingtheEarthorbit.ru";
		allProjects[3].questionsAnswers = "Questions and answers are not implemented yet";
		//
		allProjects[4].categoryId = 3;
		allProjects[4].name = "Tetris 4D";
		allProjects[4].shortDescription = "Test description ";
		allProjects[4].history = "Test history ";
		allProjects[4].requiredSum = 3000;
		allProjects[4].collectedSum = 278;
		allProjects[4].daysLeft = 5002;
		allProjects[4].videoURL = "http://Tetris4D.com";
		allProjects[4].questionsAnswers = "Questions and answers are not implemented yet";
		//
		allProjects[5].categoryId = 3;
		allProjects[5].name = "Carmageddon 5 mobile";
		allProjects[5].shortDescription = "Test description ";
		allProjects[5].history = "Test history ";
		allProjects[5].requiredSum = 15000;
		allProjects[5].collectedSum = 600;
		allProjects[5].daysLeft = 45;
		allProjects[5].videoURL = "http://Carmageddon5mobile.com";
		allProjects[5].questionsAnswers = "Questions and answers are not implemented yet";
	}
}
