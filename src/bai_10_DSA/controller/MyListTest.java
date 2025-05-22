package bai_10_DSA.controller;

import bai_10_DSA.model.MyList;
import bai_10_DSA.view.MyListView;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();

        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");
        myList.add(1, "Orange");

        MyListView.printMessage("Element at index 1: " + myList.get(1));
        MyListView.printMessage("Contains 'Banana'? " + myList.contains("Banana"));

        myList.remove(2);
        MyListView.printMessage("After remove, size: " + myList.size());

        MyList<String> cloneList = myList.clone();
        MyListView.printMessage("Cloned list size: " + cloneList.size());

        myList.clear();
        MyListView.printMessage("After clear, size: " + myList.size());

        MyListView.printLine();
    }
}
