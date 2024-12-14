
import java.util.*;
public class StackListMenu {
    public void stackList(){
        Scanner scan = new Scanner(System.in);
        String item, exit;
        String option;
        boolean condition = true;
        StackList stackList = new StackList();

        while (condition) {
            System.out.print("\n--Stack Array Menu--\n[1] Push an item\n[2] Pop\n[3] Peek\n[4] Get Count\n[5] Display Stack\n[6] Exit Program\nSelect a choice:  ");
            option = scan.nextLine().toUpperCase();
            switch (option) {
                case "1":
                    System.out.print("Enter an item: ");
                    item = scan.nextLine();
                    if (stackList.push(item)) {
                        System.out.println("Pushed successfully");
                    }
                    else
                        System.out.println("Stack is already full.");
                    break;
                case "2":
                    if (stackList.pop() == null) {
                        System.out.println("Stack is empty.");
                    }
                    else
                        System.out.println("Popped successfully");
                    break;
                case "3":
                    System.out.println(stackList.peek());
                    break;
                case "4":
                    System.out.print(stackList.getCount());
                    break;
                case "5":
                    stackList.display();
                    break;
                case "6":
                    System.out.println("Shutting down...");
                    condition = false;
                    break;
                default:
                    System.out.println("There was an error, please try again");
            }
        }
    }
}