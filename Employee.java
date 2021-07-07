
public class Employee extends Users {
Address address;
Project project;
double salary;
public Employee() {
	super();
}
public Employee(String id,String name,Address address,Project project,double salary) {
	super(id,name);
	this.address=address;
	this.project=project;
	this.salary=salary;
}
}
