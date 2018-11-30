package a;

import java.util.Vector;

public class Petrol_Station {
	
private Vector<OS_Thread>Clients=new Vector<OS_Thread>();
	
	public void Start(int pumbs,int num_clients,Vector<String>Names) {
if(pumbs==0){System.out.println("There are no Pumbs");return;}
for(int i=0;i<num_clients;i++){
OS_Thread s=new OS_Thread();
s.set_Pumbs(pumbs);
s.setName(Names.elementAt(i));
Clients.addElement(s);
Clients.lastElement().start();
}


}
	
	
	
	
}
