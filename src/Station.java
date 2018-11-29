import java.util.ArrayList;

public class Station {
    private int num_pumps;
    private ArrayList<Integer> pumps = new ArrayList<Integer>();

    public Station(int num){
        num_pumps = num;
        for(int i = 0; i < num; i++){
            pumps.add(i + 1);
        }
    }

    public int get_num_pumps(){
        return num_pumps;
    }

    public int get_pump(int idx){
        return pumps.get(idx);
    }


}