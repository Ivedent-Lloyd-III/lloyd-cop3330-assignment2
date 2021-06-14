package oop.assignment2.ex34;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution 34 Test
 *  Copyright 2021 Ivedent Lloyd III
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class nameListReturnTest {

    @Test
    void newEmployeeNameList() {

        String removedEmployee = "John Smith";

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
    }
}