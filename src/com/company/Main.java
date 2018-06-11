package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private List<String> nameList;
    private Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        Main mainclass = new Main();
        mainclass.testingLists();
    }

    private void testingLists() {

        nameList = new ArrayList<String>();

        nameList.add("Eden");
        nameList.add("Nick");
        nameList.add("Kelly");
        nameList.add("Veritie");

        System.out.println("See All Items in the Array List. ");
        //For Each loop--to see all items in array list
        for (String name : nameList) {
            System.out.println(name);
        }

        System.out.println("See a Single Item in the Array List. ");
        //if i want to print out "Kelly" you need get(2) because java uses base 0 so get(0) would print "Eden"
        System.out.println(nameList.get(2));

        System.out.println("Remove a Single Item and List What Is Left in the Array List. ");
        nameList.remove(0);
        for (String name : nameList) {
            System.out.println(name);
        }

        System.out.println("Viewing Array List Using Iteration Loop with Numbers. ");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println((i + 1) + " " + nameList.get(i));
        }

        System.out.println("Which number would you like to remove? ");
        int numberToRemove = input.nextInt() - 1;
        if (numberToRemove >= nameList.size() || numberToRemove < 0) {
            System.out.println("That is not a valid number");
        } else {
            nameList.remove(numberToRemove);
        }

        //could also work w/o first line with nameList.remove(input.nextInt() - 1);

        System.out.println("List After Taking Out Selected Number. ");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println((i + 1) + " " + nameList.get(i));
        }


    }

}
