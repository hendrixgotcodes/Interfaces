package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {



    }
    public static ArrayList<String> readValues()
    {
        ArrayList<String> values = new ArrayList<>();

        boolean quit = false;
        int option = -1;
        int index = 0;
        Scanner scanner = new Scanner(System.in);

        while (!quit)
        {
            System.out.println("Press:\n\t1. -To enter a string\n\t2. -To quit");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option)
            {
                case 2 :
                    quit = true;
                break;
                case 1:
                    System.out.println("Please enter a string");
                    String input = scanner.nextLine();
                    values.add(index, input);
                    index++;
            }
        }
        return values;
    }
    public static void save(ISaveable object)
    {
        for (int i = 0; i < object.write().size(); i++)
        {
            System.out.println("Ssving " + object.write().get(i) + " to storage device");
        }
    }
}
