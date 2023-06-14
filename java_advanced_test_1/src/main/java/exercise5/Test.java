package exercise5;

import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2,3,4,5,6);
        Predicate<Integer> functionNumbers = i -> i % 2 == 0;

        List<String> names = List.of("John", "Peter", "Angelina", "Bravo");
        Predicate<String> functionNames = i -> i.length() > 4;

        double percent1 = partOf(names, functionNames);
        System.out.println(percent1);

        double percent2 = partOf(nums, functionNumbers);
        System.out.println(percent2);

    }
    public static <T> double partOf(List<T> elemets, Predicate function){
        int initialCount = elemets.size();
        long filteredCount = elemets.stream().filter(function).count();
        return (double) filteredCount /(double) initialCount;
    }
}
