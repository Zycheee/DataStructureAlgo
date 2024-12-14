import java.util.*;

public class ProgramMenu {
   public static void main (String... args) {
      Scanner scan = new Scanner(System.in);
      String item;
      String option;
      boolean condition = true;
      
      while (condition) {
         System.out.print("""
                 \n-Activities Menu--
                 [1] StackArray Menu\s
                 [2] StackList Menu
                 [3] QueueArray Menu
                 [4] QueueNode Menu
                 [5] InfixToPostfix Menu
                 [6] No Duplicates
                 [7] NodeList Menu
                 [8] Sum and Product
                 [9] Odd and Even
                 [10] Largest and Smallest
                 [11] Exit Program
                 Select a choice: \s""");
         int option1 = scan.nextInt();
         switch (option1) {
            case 1:
                  Systems stackArray = new Systems();
                  stackArray.stackArray();
                  break;
            case 2:
                  StackListMenu stackList = new StackListMenu();
                  stackList.stackList();
                  break;
            case 3:
                  QueueArrayMenu queueArray = new QueueArrayMenu();
                  queueArray.queueArrayMenu();
                  break;
            case 4:
                  QueueNodeMenu queueNode = new QueueNodeMenu();
                  queueNode.queueNode();
                  break;
            case 5:
                  PostfixMenu postfix = new PostfixMenu();
                  postfix.postfixMenu();
                  break;
            case 6:
                  NoDuplicate noDupe = new NoDuplicate();
                  noDupe.noDuplicate();
                  break;
            case 7:
                  NodeListMenu nodeList = new NodeListMenu();
                  nodeList.nodeListMenu();
                  break;
            case 8:
                 SumAndProduct sumandproduct = new SumAndProduct();
                 sumandproduct.sumAndProduct();
                 break;
            case 9:
                 OddAndEven oddEven = new OddAndEven();
                 oddEven.oddAndEven();
                 break;
            case 10:
                 LargestSmallest largest = new LargestSmallest();
                 largest.largestSmallest();
                 break;
            case 11:
                 System.out.println("Shutting down...");
                 condition = false;
                 break;
            default:
                System.out.println("There was an error, please try again.");
         }
      }
   }
}