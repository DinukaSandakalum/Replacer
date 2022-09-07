package com.replaceuserinput;

import java.util.Scanner;

public class ReplaceEasy {
    Scanner s = new Scanner(System.in);

    String insert;

    public void get(){
        System.out.println("Enter");
        String input = s.nextLine();

        String insert;
        boolean inserting =true;

        do {
            System.out.println("what");
            insert = s.nextLine();

            if (input.contains(insert)) {
                System.out.println("OK");
                break;
            }

            System.out.println("not found");

        } while (inserting=true);

        System.out.println("Replace with");
        String replacer = s.nextLine();
        System.out.println(replacer);

        System.out.println( input.replace(insert,replacer));

    }
}
