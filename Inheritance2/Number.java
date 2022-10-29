package LabAssignment2;  

import java.util.Scanner;
// PROBLEM NO. 4
public class Number {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        IntToRoman rom = new IntToRoman();

        System.out.println("Enter number: ");
        rom.setNumber(obj.nextInt());

        System.out.println(rom.getRoman());
    }
}
