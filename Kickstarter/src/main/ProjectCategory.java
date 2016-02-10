package main;

public class ProjectCategory {
	public int id;
	public String name;
	// Some kind of generator or autoincrement like used in SQL.
	private static int currentId = 0;
	
	ProjectCategory() {
		currentId++;
		this.id = currentId;
	}
}
