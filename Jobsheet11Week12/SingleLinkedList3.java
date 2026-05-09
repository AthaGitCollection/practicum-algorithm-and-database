package Jobsheet11Week12;
import java.util.Scanner;
public class SingleLinkedList3 {
    Node3 head;
    Node3 tail;

    boolean isEmpty(){
        return (head == null);
    }
    void print(){
        if(!isEmpty()){
            Node3 tmp =head;
            System.out.println("LinkedList Data : ");
            while(tmp!= null) {
                tmp.data.print();
                tmp = tmp.next;
            }
        }else {
            System.out.println("LinkedList is empty !!");
        }
    }
    void addFirst(Student3 std){
        Node3 newNode = new Node3(std, null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    void addLast(Student3 std){
        Node3 newNode = new Node3(std, null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
void insertAfter(Student3 std, String key){
        Node3 newNode = new Node3(std, null);
        Node3 temp = head;
        do {
            if (temp.data.name.equalsIgnoreCase(key)) {
                newNode.next = temp.next;
                temp.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }
public void insertAt(int index, Student3 std) {
        if (index < 0) {
            System.out.println("Wrong index!!");
        } else if (index == 0) {
            addFirst(std);
        } else {
            Node3 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node3(std, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
public static void main(String[] args) {
        SingleLinkedList3 sll = new SingleLinkedList3();
    Scanner sc = new Scanner(System.in);

    System.out.print("Input NIM: ");
    String nim = sc.nextLine();

    System.out.print("Input Name: ");
    String name = sc.nextLine();

    System.out.print("Input Class: ");
    String cls = sc.nextLine();

    System.out.print("Input GPA: ");
    double gpa = sc.nextDouble();

    Student3 std = new Student3(nim, name, cls, gpa);

    sll.addFirst(std);

    sll.print();
}

}



