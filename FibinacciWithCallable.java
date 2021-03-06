import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

//import sun.tools.serialver.resources.serialver;

public class FibinacciWithCallable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service=Executors.newSingleThreadExecutor();
		CallService c=new CallService();
		Future<List<Integer>> call=service.submit(c);
		//System.out.println("   ");
		//Thread.sleep(100);
		
		try {
			Thread.sleep(100);
			if(call.isDone()) {
				List<Integer>ll=call.get();
//				System.out.println("Futue"+"----"+ll.get(0));
				ll.forEach(System.out::println);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("----------");
		FutureTask<List<Integer>>futureTask=new FutureTask<>(c);
		Thread t=new Thread(futureTask,"CallableT1");
		t.start();
		try {
			List<Integer> ll1=new ArrayList<>();
			Thread.sleep(100);
			if(futureTask.isDone()) {
				ll1=futureTask.get();
				ll1.forEach(System.out::println);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		service.shutdown();
}

}
class CallService implements Callable<List<Integer>>{

	@Override
	public List<Integer> call() throws Exception {
		// TODO Auto-generated method stub
		List<Integer> ll=new ArrayList<>();
		ll.add(0);
		ll.add(1);
		int n=10;
		for(int i=2;i<n;i++) {
			int num=ll.get(i-2);
			int num1=ll.get(i-1);
			int sum=num+num1;
			ll.add(sum);
			System.out.println(Thread.currentThread().getName()+"-----"+ll.get(i));
		}
		
		return ll;
	}
	
}