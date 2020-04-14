package com.haziqhassan;

import java.util.ArrayList;

public class GroceryList {

    private static int[] myNumbers;
    private static ArrayList<String> groceryList = new ArrayList<String>();

    public static void addGroceryItem(String item){
        groceryList.add(item);
    }

    public static void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list ");
        for(int i = 0; i<groceryList.size(); i++){
            System.out.println((i + 1) + ". "+ groceryList.get(i));
        }
    }

    public static void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println("Grocery item "+ (position+1) + " has been modified.");
    }

    public static void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public static String findItem(String searchItem){
        int  position = groceryList.indexOf(searchItem);
        if(position >= 0 ){
            return groceryList.get(position);
        }

        return  null;
    }
}
