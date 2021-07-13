import java.util.*;
public class MapList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<project1> pl=new ArrayList<>();
		pl.add(new project1("Proj1","1"));
		pl.add(new project1("Proj2","2"));
		pl.add(new project1("Proj3","3"));
		pl.add(new project1("Proj4","4"));
		

	}

}
class User2{
	String name;
	String id;
	List<project1> pj;
	public User2(String name,String id,List<project1> pj){
		this.name=name;
		this.id=id;
		this.pj=pj;
	}
	
}
class project1{
	String projname;
	String projid;
	public project1(String projname,String projid) {
		this.projname=projname;
		this.projid=projid;
	}
}