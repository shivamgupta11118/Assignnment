import java.util.*;
public class ComparatorMultipledatatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set multi=new TreeSet (new globalStringComparator());
		multi.add(new globalStringComparator( new Integer(2)));
		multi.add(new globalStringComparator( new Integer(1)));
		multi.add(new globalStringComparator(new User(2,"User2")));
		multi.add(new globalStringComparator(new User(1,"Adam")));
		multi.add(new globalStringComparator("Hi"));
		multi.add(new globalStringComparator("Hello"));
	//	Collection.sort(multi,new  Multiple());
		multi.forEach(a->System.out.println(a));
		
	}

}
class Multiple implements Comparator<Multiple> {
	private Object obj;
	public Multiple() {
		
	}
	public Multiple(Object obj) {
		this.obj=obj;
	}
	public String toString(){
		return "---"+obj+"---";
	}
	public int hashCode() {
        return obj.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
	@Override
	public int compare(Multiple o1, Multiple o2) {
		// TODO Auto-generated method stub
		if(o1.obj instanceof Integer) {
			if(o2.obj instanceof Integer) {
				int i=(int)o1.obj;
				int j=(int)o2.obj;
				return i-j;}
			
			else if(o2.obj instanceof String) {
				return -1;
			}
			else if(o2.obj instanceof User) {
				return -1;
			}
			return 0;
		}
		else if(o1.obj instanceof User ) {
			if(o2.obj instanceof User) {
				User u1=(User)o1.obj;
				User u2=(User)o2.obj;
				return u1.getId()-u2.getId();
			}
			else if(o2.obj instanceof Integer) {
				return 1;
			}
			else if(o2.obj instanceof String) {
				return -1;
			}
			return 0;
		}
		else if(o1.obj instanceof String) {
			if(o2.obj instanceof String) {
				String s1=(String)o1.obj;
				String s2=(String)o2.obj;
				return s1.compareTo(s2);
			}
			else if(o2.obj instanceof Integer) {
				return 1;
			}
			else if(o2.obj instanceof User) {
				return 1;
			}
			return 0;
			
		}
		
		
		return 0;
	}
	
}
class StringComparator implements Comparator<StringComparator>{

	private Object obj;
	public StringComparator() {
		
	}
	public StringComparator(Object obj) {
		this.obj=obj;
	}
	public String toString(){
		return "---"+obj+"---";
	}
	public int hashCode() {
        return obj.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
	@Override
	public int compare(StringComparator o1, StringComparator o2) {
		// TODO Auto-generated method stub
		if(o1.obj instanceof String) {
			if(o2.obj instanceof String) {
				String s1=(String)o1.obj;
				String s2=(String)o2.obj;
				return s1.compareTo(s2);
			}
			else if(o2.obj instanceof Integer) {
				return -1;
			}
			else if(o2.obj instanceof User) {
				return -1;
			}
			return 0;
			
		}
		else if(o1.obj instanceof User ) {
			if(o2.obj instanceof User) {
				User u1=(User)o1.obj;
				User u2=(User)o2.obj;
				return u1.getId()-u2.getId();
			}
			else if(o2.obj instanceof Integer) {
				return -1;
			}
			else if(o2.obj instanceof String) {
				return 1;
			}
			return 0;
		}
		else 	if(o1.obj instanceof Integer) {
			if(o2.obj instanceof Integer) {
				int i=(int)o1.obj;
				int j=(int)o2.obj;
				return i-j;}
			
			else if(o2.obj instanceof String) {
				return 1;
			}
			else if(o2.obj instanceof User) {
				return 1;
			}
			return 0;
		}
		
		
		
		return 0;
	}
	
}
	
class globalStringComparator implements Comparator<globalStringComparator>{
	private Object obj;
	public  globalStringComparator() {
		// TODO Auto-generated constructor stub
	}
	public  globalStringComparator(Object obj) {
		this.obj=obj;
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		return "---"+obj+"---";
	}
	public int hashCode() {
        return obj.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
	@Override
	public int compare(globalStringComparator o1, globalStringComparator o2) {
		// TODO Auto-generated method stub
		if(o1.obj instanceof String) {
			if(o2.obj instanceof String) {
				String s1=(String)o1.obj;
				String s2=(String)o2.obj;
				return s1.compareTo(s2);
			}
			else if(o2.obj instanceof Integer) {
				return -1;
			}
			else if(o2.obj instanceof User) {
				String s1=(String)o1.obj;
				User u2=(User)o2.obj;
				return s1.compareTo(u2.getName());
			}
			return 0;
			
		}
		else if(o1.obj instanceof User ) {
			if(o2.obj instanceof User) {
				User u1=(User)o1.obj;
				User u2=(User)o2.obj;
				return u1.getId()-u2.getId();
			}
			else if(o2.obj instanceof Integer) {
				return -1;
			}
			else if(o2.obj instanceof String) {
				User u1=(User)o1.obj;
				String s2=(String)o2.obj;
				return u1.getName().compareTo(s2);


			}
			return 0;
		}
		else 	if(o1.obj instanceof Integer) {
			if(o2.obj instanceof Integer) {
				int i=(int)o1.obj;
				int j=(int)o2.obj;
				return i-j;}
			
			else if(o2.obj instanceof String) {
				return 1;
			}
			else if(o2.obj instanceof User) {
				return 1;
			}
			return 0;
		}
		
		return 0;
	}
	}

	




	




class User {
    private int id;
    private String name;

    public User(){

    }
    public String toString(){
		return  "User "+name+" id "+id;
	}

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}