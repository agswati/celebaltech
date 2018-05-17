import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Map;


public class Ademo {
    public static void main(String args[]) {
        int l = 10000;
        // anonymous class
        Person p1 = new Person() {
            @Override
            public void salary() {

                System.out.println("Salary is " + x);
            }
        };
        p1.salary();
        //lambda 
        Person p2 = () -> {

            System.out.println("Inc salary= " + l);
        };
        p2.salary();

        //streams
        List<String> strings = Arrays.asList("c", "ba", "", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);


        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        System.out.println("Squares List: " + squaresList);


        List<String> string2 = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        int count = (int)string2.stream().filter(string -> string.isEmpty()).count();
        System.out.println("Empty Strings: " + count);


        List number = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = number.stream().mapToInt((x) -> (int) x).summaryStatistics();
        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());

    }

    public interface Person{
        public void salary();
        int x=50000;

    }
}
