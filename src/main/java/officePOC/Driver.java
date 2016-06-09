package officePOC;

public class Driver {

	
		public static void main (String[] args){
			
			ThreadPoolCoordinator tpc = new ThreadPoolCoordinator();
			
			for (int i = 0;i < 10; i++){
				Cloneworker clw = new Cloneworker(""+i);
				tpc.enqueue(clw);
			}
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for (int j = 10;j < 20; j++){
				Cloneworker clw = new Cloneworker(""+j);
				tpc.enqueue(clw);
			}
			System.out.println("Current thread count is "+Thread.activeCount());
			System.out.println("Shutting down tpc");
			tpc.shutDown();
			System.out.println("Current thread count is "+Thread.activeCount());
		}
}
