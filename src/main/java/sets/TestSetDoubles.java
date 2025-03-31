package sets;

import java.util.Collections;
import java.util.HashSet;

public class TestSetDoubles {
    public static void main(String[] args) {
        HashSet<Double> numbers = new HashSet<>();
        Collections.addAll(numbers, 1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01);

        for(Double n: numbers){
            System.out.println(n);
        }

        System.out.println(Collections.max(numbers));
        numbers.remove(Collections.min(numbers));

        System.out.println("Smalled element removed");
        for(Double n: numbers){
            System.out.println(n);
        }
    }
}
