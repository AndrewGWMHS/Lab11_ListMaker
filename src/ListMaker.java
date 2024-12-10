import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {
    private static ArrayList <String> fruit = new ArrayList<String>();
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        boolean playAgain = true;
        String menu;

        fruit.addAll(Arrays.asList("Apple", "Banana", "Pear", "Strawberry", "Blueberry", "Grape", "Peach", "Pineapple", "Orange", "Watermelon", "Mango", "Kiwi", "Coconut", "Cherry", "Apricot", "Lemon"));
        printList();
        do {
            menu = InputHelper.getRegExString(scan, "Options: \nA  -  Add an item to the list    \nD  -  Delete an item from the list   \nP  -  Print the list    \nQ  -  Quit the program", "[AaDdPpQq]");
            if (menu.equalsIgnoreCase("A")) {
                addList();
            }
            else if (menu.equalsIgnoreCase("D")) {
                deleteList();
            }
            else if (menu.equalsIgnoreCase("P")) {
                printList();
            }
            else if (menu.equalsIgnoreCase("Q")) {
                playAgain = !quitList();
            }

        } while (playAgain);
    }


    private static void addList() {
        String newItem;
        newItem = InputHelper.getNonZeroLenString(scan, "Enter a new item");
        fruit.add(newItem);
    }

    private static void deleteList() {
        int indexRemove;
        indexRemove = InputHelper.getRangedInt(scan, "What item do you want to remove? (Enter index)", 0, fruit.size() - 1);
        fruit.remove(indexRemove);
    }

    private static void printList() {
        for(int i = 0; i < fruit.size(); i++) {
            System.out.println(i + " - "  + fruit.get(i));
        }
    }

    private static boolean quitList() {
        boolean quit = InputHelper.getYNConfirm(scan, "Are you sure you want to quit? [Y/N]");
        return quit;
    }
}
