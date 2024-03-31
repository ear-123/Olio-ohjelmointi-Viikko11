package com.example.viikko11;

import java.util.ArrayList;

public class ListGrocery {
    private static ListGrocery listGrocery = null;
    private ArrayList<Grocery> list = new ArrayList<Grocery>();

    private ListGrocery() {

    }

    public static ListGrocery getInstance(){
        if (listGrocery == null) {
            listGrocery = new ListGrocery();
            listGrocery.addGrocery(new Grocery("test", "example"));
        }
        return listGrocery;
    }

    public void addGrocery(Grocery grocery){
        list.add(grocery);
    }

    public Grocery getGroceryByName(String name){
        for(Grocery grocery : list){
            if(grocery.getName() == name){
                return grocery;
            }
        }
        return null;
        //return new Grocery("Example name", "Example note");
    }
    public ArrayList<Grocery> getGroceries(){
        return list;
    }




}
