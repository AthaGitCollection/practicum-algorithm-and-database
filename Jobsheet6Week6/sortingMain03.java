package Jobsheet6Week6;

public class sortingMain03 {
    public static void main(String[] args) {

        int[] a = {34, 7, 23, 32, 5, 62};
        sorting03 sorting = new sorting03(a);

        System.out.println("Original array:");
        sorting.print();
        sorting.bubbleSort();
        System.out.println("Sorted array (Bubble Sort):");
        sorting.print();


        int[] b = {30, 20, 2, 8, 14};
        sorting03 sorting2 = new sorting03(b);

        System.out.println("Original array:");
        sorting2.print();
        sorting2.selectionSort();
        System.out.println("Sorted array (Selection Sort):");
        sorting2.print();


        int[] c = {40, 10, 4, 9, 3};
        sorting03 sorting3 = new sorting03(c);

        System.out.println("Original array:");
        sorting3.print();
        sorting3.insertionSort();
        System.out.println("Sorted array (Insertion Sort):");
        sorting3.print();

    }
}

