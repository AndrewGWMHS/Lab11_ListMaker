import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <String> fruit = new ArrayList<String>();

        fruit.addAll(Arrays.asList("Apple", "Banana", "Pear", "Strawberry", "Blueberry", "Grape", "Peach", "Pineapple", "Orange", "Melon", "Mango", "Kiwi", "Coconut", "Cherry", "Apricot", "Lemon"));

        System.out.println(fruit);

        addList(scan, fruit);

        System.out.println(fruit);

        deleteList(scan, fruit);

        System.out.println(fruit);
    }


    private static void addList(Scanner scan, ArrayList fruit) {
        String newItem;
        newItem = InputHelper.getNonZeroLenString(scan, "Enter a new item");
        fruit.add(newItem);
    }

    private static void deleteList(Scanner scan, ArrayList fruit) {
        int indexRemove;
        indexRemove = InputHelper.getRangedInt(scan, "What item do you want to remove? (Enter index)", 0, fruit.size());
        fruit.remove(indexRemove);
    }

    private static void printList(ArrayList fruit) {
        for(int i = 0; i < fruit.size(); i++) {
        }
    }

    private static boolean quitList(Scanner scan) {
        return false;
    }
}
