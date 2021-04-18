package assignment5;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class hashMap {
    
    public static void main(String[] args) {
        
        employee e1 = new employee(11, "Amrita", "SFSF");
        employee e2 = new employee(22, "Bmrita", "HR");
        employee e3 = new employee(33, "Smrita", "PO");
        employee e4 = new employee(44, "Rita", "PM");
        employee e5 = new employee(55, "Nita", "Manager");
        
        HashMap <Integer, employee> hashMap = new HashMap <Integer, employee> ();
        
        //Add records to the hashmap
        hashMap.put(1, e1);
        hashMap.put(2, e2);
        hashMap.put(3, e3);
        hashMap.put(4, e4);
        hashMap.put(5, e5);
        
        //Display the employee records which are stored in hashmap       
        Set<Entry<Integer, employee>> set = hashMap.entrySet();
        
        // Display the set
        for (Entry<Integer, employee>me : set){
            System.out.print (me.getKey() + " : ");
            System.out.print (me.getValue().name);
            System.out.print (" " + me.getValue().department);
            System.out.println (" " + me.getValue().id);
        }
    }   
}