
public class FibonnaciSeriesDemo extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FibonaaciSer fb=new FibonaaciSer();
//		Fibo fb=new Fibo(7);
//		Thread t1=new Thread(fb);
//	//	FibonnaciSeriesDemo fb1=new FibonnaciSeriesDemo(7);
//		t1.start();
		Fib f=new Fib(8);
		Thread t1=new Thread(f,"t1");
		Thread t2=new Thread(f,"t2");

		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//fb1.start();
			//	fb1.start();
	}
	

}



class Fib implements Runnable{
	public int n=0,sum=0,first=0,second=1,first1=0,second1=1,sum1=0;
	//int arr[];
	int arr[]=new int[10];
	public Fib(int n) {
		// TODO Auto-generated constructor stub
		this.n=n;
	}
	public void run() {
		if(Thread.currentThread().getName()=="t1") {
		System.out.print(first+"+"+second);
		sum=first+second;
		arr[0]=sum;
		System.out.print("+"+sum);
		for(int i=3;i<n;i++) {
		
			first=second;
			second=sum;
			sum=first+second;
			System.out.print("+"+sum);
			arr[i-2]=sum;
//			System.out.print("---");
//			System.out.println(sum);
		}
		first=second;
		second=sum;
		sum=first+second;
		System.out.println("="+sum);
		}
		else  if(Thread.currentThread().getName()=="t2") {
		// TODO Auto-generated method stub
		System.out.print(first1+"+"+second1);
		sum1=first1+second1;
		System.out.println("="+sum1);
		for(int i=3;i<=n;i++) {
		//System.out.println(first);
			first1=sum1;
			//System.out.print(arr[i]);
			second1=arr[i-3];
			System.out.print(first1+"+"+second1);
			sum1=first1+second1;
			System.out.println("="+sum1);

		}
		//System.out.println(sum);
		}
		
	
}
}

