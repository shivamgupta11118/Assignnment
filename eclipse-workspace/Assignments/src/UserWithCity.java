/**
 * 
 * 
 * **/


import java.util.*;
import java.util.stream.Collectors;
public class UserWithCity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<User1> ll=new ArrayList<User1>();
		List<Address1>Address= Arrays.asList(new Address1("DEL","110086"),new Address1("BLR","100072"));
		ll.add(new User1(1,"Shivam",Address));
		Address=Arrays.asList(new Address1("HYD","123086"),new Address1("BLR","100072"));
		ll.add(new User1(2,"GUpta",Address));
		Address=Arrays.asList(new Address1("HYD","123086"),new Address1("BLR","100072"));
	//	Address.forEach(System.out::println);
		ll.add(new User1(3,"Ji",Address));
		Map<Address1,List<User1>>mp=new TreeMap<>(new CitysSort());
		for(User1 u:ll) {
			for(Address1 ad: u.address) {
				if(!mp.containsKey(ad)) {
					ArrayList<User1> arr=new ArrayList<>();
					arr.add(u);
					mp.put(ad, arr);
				}
				else {
					mp.get(ad).add(u);
				}
			}
		}
		for(Map.Entry<Address1,List<User1>> e: mp.entrySet()  ) {
			if(e.getValue().size()>=2) {
				System.out.println(e.getKey()+"----"+e.getValue());
			}
		}


		

		
		
		//List<List<User>> ll1=new ArrayList<>();
	//	int i=ll.stream().map(User1::getCity).
				//.collect(Collectors.toList());		
//		List<User>  ll1=(List<User>) ll.stream().map().
//				sorted((u1,u2)->u1.city.compareTo(u2.city));
		//ll.forEach(System.out::println);
		
		
	}

}
class User1{
	private int id;
	private String Name;
//	String city;
//	String ZipCode;
	List<Address1> address;
	public User1(int id,String Name,List<Address1> Address) {
		this.id=id;
		this.Name=Name;
		this.address=Address;
		
	}
	@Override
	public String toString() {
		return id+" =" + id + ", Name=" + Name  + "]";
	}
	
}
class Address1{
	String city;
	String ZipCode;
	public Address1(String city,String Zipcode) {
		this.city=city;
		this.ZipCode=Zipcode;
	}
	@Override
	public String toString() {
		return "city=" + city + "ZipCode=" + ZipCode ;
	}
	public int hashCode() {
		// TODO Auto-generated method stub
		return city.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.city.equals(((Address1) obj).city);
	}
	
}
class CitysSort implements Comparator<Address1>{

	@Override
	public int compare(Address1 o1, Address1 o2) {
		// TODO Auto-generated method stub
		return o1.city.compareTo(o2.city);
		//return 0;
	}

	
	
}
