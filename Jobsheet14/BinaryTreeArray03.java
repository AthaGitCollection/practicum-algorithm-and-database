package Jobsheet14;

public class BinaryTreeArray03 {

    Student03[] data;
    int idxLast;
    public BinaryTreeArray03(){
        data = new Student03[10];
        idxLast = -1;
    }
    void populateData(Student03[] data, int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            if(data[idxStart] != null){
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
    void add(Student03 student){

    if(idxLast < data.length - 1){
        data[++idxLast] = student;
    }
    else{
        System.out.println("Array is full!");
    }
}
void traversePreOrder(int idxStart){

    if(idxStart <= idxLast){

        if(data[idxStart] != null){

            data[idxStart].print();

            traversePreOrder(2 * idxStart + 1);

            traversePreOrder(2 * idxStart + 2);
        }
    }
}
}

