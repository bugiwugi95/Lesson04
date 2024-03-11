package lesson4;

import java.util.Scanner;

public class liveCode4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int charCode = c;
        if (charCode >= 48 && charCode <= 57) {
            System.out.println("Number: " + c);
        } else {
            System.out.println("No: " + c);
        }

    }


}