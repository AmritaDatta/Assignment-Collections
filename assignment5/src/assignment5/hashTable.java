package assignment5;

import java.util.Enumeration;
import java.util.Hashtable;

public class hashTable {
    
    public static void main(String[] args) {
        
        student s1 = new student(23, "Rahul", 40);
        student s2 = new student(24, "Ruhul", 60);
        student s3 = new student(25, "kuhul", 70);
        student s4 = new student(26, "Rani", 30);
        student s5 = new student(27, "Rana", 80);
        
        Hashtable <Integer, student> hashTable = new Hashtable <Integer, student>();
        
        hashTable.put(1, s1);
        hashTable.put(2, s2);
        hashTable.put(3, s3);
        hashTable.put(4, s4);
        hashTable.put(5, s5);
        
        Enumeration names = hashTable.keys();
        
        int id = 0, big = 0, big_id = 0;
        
        while (names.hasMoreElements()) {
            id = (int) names.nextElement();
            
            student stu = hashTable.get(id);
            if (big < stu.marks){
                big = stu.marks;
                big_id = id;
            }
        }
        
        //Display the largest student marks data...
			student student_marks = hashTable.get(big_id);
			System.out.println("Student id " + student_marks.id);
			System.out.println ("Name : "+student_marks.name);
			System.out.println("Marks : "+student_marks.marks );
    }  
}