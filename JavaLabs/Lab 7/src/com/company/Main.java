package com.company;

public class Main {

    public static void main(String[] args) {
	    ListItem item1 = new ListItem(22);
        ListItem item2 = new ListItem(15);
        ListItem item3 = new ListItem(23);
        ListItem item4 = new ListItem(28);

        item1.setChild(item2);
        item2.setChild(item3);
        item3.setChild(item4);

        ListItem currentLoop = item1;
        int currentLoopTracker = 1;

        while(currentLoop.getChild() != null) {
            System.out.println("Item " + currentLoopTracker + " has another child!" + currentLoop.getChild() + ". Value is " + currentLoop.getValue());

            currentLoopTracker++;
            currentLoop = currentLoop.getChild();
        }

        System.out.println("Final child! " + currentLoop + " has value of " + currentLoop.getValue());
    }
}
