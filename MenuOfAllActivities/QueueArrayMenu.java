import java.util.*;

public class QueueArrayMenu {
    public void queueArrayMenu () {
        Scanner scan = new Scanner(System.in);
        String item;
        String option;
        boolean condition = true;
        int size;

        System.out.println("Enter a size: ");
        size = scan.nextInt();
        QueueArray queue = new QueueArray(size);
        scan.nextLine();

        while (condition) {
            System.out.print("\n--Queue Array Menu--\n[1] Enqueue\n[2] Dequeue\n[3] Front\n[4] Display Queue\n[5] Exit Program\nSelect a choice:  ");
            option = scan.nextLine();
            switch (option) {
                case "1":
                    System.out.print("Enter an item: ");
                    item = scan.nextLine();
                    if (queue.enqueue(item)) {
                        System.out.println("Item has been added successfully");
                    }
                    else
                        System.out.println("Queue is already full.");
                    break;
                case "2":
                    if (queue.dequeue()) {
                        System.out.println("Remove successfully");
                    }
                    else
                        System.out.println("Queue is empty.");
                    break;
                case "3":
                    if (queue.front() != null) {
                        System.out.println("["+queue.front()+"]");
                    }
                    else
                        System.out.println("Queue is empty...");
                    break;
                case "4":
                    queue.display();
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