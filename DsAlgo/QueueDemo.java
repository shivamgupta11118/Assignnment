package DsAlgo;

public class QueueDemo {
	static int front,rear,cap;
	static int q[];
	public QueueDemo(int c) {
		front=rear=0;
		cap=c;
		q=new int[c];
		
		// TODO Auto-generated constructor stub
	}
	void enqueue(int a) {
		if(cap==rear) {
			System.out.println("full");
			return;
		}
		else {
			q[rear++]=a;
			
		}
	}
	void dequeue() {
		if(front==rear) {
			System.out.println("emplty");
			return ;
		}
		else {
			for(int i=0;i<rear-1;i++) {
				q[i]=q[i+1];
			}
//			if(rear<cap) {
//				q[rear]=0;
//			}
			rear--;
		}
		return;
		
	}
	void diplay() {
		if(front==rear) {
			System.out.println("emplty");
			return ;
		}
		else {
			for(int i=front;i<rear;i++) {
				System.out.println(q[i]);
			}
		}
	}
	int Front() {
		if(front==rear) {
			System.out.println("emplty");
			return -1;
		}
		else {
			return q[front];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueDemo qd=new QueueDemo(5);
		qd.enqueue(10);
		qd.enqueue(20);
		qd.enqueue(30);
		qd.enqueue(40);
		qd.enqueue(50);
		//qd.enqueue(50);
		qd.diplay();
		qd.dequeue();
		qd.dequeue();
		qd.dequeue();
		qd.diplay();
		System.out.println("Front "+qd.Front());
	}

}
