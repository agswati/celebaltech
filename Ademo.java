import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Map;

interface Person
{
	int x=50000;
	public void salary();
}


class Ademo
{
	public static void main(String args[])
	{ int i=10000;
		Person p1 = new Person() {
            @Override
            public void salary() {
               
                System.out.print("Salary is "+x);
            }
        };
        p1.salary();

      Person p2 = ()->{  
        	
            System.out.println("Inc salary= "+i);  
        };  
        p2.salary();


List<String> strings = Arrays.asList("c", "ba", "", "efg", "abcd","", "jkl");
List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
System.out.println("Filtered List: " + filtered);


List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
System.out.println("Squares List: " + squaresList);


List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
int count = strings.stream().filter(string -> string.isEmpty()).count();
System.out.println("Empty Strings: " + count);


List numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
IntSummaryStatistics stats = integers.stream().mapToInt((x) -> x).summaryStatistics();
System.out.println("Highest number in List : " + stats.getMax());
System.out.println("Lowest number in List : " + stats.getMin());

	}
}