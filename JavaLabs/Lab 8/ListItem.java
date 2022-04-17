import java.util.ArrayList;
import java.util.Collections;

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

    public ListItem getLastChild(ListItem currentItem) {
        if (currentItem.getChild() == null) {
            return currentItem;
        }

        return getLastChild(currentItem.getChild());
    }

    public void addValueEndOfList(int value) {
        ListItem lastItem = getLastChild(childListItem);

        ListItem newChild = new ListItem(value);
        lastItem.setChild(newChild);
    }

    public void deleteItemFromList(int value) {
        ListItem parentItem = this;
        ListItem currentItem = this;
    
        while(currentItem.getValue() != value) {
            parentItem = currentItem;
            currentItem = currentItem.getChild();
        }

        // Check if found ListItem has children and if does move up to the next list item
        if (currentItem.getChild() == null) {
            currentItem = null;
        } else {
            ListItem childItem = currentItem.getChild();

            currentItem = null;
            parentItem.childListItem = childItem;
        }
    }

    public ArrayList<Integer> getSortedListOfInts(ListItem selectedItem, ArrayList<Integer> currentList) {
        if (selectedItem.getChild() != null) {
            currentList.add(selectedItem.getValue());
            currentList = getSortedListOfInts(selectedItem.getChild(), currentList);
        } else {
            currentList.add(selectedItem.getValue());
        }

        // Now sort from least to greatest
        Collections.sort(currentList);

        return currentList;
    }

    public ArrayList<Integer> printSortedListOfInts(ListItem item) {
        ArrayList<Integer> startingList = new ArrayList<>(); // Used since a blank array is needed for method cal.l.

        return getSortedListOfInts(item, startingList);
    }
}
