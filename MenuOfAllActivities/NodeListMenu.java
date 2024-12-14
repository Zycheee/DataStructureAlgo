
import java.util.*;

public class NodeListMenu {
    public void nodeListMenu()  {
        Scanner scan = new Scanner(System.in);
        String item;
        String option;
        boolean condition = true;
        NodeList nodeList = new NodeList();

        while (condition) {
            System.out.print("\n--Node List Menu--\n[1] Add\n[2] Remove\n[3] Peek\n[4] Display Info\n[5] Exit Program\nSelect a choice: ");
            option = scan.nextLine();
            switch (option) {
                case "1":
                    System.out.print("Enter an item: ");
                    item = scan.nextLine();
                    if (nodeList.add(item)) {
                        System.out.println("Item has been added successfully.");
                    }
                    else
                        System.out.println("List is already full.");
                    break;
                case "2":
                    System.out.print("Enter a index: ");
                    int index = scan.nextInt();
                    if (nodeList.remove(index)) {
                        System.out.println("Remove successfully.");
                        scan.nextLine();
                    }
                    else
                        System.out.println("List is empty.");
                    break;
                case "3":
                    if (nodeList.peek() != null) {
                        System.out.println("["+nodeList.peek()+"]");
                    }
                    else
                        System.out.println("List is empty...");
                    break;

                case "4":
                    nodeList.displayInfo();
                    break;
                case "5":
                    System.out.println("Shutting down...");
                    condition = false;
                    break;
                default:
                    System.out.println("There was an error, please try again.");
            }
        }
    }
}
