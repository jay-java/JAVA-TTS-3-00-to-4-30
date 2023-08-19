package basic;
//Thread->is smallest unit of process
// at a time only single thread can execute 
//there are two ways to achieve thread
//1. By Thread class
//2. By Runnable interface
//Runnable interface is better way to achieve thread
//Thread Priority 
//1.Min ->1
//2.NORM-> 5
//3.MAX -> 10
class ByInterface implements Runnable{
	Thread t;
	public ByInterface() {
		t = new Thread();
		t.start();
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(t+ " : "+i);
				t.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("child thread complete");
	}
}
class ChildThread extends Thread{
	Thread t;
	public ChildThread() {
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(t+ " : "+i);
				t.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("child thread complete");
	}
	
}
public class P020_Threading {
	public static void main(String[] args){
		ChildThread c = new ChildThread();
		Thread t1 = new Thread();
		System.out.println(t1.currentThread());
		t1.setName("MyThread");
//		t1.setPriority(0);
		System.out.println(t1);
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(t1+ " : "+i);
				t1.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("main thread complete");
	}
}
