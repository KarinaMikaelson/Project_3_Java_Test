package org.example.e100;

import java.util.Scanner;

public class E100StringManipulations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("In:");
        String input = scan.nextLine();
        for(int i = input.length()-1; i >= 0; i--){
            System.out.print(input.charAt(i));
        }
        System.out.println("");
    }
}
