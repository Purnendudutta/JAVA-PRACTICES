import java.util.ArrayList;
import java.util.List;

public class SplitList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        List<Integer> firstHalf = new ArrayList<>();
        List<Integer> secondHalf = new ArrayList<>();
        
        int size = list.size();
        int mid = size / 2;

        // Copy elements into first half
        for (int i = 0; i < mid; i++) {
            firstHalf.add(list.get(i));
        }

        // Copy elements into second half
        for (int i = mid; i < size; i++) {
            secondHalf.add(list.get(i));
        }

        System.out.println("Original list: " + list);
        System.out.println("First half: " + firstHalf);
        System.out.println("Second half: " + secondHalf);
    }
}
