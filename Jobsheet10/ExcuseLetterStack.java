package Jobsheet10;

public class ExcuseLetterStack {
    ExcuseLetter[] stack;
    int top, size;

    public ExcuseLetterStack(int size) {
        this.size = size;
        top = -1;
        stack = new ExcuseLetter[size];
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(ExcuseLetter data) {
        if (!isFull()) {
            top++;
            stack[top] = data;
        } else {
            System.out.println("Stack is full");
        }
    }

    ExcuseLetter pop() {
        if (!isEmpty()) {
            ExcuseLetter data = stack[top];
            top--;
            return data;
        } else {
            System.out.println("Stack is empty");
            return null;
        }
    }

    ExcuseLetter peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    void searchByName(String key) {
        boolean found = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].name.equalsIgnoreCase(key)) {
                stack[i].display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data not found");
        }
    }
}