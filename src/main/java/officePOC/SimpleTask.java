package officePOC;

import java.util.Map;

import javax.enterprise.concurrent.ManagedTask;
import javax.enterprise.concurrent.ManagedTaskListener;

public class SimpleTask implements Runnable,ManagedTask{

	Runnable worker;
	ManagedTaskListener listener;
	
	public SimpleTask(Runnable worker,ManagedTaskListener listener) {
		this.worker = worker;
		this.listener = listener;
	}

	public Map<String, String> getExecutionProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	public ManagedTaskListener getManagedTaskListener() {
		return this.listener;
	}
	

	public Runnable getWorker() {
		return worker;
	}

	public void run() {
		this.worker.run();	
	}
	

}
