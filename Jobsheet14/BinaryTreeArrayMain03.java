package Jobsheet14;

public class BinaryTreeArrayMain03 {
    public static void main(String[] args) {

        BinaryTreeArray03 bta = new BinaryTreeArray03();

        Student03 m1 = new Student03("244107020138", "Devin", "TI-1I", 3.57);
        Student03 m2 = new Student03("244107020023", "Dewi", "TI-1I", 3.85);
        Student03 m3 = new Student03("244107020225", "Wahyu", "TI-1I", 3.21);
        Student03 m4 = new Student03("244107020076", "Angelina", "TI-1I", 3.54);
        Student03 m5 = new Student03("244107020223", "Andhika", "TI-1I", 3.72);
        Student03 m6 = new Student03("244107020226", "Bima", "TI-1I", 3.37);
        Student03 m7 = new Student03("244107020181", "Eiyu", "TI-1I", 3.46);

        // Testing add()
        bta.add(m1);
        bta.add(m2);
        bta.add(m3);
        bta.add(m4);
        bta.add(m5);
        bta.add(m6);
        bta.add(m7);

        System.out.println("In-order Traversal:");
        bta.traverseInOrder(0);

        System.out.println("\nPre-order Traversal:");
        bta.traversePreOrder(0);
    }
}