package LabAssignment2;

import java.util.Scanner;

// PROBLEM NO.  3
public class Year {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        isLeaperYear year = new isLeaperYear();
        System.out.println("Enter year: ");
        year.setYear(obj.nextInt());

        System.out.println(year.getLeaper());
    }
    
}
