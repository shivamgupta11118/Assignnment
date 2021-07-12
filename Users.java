import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;
class SalSort implements Comparator<Employee>{

	

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		Double s1=(Double)o1.salary;
		Double s2=(Double)o2.salary;
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
		ll.add(new Employee("104","EEE",new Address("Delhi","5544223"),new Project(2,"Assignment",1000),300));

		//List<Employee> emp=
		//users.stream().filter(u->u instanceof Employee).map(u(Employee));

	//	List<Employee> emp=	ll.stream().filter(u -> u instanceof Employee).map(u-> ).collect(Collectors.toList());
				//forEach(e -> System.out.println(e.id+"  "+e.name+" "+e.salary+" "));
//		for(Users u:ll) {
//			if(u instanceof Employee) {
//				emp.add((Employee)u);
//			}
//		}
		

//		double d=0;
//		System.out.println(emp.get(0).project.projectId);
//		for(int i=0;i<emp.size();i++) {
//			if(emp.get(i).project.projectId==1) {
//			d=d+emp.get(i).salary;
//			if(d>emp.get(i).project.budget) {
//			Collections.sort( emp,new SalSort());
//			emp.remove(0);
//			
//			}
//		}
//			System.out.println(emp.get(i).project.projectId+"-----"+emp.get(i).name);
//		}
//			for(Employee e:emp) {
//				if(e.project.projectId==1) {
//					d=d+e.salary;
//					if(d>e.project.budget) {
//						Collections.sort( emp,new SalSort());
//						
//					}
//				}
//			}
//			emp.remove(0);
//			for(int i=0;i<emp.size();i++) {
//				System.out.println(emp.get(i).project.projectId+"-----"+emp.get(i).name);
//				}
			

		
		
		
//		for(int i=0;i<emp.size();i++) {
//		System.out.println(emp.get(i).project.projectId+"-----"+emp.get(i).name);
//		}
		
			

	}
}




