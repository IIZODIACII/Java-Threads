package a;

import java.util.Vector;

public class Petrol_Station {
	
private Vector<OS_Thread>Clients=new Vector<OS_Thread>();
	
	public Petrol_Station(int pumbs,int num_clients,Vector<String>Names) {
Semaphore.S=pumbs;
for(int i=0;i<num_clients;i++){
OS_Thread s=new OS_Thread();
s.setName(Names.elementAt(i));
Clients.addElement(s);
//didn't start The Threads yet(OS_Thread in not complete)
}


}
	
	
	
	
}
