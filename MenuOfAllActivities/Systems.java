package MenuOfAllActivities;

import java.util.*;
public class Systems {
   public void stackArray (){
      Scanner scan = new Scanner(System.in);
      String item, exit;
      String option;
      boolean condition = true;
      boolean condition2 = true;
      int size;
   
      System.out.print("\nEnter an size: ");
      size = scan.nextInt();
      if (size < 1) 
         size = 10;
      StackArray stackArray = new StackArray(size);
      scan.nextLine();

      while (condition) {
         System.out.print("\n--Stack Array Menu--\n[1] Push an item\n[2] Pop\n[3] Peek\n[4] Display Stack\n[5] Exit Program\nSelect a choice:  ");
         option = scan.nextLine().toUpperCase();
         switch (option) {
            case "1":
               System.out.print("Enter an item: ");
               item = scan.nextLine(); 
               if (stackArray.push(item)) {
                  System.out.println("Pushed succesfully");
               }
               else
                  System.out.println("Stack is already full.");
               break;
            case "2":
               if (stackArray.pop()) {
                  System.out.println("Popped succesfully");
               }
               else
                  System.out.println("Stack is empty.");
               break;
            case "3":
                  System.out.println(stackArray.peek());
                  break;
            case "4":
               stackArray.display();
               break;
             case "5":
               System.out.println("Shutting down...");
               condition = false;
               break;
            default:
               System.out.println("There was an error, please try again");
        } 
      }
  }
}