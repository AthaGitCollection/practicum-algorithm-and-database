package Jobsheet6Week6;

public class studentdemo03Complete {
    public static void main(String[] args) {

        topstudent03 ts3 = new topstudent03();
        ts3.add(new student03("2201", "Alice", "A", 3.9));
        ts3.add(new student03("2202", "Bob", "B", 3.7));
        ts3.add(new student03("2203", "Charlie", "C", 3.8));
        ts3.add(new student03("2204", "David", "D", 3.6));
        ts3.add(new student03("2205", "Eve", "E", 4.0));
        
      
        System.out.println("Sorted student list (by GPA, ascending) using Insertion Sort:");
        ts3.insertionSort();
        ts3.print();
    }
}