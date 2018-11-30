package a;

public class Semaphore {
	public static int S=0;
 	public static  synchronized void Wait(OS_Thread x){
 		
 		synchronized (x) {
 			S--;  //Lock the resource a.k.a (Pumbs)	
		if(S<=0){
			try {
				System.out.println("and waiting");
				
                x.wait(500);				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
 		 }
 		
 		}
 		
 		}

 	public static synchronized void Signal(OS_Thread x){
 		synchronized (x) {
 			S++;    // Release the resource	
		}
 	}	
}
