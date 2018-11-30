package a;

import java.util.Random;

public class OS_Thread extends Thread {
public synchronized void occ(){System.out.println("Pumb "+(Semaphore.S+1)+":"+this.getName()+" Occupied");}
public synchronized void pay(){System.out.println("Pumb "+(Semaphore.S+1)+":"+this.getName()+" Paying");}
public synchronized void lea(){System.out.println("Pumb "+(Semaphore.S+1)+":"+this.getName()+" Leave");}
 	public void run(){
 		
 		Random rand = new Random(); 
 		int value = rand.nextInt(500-201)+201; 	
 	System.out.println(this.getName()+" "+"Arrived");	
 	synchronized (this) {
 		Semaphore.Wait(this);
	} 
 	occ();
 	synchronized (this) {
		
	try {
		this.wait(value); 	
		} 
	catch (InterruptedException e) {
		e.printStackTrace();
	}
 	}
 	pay();
 	
 value = rand.nextInt(500)+1;
 synchronized (this) {

 try {
		this.wait(value);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
 } 
 synchronized (this) {
	 Semaphore.Signal(this);
}
 lea();	
 
 
 	}
	
	
	
	
}
