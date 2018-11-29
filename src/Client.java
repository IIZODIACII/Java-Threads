public class Client extends Thread {
    private String name;
    private int num_clients;

    public Client(String name){
        this.name = name;
    }

    public void set_num_clients(int num){
        num_clients = num;
    }

    public String get_name(){
        return this.name;
    }

    public int get_num_clients(){
        return num_clients;
    }
}
