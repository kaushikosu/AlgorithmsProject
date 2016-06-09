package officePOC;

public class Cloneworker implements Runnable {
		
		String cloneObjectId;
	
		public Cloneworker (String cloneObjectId){
			this.cloneObjectId = cloneObjectId;
		}

		public void run() {
			System.out.println("Clone worker "+ cloneObjectId+" started on "+Thread.currentThread().getName());
			DRC drc = new DRC();
			drc.command();
			System.out.println("Clone worker "+ cloneObjectId+" ended on "+ Thread.currentThread().getName());
		} 
}
