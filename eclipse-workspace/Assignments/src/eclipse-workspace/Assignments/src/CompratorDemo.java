import java.util.*;

class Empl implements Comparable{
	int salary;
	String city;
	public Empl(int salary,String city) {
		this.salary=salary;
		this.city=city;
		
	}
	@Override
	public int compareTo(Object o) {
		Empl a=(Empl) o;
		// TODO Auto-generated method stub
		if(this.salary<a.salary) {
			return 1;
		}
		else if(this.salary<a.salary)
			return -1;
		else return 0;
		
	}
//	Object []arr=Empl.toArray();
//	public String toString() {
//		// TODO Auto-generated method stub
//		return this.city+" "+this.salary ;
}
		
	

class Sortin implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Empl e1=(Empl) o1;
		Empl e2=(Empl)o2;
		int c=e1.compareTo(e2);
		if(c !=0) {
			return c;
		}
		String city1=e1.city;
		String city2=e2.city;
		return city1.compareTo(city2);
		//return 0;
	}
	
}


public class CompratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList<>();
		al.add(new Empl(1200,"Delhi"));
		al.add(new Empl(1000,"Bombay"));
		al.add(new Empl(1000,"Banglore"));
		Collections.sort(al,new Sortin());
		//System.out.println(al);
		Object arr[]=al.toArray();
		for(Object o:al) {
			Empl e=(Empl) o;
			System.out.println(e.city+" "+e.salary);
			
		}
	}

}


//package jpmorgan.banking.newmodel;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//class u{
//	int salary;
//	String address,name;
//	u(int s, String a, String name){
//		this.salary = s;
//		this.address  =a;
//		this.name = name;
//	}
//	
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return this.name;
//	}
//}
//
//class userSort implements Comparator{
//
//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		u u1 = (u) o1;
//		u u2 = (u) o2;
//		if((u1.salary - u2.salary) !=0) return u2.salary - u1.salary;
//		return u1.address.compareTo(u2.address);
//	}
//	
//}
//
//public class EmployeeSort {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ArrayList<u> li= new ArrayList<>();
//		li.add(new u(1000,"BOM","E1"));
//		li.add(new u(1200,"DEL","E2"));
//		li.add(new u(1000,"BLR","E3"));
//		
//		Collections.sort(li,new userSort());
//		
//		System.out.println(li);
//
//	}
//
//}
