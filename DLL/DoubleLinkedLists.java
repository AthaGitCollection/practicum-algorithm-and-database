package DLL;

public class DoubleLinkedLists {

    Node head;
    Node tail;

    DoubleLinkedLists(){
        head = null;
        tail = null;
    }

    boolean isEmpty(){
        return head == null;
    }

    void addFirst(Student data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Student data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void insertAfter(String key, Student data){

        Node current = head;

        while(current != null){

            if(current.data.nim.equalsIgnoreCase(key)){

                Node newNode = new Node(data);

                if(current == tail){
                    addLast(data);
                }else{
                    newNode.next = current.next;
                    newNode.prev = current;

                    current.next.prev = newNode;
                    current.next = newNode;
                }

                return;
            }

            current = current.next;
        }

        System.out.println("Data with key " + key + " was not found!");
    }

    void print(){

        if(isEmpty()){
            System.out.println("Double linked list is empty!!");
            return;
        }

        Node current = head;

        while(current != null){
            current.data.print();
            current = current.next;
        }

        System.out.println();
    }

    void removeFirst(){

        if(isEmpty()){
            System.out.println("List is empty!!");
        }else if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast(){

        if(isEmpty()){
            System.out.println("List is empty!!");
        }else if(head == tail){
            head = tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
    }

    void remove(int index){

        if(index < 0 || index >= getSize()){
            System.out.println("Invalid index!!");
            return;
        }

        if(index == 0){
            removeFirst();
            return;
        }

        Node current = head;

        for(int i = 0; i < index; i++){
            current = current.next;
        }

        if(current == tail){
            removeLast();
        }else{
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }

    // ASSIGNMENT

    void add(Student data, int index){

        if(index < 0 || index > getSize()){
            System.out.println("Index is invalid!!");
            return;
        }

        if(index == 0){
            addFirst(data);
            return;
        }

        if(index == getSize()){
            addLast(data);
            return;
        }

        Node current = head;

        for(int i = 0; i < index; i++){
            current = current.next;
        }

        Node newNode = new Node(data);

        newNode.prev = current.prev;
        newNode.next = current;

        current.prev.next = newNode;
        current.prev = newNode;
    }

    void removeAfter(String key){

        Node current = head;

        while(current != null){

            if(current.data.nim.equalsIgnoreCase(key)){

                if(current.next == null){
                    System.out.println("No node after this data!");
                }else if(current.next == tail){
                    removeLast();
                }else{

                    Node deleted = current.next;

                    current.next = deleted.next;
                    deleted.next.prev = current;
                }

                return;
            }

            current = current.next;
        }

        System.out.println("Data not found!!");
    }

    Student getFirst(){

        if(isEmpty()){
            return null;
        }

        return head.data;
    }

    Student getLast(){

        if(isEmpty()){
            return null;
        }

        return tail.data;
    }

    Student getIndex(int index){

        if(index < 0 || index >= getSize()){
            return null;
        }

        Node current = head;

        for(int i = 0; i < index; i++){
            current = current.next;
        }

        return current.data;
    }

    int getSize(){

        int total = 0;

        Node current = head;

        while(current != null){
            total++;
            current = current.next;
        }

        return total;
    }

    int indexOf(String key){

        Node current = head;
        int index = 0;

        while(current != null){

            if(current.data.nim.equalsIgnoreCase(key)){
                return index;
            }

            current = current.next;
            index++;
        }

        return -1;
    }
}