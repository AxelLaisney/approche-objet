package listes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Collections.addAll(numbers, -1, 5, 7, 3, -2, 4, 8, 5);

        System.out.println("Size of numbers: " + numbers.size());
        int max = 0;
        for(int n: numbers){
            if(n > max){
                max = n;
            }
        }

        System.out.println("Max of numbers is: " + max);

        int min = 0;
        for(int n: numbers){
            if(n < min){
                min = n;
            }
        }

        int index = 0;
        for(int i = 0; i < numbers.size(); i++){
            if(min == numbers.get(i)){
                index = i;
            }
        }
        numbers.remove(index);
        System.out.println("Removing smallest number");
        DisplayList(numbers);

        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) < 0){
                numbers.set(i, (numbers.get(i) * -1));
            }
        }

        System.out.println("Converting negative to positive");
        DisplayList(numbers);
    }

    public static void DisplayList(ArrayList<Integer> array){
        for(int a: array){
            System.out.println(a);
        }
    }
}
