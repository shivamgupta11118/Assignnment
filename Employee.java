
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
