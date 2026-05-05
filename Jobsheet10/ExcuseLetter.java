package Jobsheet10;

public class ExcuseLetter {
    String id, name, className;
    char typeOfExcuse;
    int duration;

    public ExcuseLetter() {
    }

    public ExcuseLetter(String id, String name, String className, char type, int duration) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.typeOfExcuse = type;
        this.duration = duration;
    }

    public void display() {
        System.out.println(name + "\t" + id + "\t" + className + "\t" + typeOfExcuse + "\t" + duration);
    }
}