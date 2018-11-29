import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num_pumps = 0;
        int num_clients = 0;

        System.out.println("What is number of Pumps? ");
        num_pumps = in.nextInt();
        Station obj = new Station(num_pumps);

        System.out.println("Number of Clients : ");
        num_clients = in.nextInt();

        Queue<Client> c = new LinkedList<Client>();
        in.nextLine();
        System.out.println("Clients’ names: ");
        for (int i = 0; i < num_clients; i++){
            Client client = new Client(in.nextLine());
            c.add(client);
        }

        for (int i = 0; i < num_clients; i++){
            System.out.println(((LinkedList<Client>) c).get(i).get_name());
        }
    }


}
