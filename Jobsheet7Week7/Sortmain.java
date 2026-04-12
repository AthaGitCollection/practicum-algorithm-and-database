package Jobsheet7Week7;

public class Sortmain {
    public static void main(String[] args) {

        System.out.println("Sorting with merge sort");

        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};

        Mergesort m = new Mergesort();

        System.out.println("Initial Data");
        m.printArray(data);

        m.mergeSort(data);

        System.out.println("Sorted Data");
        m.printArray(data);
    }
}