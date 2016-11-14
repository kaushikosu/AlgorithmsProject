package officePOC;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import javax.enterprise.concurrent.ManagedExecutorService;
import javax.enterprise.concurrent.ManagedTaskListener;

public class SimpleManagedExecutorService implements ManagedExecutorService,ManagedTaskListener{

	int var;
	ManagedExecutorService executorService;
	int submitted;
	int started;

	public SimpleManagedExecutorService(ManagedExecutorService executorService) {
		this.executorService = executorService;
	}

	public void shutdown() {
		// TODO Auto-generated method stub
		
	}

	public List<Runnable> shutdownNow() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isShutdown() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isTerminated() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
		// TODO Auto-generated method stub
		return false;
	}

	public <T> Future<T> submit(Callable<T> task) {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> Future<T> submit(Runnable task, T result) {
		// TODO Auto-generated method stub
		return null;
	}

	public Future<?> submit(Runnable task) {
		submitted ++;
		return executorService.submit(task);
	}

	
	public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
			throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		return null;
	}

	public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit)
			throws InterruptedException, ExecutionException, TimeoutException {
		// TODO Auto-generated method stub
		return null;
	}

	public void execute(Runnable command) {
		// TODO Auto-generated method stub
		
	}

	public void taskAborted(Future<?> arg0, ManagedExecutorService arg1, Object arg2, Throwable arg3) {
		
	}

	public void taskDone(Future<?> arg0, ManagedExecutorService arg1, Object arg2, Throwable arg3) {
		// TODO Auto-generated method stub
		
	}

	public int getStartedCount(){
		return started;
	}
	
	public void taskStarting(Future<?> arg0, ManagedExecutorService arg1, Object arg2) {
		started++;
		
	}

	public void taskSubmitted(Future<?> arg0, ManagedExecutorService arg1, Object arg2) {
		// TODO Auto-generated method stub
		
	}

}
