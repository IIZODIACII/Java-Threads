package a;

import java.util.Random;

public class OS_Thread extends Thread {
Semaphore x=new Semaphore();
int current_pumb=0;

public synchronized void occ(){System.out.println("Pumb "+current_pumb+":"+this.getName()+" Occupied");}
public synchronized void pay(){System.out.println("Pumb "+current_pumb+":"+this.getName()+" Paying");}
public synchronized void lea(){System.out.println("Pumb "+current_pumb+":"+this.getName()+" Leave");}
public synchronized void sev(){System.out.println("Pumb "+current_pumb+":"+this.getName()+" Being Served");}

public void run(){
	Random rand = new Random(); 
 		int value = rand.nextInt(500-201)+201; 	
 	synchronized (this) {
 		System.out.println(this.getName()+" "+"Arrived");		
 		x.Wait(this);
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
        sev();	
       try {
		this.wait(value); 	
		} 
	catch (InterruptedException e) {
		e.printStackTrace();
	}
 	}
 	
 	
 	pay();
	value = rand.nextInt(100)+1;
	
 synchronized (this) {
	 


 try {

		this.wait(value);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}

 x.Signal();

 } 
	 lea();	
 
 
 
 	}
	
	
	
	
}
