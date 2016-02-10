package main;

public class Main {

	public static void main(String[] args) {
		// Filling arrays with hardcoded data.
		DataHardcode.getProjectCategoryList();
		DataHardcode.getProjectList();
		ControllerMain controllerMain = new ControllerMain();
		controllerMain.actionIndex();
	}

}
