import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList <String> fruit = new ArrayList<String>();
        boolean playAgain = true;

        fruit.addAll(Arrays.asList("Apple", "Banana", "Pear", "Strawberry", "Blueberry", "Grape", "Peach", "Pineapple", "Orange", "Melon", "Mango", "Kiwi", "Coconut", "Cherry", "Apricot", "Lemon"));
        printList(fruit);
        do {
            String menu = InputHelper.getRegExString(scan, "Options: \nA  -  Add an item to the list    \nD  -  Delete an item from the list   \nP  -  Print the list    \nQ  -  Quit the program", "[AaDdPpQq]");
            if (menu.equalsIgnoreCase("A")) {
                addList(scan, fruit);
            }
            else if (menu.equalsIgnoreCase("D")) {
                deleteList(scan, fruit);
            }
            else if (menu.equalsIgnoreCase("P")) {
                printList(fruit);
            }
            else if (menu.equalsIgnoreCase("Q")) {
                playAgain = quitList(scan);
            }

        } while (playAgain);
    }


    private static void addList(Scanner scan, ArrayList fruit) {
        String newItem;
        newItem = InputHelper.getNonZeroLenString(scan, "Enter a new item");
        fruit.add(newItem);
    }

    private static void deleteList(Scanner scan, ArrayList fruit) {
        int indexRemove;
        indexRemove = InputHelper.getRangedInt(scan, "What item do you want to remove? (Enter index)", 0, fruit.size() - 1);
        fruit.remove(indexRemove);
    }

    private static void printList(ArrayList fruit) {
        for(int i = 0; i < fruit.size(); i++) {
            System.out.println(i + " - "  + fruit.get(i));
        }
    }

    private static boolean quitList(Scanner scan) {
        boolean quit = InputHelper.getYNConfirm(scan, "Are you sure you want to quit? [Y/N]");
        return quit;
    }
}
