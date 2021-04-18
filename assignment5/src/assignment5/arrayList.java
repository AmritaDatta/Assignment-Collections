package assignment5;

import java.util.ArrayList;

public class arrayList {

    public static void main(String[] args) {
        
        ArrayList <Integer> array = new ArrayList <Integer> ();
        
        for (int index =1; index < 10; index++){
            array.add(index);
        }
        System.out.println(array);
    }   
}