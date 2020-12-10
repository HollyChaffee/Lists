package com.hollychaffee;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> groceryLine = new ArrayList<>();
        groceryLine.add("Phillip");
        groceryLine.add("Anna");
        groceryLine.add("Sarah");

        System.out.println(groceryLine);

        groceryLine.remove(2);
        System.out.println(groceryLine);

        String Phillip = groceryLine.get(0);
        System.out.println(Phillip);
    }
}
