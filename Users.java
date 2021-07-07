import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
class SalSort implements Comparator{

	

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employee p1=(Employee)o1;
		Employee p2=(Employee)o2;
		Double s1=(Double)p1.salary;
		Double s2=(Double)p2.salary;
		return s1.compareTo(s2);
		
	}

	
	
}
public class Users {
	String id;
	String name;
public Users(String id,String name) {
	this.id=id;
	this.name=name;
}
public Users() {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Users> ll=new ArrayList<Users>(); 
		ll.add(new Users("101","AAA"));
		ll.add(new Employee("100","BBB",new Address("Delhi","5544223"),new Project(1,"Assignment",1000),400));
		ll.add(new Employee("102","CCC",new Address("Delhi","5544223"),new Project(1,"Assignment",1000),500));
		ll.add(new Employee("103","DDD",new Address("Delhi","5544223"),new Project(1,"Assignment",1000),300));
		ll.add(new Employee("103","DDD",new Address("Delhi","5544223"),new Project(2,"Assignment",1000),300));

		List<Employee> emp=new ArrayList<>();
		for(Users u:ll) {
			if(u instanceof Employee) {
				emp.add((Employee)u);
			}
		}

		double d=0;
		
		for(int i=0;i<emp.size();i++) {
			if(emp.get(i).project.projectId==1) {
			d=d+emp.get(i).salary;
			Collections.sort( emp,new SalSort());
			emp.remove(0);
			}
			
		}
		
		
		for(int i=0;i<emp.size();i++) {
		System.out.println(emp.get(i).project.projectId+"-----"+emp.get(i).name);
		}
		
			

	}



}
