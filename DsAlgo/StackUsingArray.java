package DsAlgo;

public class StackUsingArray {
	static final  int max=100;
	int top;
	int arr[]=new int[max];
	public StackUsingArray() {
		top=-1;
	}
	 void push(int a) {
		 if(top>=(max-1)) {
			 System.out.println("overflow");
			 return ;
		 }
		 else {
				arr[++top]=a;
		 }
		//arr[++top]=a;
	}
	 int pop() {
		 if(top<0) {
			 System.out.println("Underflow");
			 return 0;
		 }
		 else {
		int a=arr[top--];
		 
		return a;
		 }
	}
	 boolean isEmpty() {
		return (top<0);
	}
	 int peek() {
		 if(top<0) {
			 System.out.println("Underflow");
			 return -1;
		 }
		 else {
		return arr[top];
		 }
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArray sa=new StackUsingArray();
		sa.push(10);
		sa.push(20);
		sa.push(30);
		System.out.println(sa.pop()+" value poped ");
		System.out.println(sa.pop()+" value poped ");

	//	System.out.println(sa.pop()+" value poped ");

//		System.out.println(sa.pop()+" value poped ");

		System.out.println(sa.peek()+" value peeked ");
		System.out.println(sa.isEmpty()+" is emplty or not ");
	}

}
