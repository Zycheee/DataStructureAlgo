import java.util.*;

public class PostfixMenu {
   public void postfixMenu() {
      Scanner scan = new Scanner(System.in);
      String option;
      boolean condition = true;
      String infix;
      String conversion = "";
      double answer = 0;
      
      while (condition) {
         System.out.print("\n--Welcome to the Postfix Converter Menu--\n[1] Convert to Postfix\n[2] Evaluate Postfix\n[3] Exit Program\nSelect a choice: ");
         option = scan.nextLine();
         switch (option) {
            case "1":
               try {
                  System.out.print("Enter an expression: ");
                  infix = scan.nextLine();
                  PostfixProgram postfix = new PostfixProgram(infix);
                  conversion = postfix.convert();
                  System.out.println("\n["+conversion+"] Expression has been converted succesfully.");
               } catch (Exception e){System.out.println("Expression cannot be converted, please try again");}
               break;
            case "2":
               try {
                  PostfixEvaluation evaluation = new PostfixEvaluation();
                  answer = evaluation.evaluate(conversion);
                  System.out.println("\nResult: "+answer);
               } catch (Exception e) {System.out.println("Expression cannot be answered, please try again.");}
               break;
             case "3":
               System.out.println("Shutting down...");
               condition = false;
               break;
            default:
               System.out.println("There was an error, please try again");
       } 
    }
  }
}
