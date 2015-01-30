package Tests;

import List.List;

public class TestClass {
    public static void main(String[] args) {

        //List.List myList = new List.List.LinkedList();
        List myList = new List.ArrayList();
        myList.add(3,3);
        myList.add("four");
        int myArray []  =  new int [] {5,6,7};
        myList.add(myArray);
        int myInt = 8;
    }
}
