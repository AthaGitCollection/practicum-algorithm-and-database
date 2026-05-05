package Jobsheet10;

public class StudentAssignmentStack3 {
    Student3[] stack;
int top, size;

StudentAssignmentStack3(int size){
        this.size = size;
        top = -1;
        stack = new Student3[size];
    }
boolean isFull(){
        if(top == size - 1){
            return true;
        }else{
            return false;
        }
    }
boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
void push(Student3 std){
        if(!isFull()){
            top++;
            stack[top] = std;
        }else{
            System.out.println("Stack is already full!!");
        }
    }
Student3 pop(){
        if(!isEmpty()){
            Student3 std = stack[top];
            top--;
            return std;
        }else{
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }
Student3 peek(){
        if(!isEmpty()){
            return stack[top];
        }else{
            System.out.println("There is no data in Stack!!");
            return null;
        }
    }
void print() {
        for (int i = 0; i <= top; i++)
            System.out.println(stack[i].name + "\t" + 
                               stack[i].nim + "\t" + 
                               stack[i].className);
}

}
