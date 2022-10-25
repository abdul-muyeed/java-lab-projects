
import java.util.Scanner;

public class Function {
    
    public static void main(String[] args) {
        Clock myClock = new Clock();
        System.out.println("My Time: " + myClock.getTime());
    
        Scanner scan = new Scanner(System.in);
        System.out.print("How many hours ahead is your timezone: ");
        int timeZone = scan.nextInt();
        scan.close();
    
        WorldClock worldClock = new WorldClock(timeZone);
        System.out.println("My Time + " + timeZone + ": " + worldClock.getTime());
      }    
}