package a;

import java.util.Random;

public class OS_Thread extends Thread {

 	public void run(){
 		
 		Random rand = new Random(); 
 		int value = rand.nextInt(500-201)+201; 	
 	System.out.println(this.getName()+" "+"Arrived");	
 	Semaphore.Wait(this);
 	System.out.println("Pumb "+(Semaphore.S+1)+":"+this.getName()+" Occupied");
 	try {
        OS_Thread.sleep(500);
 	} catch (InterruptedException e) {
		e.printStackTrace();
	}
 	
 System.out.println("Pumb "+(Semaphore.S+1)+":"+this.getName()+" Paying");	
 value = rand.nextInt(500)+1;
 try {
		OS_Thread.sleep(500);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
 Semaphore.Signal();
 System.out.println("Pumb "+(Semaphore.S+1)+":"+this.getName()+" Leaving");	
 
 
 	}
	
	
	
	
}
