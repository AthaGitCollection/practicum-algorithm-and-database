package Jobsheet16;

import java.util.Stack;
import java.util.Iterator;
import java.util.Collections;

public class LoopCollection {

    public static void main(String[] args) {


        Stack<String> fruits = new Stack<>();

        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");


        for(String fruit : fruits){
            System.out.printf("%s ", fruit);
        }


        System.out.println("\n" + fruits.toString());


        while(!fruits.empty()){
            System.out.printf("%s ", fruits.pop());
        }


        System.out.println();



        // Add new fruits

        fruits.push("Melon");
        fruits.push("Durian");


        System.out.println();



        for(Iterator<String> it = fruits.iterator(); it.hasNext();){

            String fruit = it.next();

            System.out.print(fruit + " ");

        }


        System.out.println();


        fruits.stream().forEach(e -> {
            System.out.print(e + " ");
        });


        System.out.println();



        for(int i = 0; i < fruits.size(); i++){

            System.out.print(fruits.get(i) + " ");

        }


        System.out.println();



        // Change last element to Strawberry

        fruits.set(fruits.size()-1, "Strawberry");


        System.out.println("After change last element:");

        System.out.println(fruits);



        // Add Mango, guava, avocado

        fruits.push("Mango");
        fruits.push("guava");
        fruits.push("avocado");


        Collections.sort(fruits);


        System.out.println("After sorting:");

        System.out.println(fruits);

    }
}