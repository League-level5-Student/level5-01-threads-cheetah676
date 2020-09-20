package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
Thread[] t;
ConcurrentLinkedQueue<Task> taskQueue;

ThreadPool(int totalThreads){
	t=new Thread[totalThreads];
	for(int i=0; i<t.length; i++) {
		t[i]=new Worker();
		taskQueue=new ConcurrentLinkedQueue<Task>();
	}
}
void addTask(Task task) {
	taskQueue.add(task);
}
void start() {
	for(int i=0; i<t.length; i++) {
	t[i].start();
	try {
		t[i].join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
}
