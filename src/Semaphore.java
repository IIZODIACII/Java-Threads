package a;

public class Semaphore {
	public static int S=0;
 	public  synchronized void Wait(OS_Thread x){
 		
 		synchronized (x) {
 			S--;  //Lock the resource a.k.a (Pumb)
 			boolean f_time=true;
		while(S<0){
			try {
                if(f_time){System.out.println(x.getName()+" Is Waiting");f_time=false;}				
                x.wait(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
 		 }
		x.current_pumb=S+1;
 		
 		}
 		
 		}

 	public synchronized void Signal(){
 			S++;    // Release the resource
 	
 	}	
}
