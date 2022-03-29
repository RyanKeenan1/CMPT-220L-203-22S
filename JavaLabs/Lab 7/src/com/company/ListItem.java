package com.company;

public class ListItem {
    private int value;
    private ListItem childListItem;

    public ListItem(int providedVal) {
        value = providedVal;
    }

    public void setChild(ListItem providedListItem) {
        childListItem = providedListItem;
    }

    public ListItem getChild() {
        return childListItem;
    }

    public int getValue() {
        return value;
    }
}
