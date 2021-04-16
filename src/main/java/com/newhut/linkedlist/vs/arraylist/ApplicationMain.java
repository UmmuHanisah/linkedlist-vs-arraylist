package com.newhut.linkedlist.vs.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Ummu Hanisah
 * @title 14.5 LinkedList vs ArrayList in Java
 * @source https://www.youtube.com/watch?v=QWMyhFUtFHo
 */
public class ApplicationMain {

    public static void main(String[] args) {
//        ApplicationMain.addItemInArray();
//        ApplicationMain.addItemInArrayList();
        ApplicationMain.addItemInLinkedList();
    }

    public static void addItemInArray() {
        int[] testArray = new int[]{5, 7, 8, 12, 21, 2, 3};
        testArray[4] = 99;

        for (int item : testArray) {
            System.out.println(item);
        }

        /* Output
        *********
        5
        7
        8
        12
        99
        2
        3
         */
        
        /*Note
        - Adding item in array at specific location will replace the item at that location with a new one
        */
    }

    public static void addItemInArrayList() {
        List<Integer> itemList = new ArrayList<>();
        itemList.add(5);
        itemList.add(7);
        itemList.add(8);
        itemList.add(12);
        itemList.add(21);
        itemList.add(2);
        itemList.add(3);

        System.out.println("Before");
        for (int item : itemList) {
            System.out.println(item);
        }

        System.out.println("After");
        itemList.add(4, 99);
        for (int item : itemList) {
            System.out.println(item);
        }

        /* Output
        *********
        Before
        5
        7
        8
        12
        21
        2
        3

        After
        5
        7
        8
        12
        99
        21
        2
        3
         */
        
        /*Note
        - Adding item in ArrayList will not replace the existing value.
        - It will cause the the next value goes to the next index number(position). 
        It will update the next element -> we have to update every element - time consuming.
        
        - ArrayList use concept Dynamic-Array
        */
    }

    public static void addItemInLinkedList() {
        List<Integer> itemList = new LinkedList<>();
        itemList.add(5);
        itemList.add(7);
        itemList.add(8);
        itemList.add(12);
        itemList.add(21);
        itemList.add(2);
        itemList.add(3);

        System.out.println("Before");
        for (int item : itemList) {
            System.out.println(item);
        }

        System.out.println("After");
        itemList.add(4, 99);
        for (int item : itemList) {
            System.out.println(item);
        }
        
                /* Output
        *********
        Before
        5
        7
        8
        12
        21
        2
        3

        After
        5
        7
        8
        12
        99
        21
        2
        3
         */
                
        /*Note
        - Adding item in LinkedList will not replace the existing value.
        - It will store in a node. In a node has (Previous & Next)
        - Adding a new element in between element -> it will only update 2 node element (the pointing of previous & next)
        - it will not affect the number of node before that and after that.        
        - ArrayList use concept Double-linkedlist
        */
    }
}
