package a;

import java.util.Scanner;
import java.util.Vector;


public class test {
	
	public static void main(String[] args) {
Scanner Input=new Scanner(System.in);
System.out.println("Enter The Number of Pumbs?");
		int pumb=Input.nextInt();
System.out.println("Enter The Number of Clients?");
		int num_clients=Input.nextInt();
Vector<String>Names=new Vector<String>(); 	
Input.nextLine();
System.out.println("Enter The Names of the Clients??");
for(int i=0;i<num_clients;i++){
	
	String n=Input.nextLine();

	Names.addElement(n);
}	
Petrol_Station P=new Petrol_Station();
P.Start(pumb, num_clients, Names);


Input.close();		
	}

	
	
	
}

