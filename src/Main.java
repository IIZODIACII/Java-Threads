package a;

import java.util.Scanner;
import java.util.Vector;


public class test {
	
	public static void main(String[] args) {
Scanner Input=new Scanner(System.in);
int pumb=Input.nextInt(),num_clients=Input.nextInt();
Vector<String>Names=new Vector<String>(); 	
Input.nextLine();
for(int i=0;i<num_clients;i++){
	String n=Input.nextLine();

	Names.addElement(n);
}	
Petrol_Station P=new Petrol_Station();
P.Start(pumb, num_clients, Names);


Input.close();		
	}

	
	
	
}

