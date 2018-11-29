import java.util.ArrayList;

public class Station {
    private int num_pumps;
    private ArrayList<Pump> pumps = new ArrayList<Pump>();

    public Station(int num){
        num_pumps = num;
    }
    public int get_num_pumps(){
        return num_pumps;
    }
}