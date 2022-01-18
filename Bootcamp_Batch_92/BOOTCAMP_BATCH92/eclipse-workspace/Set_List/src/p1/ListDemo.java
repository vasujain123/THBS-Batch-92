package p1;

import java.util.ArrayList;
import java.util.List;
 
public class ListDemo {
 
    public static void main(String[] args) {
 
        List Sports = new ArrayList();
 
        Sports.add("Kabaddi");
        Sports.add("Football");
        Sports.add("Cricket");
        Sports.add("Kabaddi");
        Sports.add("Chess");


        List IndoorSports = new ArrayList();

        IndoorSports.add("Carum");
        IndoorSports.add("Ludo");
        IndoorSports.add("Arm_Wrestling");
        IndoorSports.add("Chess");
        IndoorSports.add("Table_Tennis");

        //add all -> Union

     Sports.addAll(IndoorSports);        
     System.out.println(Sports);//[Kabaddi, Football, Cricket, Kabaddi, Chess, Carum, Ludo, Arm_Wrestling, Chess, Table_Tennis]

        //removeAll -> minus

       Sports.removeAll(IndoorSports);
       System.out.println(Sports); //[Kabaddi, Football, Cricket, Kabaddi]

        //retailAll -> intersection

       Sports.retainAll(IndoorSports);
       System.out.println(Sports); //   [Chess]
    }
 
}