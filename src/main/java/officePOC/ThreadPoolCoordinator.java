package officePOC;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolCoordinator {
	
		ExecutorService executorService;
		
		public ExecutorService getExecutorService() {
			return executorService;
		}

		public ThreadPoolCoordinator() {
		  executorService = Executors.newFixedThreadPool(5);
		}
		
		public void enqueue(Cloneworker cloneworker){
			executorService.execute(cloneworker);
		}
		
		public void shutDown(){
			executorService.shutdown();
			try {
				executorService.awaitTermination(10L, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			while(!executorService.isShutdown()){
				System.out.println("waiting for exec to stop");
			}
			
		}
		
	
}
