package com.replaceuserinput;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Replace {

    Scanner s = new Scanner(System.in);

    public void input(){
        System.out.print("Please Enter a text?: ");
        String input = s.nextLine();

        ArrayList<String> inputSplits = new ArrayList<>(List.of(input.split(" ")));

        System.out.println(input);

        boolean inserting = true;

        String insert = "";

        while (inserting==true) {
            System.out.print("Please enter a word to be replace");
            insert = s.next();

            for(int i=0; i<inputSplits.size(); i++){
                if(inputSplits.get(i).equals(insert)){
                    System.out.println("OK");
                    inserting =false;
                    break;
                }
                else if(i==inputSplits.size()-1){
                    System.out.println("This word "+insert+" is nor found");
                }
            }

        }


        System.out.print("Replace with what?: ");
        String replace = s.next();

        //System.out.println("OK");
        //System.out.println(inputSplits);
        inputSplits.set(inputSplits.indexOf(insert),replace);
        //System.out.println(inputSplits);
        for(String s: inputSplits){
            System.out.print(s+" ");
        }

    }

}
