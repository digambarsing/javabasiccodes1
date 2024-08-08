package HashSet;

import java.util.*;

public class FruitSetExample {
    public static void main(String[] args) {
        HashSet<String> fruitSet = new HashSet<>();

        // Add fruits to the set
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");
        fruitSet.add("Apple"); // duplicate, will be ignored

        System.out.println("Initial set: " + fruitSet);

        // Check if the set contains a fruit
        boolean containsApple = fruitSet.contains("Apple");
        System.out.println("Contains Apple: " + containsApple);

        // Remove a fruit from the set
        fruitSet.remove("Banana");
        System.out.println("After removing Banana: " + fruitSet);

        // Add multiple fruits to the set
        fruitSet.addAll(Arrays.asList("Grapes", "Mango"));
        System.out.println("After adding Grapes and Mango: " + fruitSet);

        // Check if the set contains all fruits from a collection
        boolean containsAllFruits = fruitSet.containsAll(Arrays.asList("Apple", "Orange", "Grapes"));
        System.out.println("Contains all fruits: " + containsAllFruits);

        // Remove all fruits from a collection
        fruitSet.removeAll(Arrays.asList("Apple", "Orange"));
        System.out.println("After removing Apple and Orange: " + fruitSet);

        // Retain only fruits from a collection
        fruitSet.retainAll(Arrays.asList("Grapes", "Mango"));
        System.out.println("After retaining Grapes and Mango: " + fruitSet);

        // Get the size of theset
        int size = fruitSet.size();
        System.out.println("Size of the set: " + size);

        // Convert the set to an array
        String[] fruitArray = fruitSet.toArray(new String[0]);
        System.out.println("Fruit array: " + Arrays.toString(fruitArray));



        // iterate to set
        for(String s:fruitSet){
            System.out.print(s+" ");
        }

    }
}
