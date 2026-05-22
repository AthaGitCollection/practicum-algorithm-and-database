package DLL;

public class DoubleLinkedListsMain {

    public static void main(String[] args) {

        DoubleLinkedLists list = new DoubleLinkedLists();

        System.out.println("========== INSERT DATA ==========");

        list.print();

        list.addFirst(new Student("111", "Anton", "TI-1I", 3.57));
        System.out.println("After addFirst():");
        list.print();

        list.addLast(new Student("112", "Prabowo", "TI-1I", 3.70));
        System.out.println("After addLast():");
        list.print();

        list.addFirst(new Student("113", "Herco", "TI-1I", 3.89));
        System.out.println("After second addFirst():");
        list.print();

        list.insertAfter("111",
                new Student("114", "Rizki", "TI-1I", 3.80));
        System.out.println("After insertAfter 111:");
        list.print();

        list.insertAfter("112",
                new Student("115", "Hanzel", "TI-1I", 3.60));
        System.out.println("After insertAfter 112:");
        list.print();

        list.insertAfter("120",
                new Student("116", "Eiyu", "TI-1I", 3.40));
        list.print();

        System.out.println("========== REMOVE DATA ==========");

        System.out.println("Delete first node");
        list.removeFirst();
        list.print();

        System.out.println("Delete last node");
        list.removeLast();
        list.print();

        System.out.println("Delete node at index 1");
        list.remove(1);
        list.print();

        System.out.println("========== ASSIGNMENT ==========");

        System.out.println("Total data : " + list.getSize());

        System.out.println("\nFirst data : ");
        if(list.getFirst() != null){
            list.getFirst().print();
        }

        System.out.println("\nLast data : ");
        if(list.getLast() != null){
            list.getLast().print();
        }

        System.out.println("\nData at index 1 : ");
        if(list.getIndex(1) != null){
            list.getIndex(1).print();
        }

        System.out.println("\nIndex of NIM 112 : "
                + list.indexOf("112"));

        System.out.println("Index of NIM 111 : "
                + list.indexOf("111"));

        System.out.println("\nAdd data at index 1");
        list.add(new Student("999", "Newbie", "TI-1I", 4.00), 1);
        list.print();

        System.out.println("Remove node after NIM 111");
        list.removeAfter("111");
        list.print();
    }
}