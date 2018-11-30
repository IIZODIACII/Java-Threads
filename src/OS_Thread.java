package a;

import java.util.Random;

public class OS_Thread extends Thread {

int current_pumb=0;

public synchronized void occ(){System.out.println("Pumb "+current_pumb+":"+this.getName()+" Occupied");}
public synchronized void pay(){System.out.println("Pumb "+current_pumb+":"+this.getName()+" Paying");}
public synchronized void lea(){System.out.println("Pumb "+current_pumb+":"+this.getName()+" Leave");}

public void run(){
 		
 		Random rand = new Random(); 
 		int value = rand.nextInt(500-201)+201; 	
 	
 	synchronized (this) {
 		System.out.println(this.getName()+" "+"Arrived");		
 		Semaphore.Wait(this);
	} 
 	
 	synchronized (this) {
 		occ();	
	try {
		this.wait(value); 	
		} 
	catch (InterruptedException e) {
		e.printStackTrace();
	}
 	}
 	
 	
 
 synchronized (this) {
	 pay();
	 value = rand.nextInt(500)+1;
 try {
		this.wait(value);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
 } 
 synchronized (this) {
	 Semaphore.Signal(this);
	 lea();	
 }
 
 
 
 	}
	
	
	
	
}
