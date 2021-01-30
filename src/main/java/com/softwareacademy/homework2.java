package com.softwareacademy;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        String myString = "My name is Test";
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(myString.replace("Test", name));


        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        System.out.println(name1.equals(name2));


        String name3 = scanner.nextLine();
        String[] words = name3.split(" ");
        System.out.println(words.length);


        String myString1 = "This is my second %s";
        String myString2 = "home work";
        System.out.println(String.format(myString1, myString2));
    }
}
