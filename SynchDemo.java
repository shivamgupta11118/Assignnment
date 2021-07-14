import java.util.ArrayList;
import java.util.List;

public class SynchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ll=new ArrayList<>();
		int n=10;
		Producer p=new Producer(ll, n);
		Consumer c=new Consumer(ll, n);
		Thread t1=new Thread(p,"Producer");
		Thread t2=new Thread(c,"Consumer");
		t1.start();
		t2.start();
		
		
	}

}
class Producer implements Runnable{
	List<Integer> ll;
	int n;
	public Producer(List<Integer> ll,int n) {
		this.ll=ll;
		this.n=n;
		// TODO Auto-generated constructor stub
	}
	public void produce(List<Integer> ll) throws InterruptedException {
		if(ll.size()==8) {
			System.out.println(Thread.currentThread().getName()+"--"+"List Full");
			ll.wait();
		}
		ll.add(0);
		ll.add(1);
		if(n>=2) {
			for(int i=2;i<n;i++) {
				int n1=ll.get(i-2);
				int n2=ll.get(i-1);
				ll.add(n1+n2);
				System.out.println(Thread.currentThread().getName()+"---"+ ll.get(i));
			}
			//ll.forEach(System.out::println);
			Thread.sleep(500);
			ll.notify();
			
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (ll) {
			try {
				produce(ll);
			}
			catch(Exception ee) {
				ee.printStackTrace();
			}
		}
	}
}
class Consumer implements Runnable{
	List<Integer> ll;
	int n;
	public Consumer(List<Integer> ll  ,int n) {
		this .ll=ll;
		this.n=n;
		// TODO Auto-generated constructor stub
	}
	void consume(List<Integer> ll) throws InterruptedException {
		if(ll.size()<=2) {
			System.out.println(Thread.currentThread().getName()+"---"+"NOt enough ele");
			ll.wait();
		}
		for(int i=2;i<n;i++) {
		int n1=ll.get(i-2);
		int n2=ll.get(i-1);
		System.out.println(n1+" + "+n2+" = "+(n1+n2));
		}
		Thread.sleep(500);
		ll.notify();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			synchronized (ll) {
				consume(ll);
			}
		}catch(Exception ee) {
			ee.printStackTrace();
		}
	}
}
