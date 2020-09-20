package _03_Threaded_Greeting;

public class ThreadedGreeter implements Runnable {
int threadNum;
	public ThreadedGreeter(int i) {
		// TODO Auto-generated constructor stub
		threadNum=i;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread n=new Thread();
		System.out.println("Hello from thread number: "+threadNum);
		if(threadNum<50) {
			n=new Thread(new ThreadedGreeter(threadNum+=1));
			n.start();
			try {
				n.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
