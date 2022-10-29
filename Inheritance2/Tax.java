package LabAssignment2;

import java.util.Scanner;
//   PROBLEM NO. 1
public class Tax {
    public static void main(String[] args) {
        TaxCalculator info = new TaxCalculator();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter 1. If you are married otherwise Enter 0.");
        info.setStatus(obj.nextInt());
        System.out.println("Enter Your Income:");
        info.setIncome(obj.nextInt());
        System.out.println("You Tax amount :");
        System.out.printf("%.2f", info.getTax());

    }

}
