package a;

public class Semaphore {
	public int S=0;
 	public  synchronized void Wait(OS_Thread x){
 		this.S--;  //Lock the resource a.k.a (Pumb)
		boolean f_time=true;
 		synchronized (x) {
 		
		while(this.S<0){
			try {
                if(f_time){System.out.println(x.getName()+" Is Waiting");f_time=false;}				
                x.wait(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
 		 }
		x.current_pumb=this.S+1;
 		
 		}
 		
 		}

 		
}
