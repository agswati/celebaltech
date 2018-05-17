import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
public class Demo {
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int a[]=new int[100];
    for(int i=0;i<100;i++)
    {
        a[i]=sc.nextInt();
    }

    System.out.print(Arrays.stream(a).sum());
}

}
