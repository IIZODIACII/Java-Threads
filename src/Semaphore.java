package a;

public class Semaphore {
	public static int S=0;
 	public static  synchronized void Wait(OS_Thread x){
 		S--;  //Lock the resource a.k.a (Pumbs)
 		if(S<=0){
			try {
				System.out.println("and waiting");
				
				OS_Thread.sleep(500);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
 		}
 		
 		}

 	public static synchronized void Signal(){
 		S++;    // Release the resource
 	}	
}
