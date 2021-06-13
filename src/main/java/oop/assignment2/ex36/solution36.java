package oop.assignment2.ex36;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution36 {


    private static final Scanner in = new Scanner(System.in);

    private static String listofNumbers;

    public static void main(String[] args){

        input();
        average();

    }

    private static void input() {


        List<String> listofNumbers = new ArrayList<String>();

        while (true){
            System.out.print("Enter a number: ");
            String number = in.nextLine();

            if (number.equals("done")){
                break;
            }
            else {
                listofNumbers.add(number);
            }
        }
        System.out.print("Numbers:" + listofNumbers);
    }

    private static void average(ArrayList listofNumbers) {

        //double doubleArray = Double.parseDouble(listofNumbers);

        int i;
        int intArray;

        intArray = new ArrayList[listofNumbers.size()];

        for(i=0; i<listofNumbers.size(); i++){

            intArray[i] = listofNumbers[i];

        }
}
