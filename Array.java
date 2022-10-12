import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arraySize = 10;
        int[] array = new int[arraySize];

        for(int i=0;i<10;i=i+1){
            array[i]=in.nextInt();
        }
        
        System.out.println("Print element at even index: ");
        for(int i=0;i<10;i=i+2){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println("Print element at even element: ");

        for(int i=0;i<10;i=i+1){
            if(i%2==0){
                System.out.print(array[i]+" ");
            }
        }
        System.out.println();

        System.out.println("Print element in reverse order: ");
        for(int i=9;i>-1;i=i-1){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println("First Element is "+ array[0]);
        System.out.println("last Element is "+ array[arraySize-1]);



    }
    
}
