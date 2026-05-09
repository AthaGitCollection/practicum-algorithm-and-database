package Jobsheet11Week12;

import org.w3c.dom.Node;

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
        
    
Student3 std1 = new Student3("001", "Student 1", "TI-1I", 3.89);
Student3 std2 = new Student3("002", "Student 2", "TI-1I", 3.45);
Student3 std3 = new Student3("003", "Student 3", "TI-1I", 3.20);
Student3 std4 = new Student3("004", "Student 4", "TI-1I", 3.00);

sll.print();
sll.addFirst(std4);
sll.print();
sll.addLast(std1);
sll.print();
sll.insertAfter(std3, "Student 4");
sll.insertAt(2, std2);
sll.print();
}

}

