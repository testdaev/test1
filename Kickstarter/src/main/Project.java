package main;

public class Project {
	public int id;
	public int categoryId;
	public String name;
	public String shortDescription;
	public String history;
	public int requiredSum;
	public int collectedSum;
	public int daysLeft;
	public String videoURL;
	public String questionsAnswers;
	// Some kind of generator or autoincrement like used in SQL.
	private static int currentId = 0;

	Project() {
		currentId++;
		this.id = currentId;
	}
}
