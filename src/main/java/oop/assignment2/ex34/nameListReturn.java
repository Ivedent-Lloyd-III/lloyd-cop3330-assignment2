package oop.assignment2.ex34;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Ivedent Lloyd III
 */

import java.util.ArrayList;
import java.util.List;

public class nameListReturn {

    public static void newEmployeeNameList(String removedEmployee) {

        List<String> namesList = new ArrayList<>();
        namesList.add("John Smith");
        namesList.add("Jackie Jackson");
        namesList.add("Chris Jones");
        namesList.add("Amanda Cullen");
        namesList.add("Jeremy Goodwin");

        switch (removedEmployee) {
            case "John Smith" -> namesList.remove("John Smith");
            case "Jackie Jackson" -> namesList.remove("Jackie Jackson");
            case "Chris Jones" -> namesList.remove("Chris Jones");
            case "Amanda Cullen" -> namesList.remove("Amanda Cullen");
            case "Jeremy Goodwin" -> namesList.remove("Jeremy Goodwin");
        }

        System.out.println("There are 4 employees:");
        for (String s : namesList) {

            System.out.println(s);
        }
    }
}
