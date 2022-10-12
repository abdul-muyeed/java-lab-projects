import java.util.Scanner;

public class SumWithoutSmallest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];

        for(int i=0;i<10;i++)
        {
            array[i]=in.nextInt();

        }
        Sum s = new Sum(array);

        System.out.println("Sum of the Array without the smallest value: "+ s.getSum());
        System.out.println("Difference: "+ s.getDiference());
    }
    
}
