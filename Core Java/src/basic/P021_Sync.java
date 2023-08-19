package basic;

class CallBack {
	public void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print("]");
	}
}

class Caller implements Runnable {
	String msg;
	CallBack c;
	Thread t;

	public Caller(String msg, CallBack c) {
		this.msg = msg;
		this.c = c;
		t = new Thread(this);
		t.start();
	}

	public void run() {
		synchronized (msg) {
			c.call(msg);
		}
	}
}

public class P021_Sync {
	public static void main(String[] args) {
		CallBack c = new CallBack();
		Caller c1 = new Caller("first", c);
		Caller c2 = new Caller("second", c);
		Caller c3 = new Caller("third", c);
		Caller c4 = new Caller("fourth", c);
	}
}
