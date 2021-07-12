
public class Employee extends Users {
Address address;
Project project;
double salary;
public Employee(String id,String name) {
	super(id,name);
}
public Employee(String id,String name,Address address,Project project,double salary) {
	this(id,name);
	this.address=address;
	this.project=project;
	this.salary=salary;
}
}
class Project{
	int id;
	String name;
	double budget;
	public Project(int id, String name, double budget) {
		//super();
		this.id = id;
		this.name = name;
		this.budget = budget;
	}
	
}
