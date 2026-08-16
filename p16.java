// WAP to group the names of the student according to the department

import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    String dept;

    Student(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String toString(){
        return name; 
    }
}

public class p16 {
    public static void main(String[] args) {
        // Implementation for grouping students by department
        ArrayList<Student> li = new ArrayList<>();
        li.add(new Student("Amit", "CSE"));
        li.add(new Student("Ashok", "ECE"));
        li.add(new Student("Alok", "CSE"));
        li.add(new Student("Harish", "ECE"));
        li.add(new Student("Harsh", "CSE"));

        // System.out.println(li);

        // toList() method is used to collect the elements of the stream into a list
        // groupingBy() method is used to group the elements of the stream by a classifier function (map)
        
        Map<String, List<Student>> result = li.stream().collect(Collectors.groupingBy(n -> n.dept));
        System.out.println(result);
    }
}

// equals() and toString() methods are important for the viva interviews

// Map<key,value> = Map<String,List<Student>>