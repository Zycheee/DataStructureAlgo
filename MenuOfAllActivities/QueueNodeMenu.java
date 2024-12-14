import java.util.*;

public class QueueNodeMenu {
    public void queueNode() {
        Scanner scan = new Scanner(System.in);
        String item;
        String option;
        boolean condition = true;
        QueueNode queue = new QueueNode();
        while (condition) {
            System.out.print("\n--Queue Node Menu--\n[1] Enqueue\n[2] Dequeue\n[3] Show Front Node\n[4] Show Last Node\n[5] Display Queue\n[6] Exit Program\nSelect a choice: ");
            option = scan.nextLine();
            switch (option) {
                case "1":
                    System.out.print("Enter an item: ");
                    item = scan.nextLine();
                    if (queue.enqueue(item)) {
                        System.out.println("Item has been added successfully.");
                    }
                    else
                        System.out.println("Queue is already full.");
                    break;
                case "2":
                    if (queue.dequeue()) {
                        System.out.println("Remove successfully.");
                    }
                    else
                        System.out.println("Queue is empty.");
                    break;
                case "3":
                    if (queue.getFirst() != null) {
                        System.out.println("["+queue.getFirst()+"]");
                    }
                    else
                        System.out.println("Queue is empty...");
                    break;
                case "4":
                    if (queue.getLast() != null) {
                        System.out.println("["+queue.getLast()+"]");
                    }
                    else
                        System.out.println("Queue is empty...");
                    break;
                case "5":
                    queue.display();
                    break;
                case "6":
                    System.out.println("Shutting down...");
                    condition = false;
                    break;
                default:
                    System.out.println("There was an error, please try again.");
            }
        }
    }
}
