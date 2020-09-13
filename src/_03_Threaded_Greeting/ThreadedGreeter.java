package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
int threadNum;
	public ThreadedGreeter(int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello from thread number: "+threadNum);
		if(threadNum<=50) {
			
		}
		
	}

}
