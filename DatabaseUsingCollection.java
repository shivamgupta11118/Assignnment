import java.util.*;
public class DatabaseUsingCollection {
	static void insert(Map<Integer,UserDetails>  mp,String fname,String lname,int id,String accno,boolean flag) {
		//for(Map.Entry<Integer, UserDetails> e: mp.entrySet()) {
			if(!mp.containsKey(id)) {
				mp.put(id, new UserDetails(fname,lname,id,accno,flag));
			}
			else {
				System.err.println("Primary key voilated");
				return;
			}
		//}
//		mp.put(2, new UserDetails("Shiv","Gupta",2,"Acc2",true));
//		mp.put(3, new UserDetails("Ram","Garg",3,"Acc3",true));
//		mp.put(4, new UserDetails("Raj","sharma",4,"Acc4",true));
//		mp.put(5, new UserDetails("Jitnder","pal",5,"Acc5",true));

		
	}
	static void display(Map<Integer,UserDetails> mp) {
		//mp.forEach((k,v)->System.out.println("k "+k+" V "+v));
		for(Map.Entry<Integer, UserDetails> e: mp.entrySet()) {
			if(e.getValue().flag==true) {
				System.out.println("k "+e.getKey()+"---"+" V "+e.getValue());
			}
		}
		
	}
	static Map<Integer,UserDetails> update(Map<Integer,UserDetails> mp,int n,String rename) {
		for(Map.Entry<Integer, UserDetails> e: mp.entrySet()) {
			if(e.getKey()==n) {
				e.getValue().Fname=rename;
			}
		}
		
		return mp;
	}
	static Map<Integer,UserDetails> delete(Map<Integer,UserDetails> mp,int n){
		for(Map.Entry<Integer, UserDetails> e: mp.entrySet()) {
			if(e.getKey()==n) {
				e.getValue().flag=false;
			}
		}
		//System.out.println(mp.get(n));
		
		
		return mp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,UserDetails> mp=new HashMap();
		Scanner sc=new Scanner(System.in);
		int id;
		String fname,lname,accno;
		boolean flag;
		int n=3;
		
	System.out.println("-----------Insert-------------");
	for(int i=0;i<n;i++) {
		id=sc.nextInt();
		sc.nextLine();
		fname=sc.nextLine();
		lname=sc.nextLine();
		accno=sc.nextLine();
		flag=true;
		
	insert(mp,fname,lname,id,accno,flag);
	}
	System.out.println("-----------Diplay-------------");
	display(mp);
	System.out.println("-----------Update-------------");
	mp=update(mp,4,"Ramesh");
	System.out.println("-----------Diplay-------------");
	display(mp);
	System.out.println("-----------Delete-------------");
	mp=delete(mp,3);
	System.out.println("-----------Diplay-------------");
	display(mp);
	
	
	
	
	
	}
}
class UserDetails {
	
	String Fname;
	String Lname;
	int id;
	String accno;
	boolean flag;
	public UserDetails(String Fname,String Lname,int id,String accno,boolean flag) {
		this.Fname=Fname;
		this.Lname=Lname;
		this.id=id;
		this.accno=accno;
		this.flag=flag;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UserDetails [Fname=" + Fname + ", Lname=" + Lname + ", id=" + id + ", accno=" + accno + "]";
	}
	
}