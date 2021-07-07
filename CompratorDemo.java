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



