
import java.util.Scanner;

public class OddAndEven {
    public void oddAndEven() {
        int num;
        int[] even = new int[10];
        int[] odd = new int[10];
        int evenCount = 0;
        int oddCount = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            num = scan.nextInt();

            if (num % 2 == 0) {
                even[evenCount++] = num;
            } else {
                odd[oddCount++] = num;
            }
        }

        System.out.println("Even\tOdd");

        int maxRows = Math.max(evenCount, oddCount);
        for (int j = 0; j < maxRows; j++) {
            if (j < evenCount) {
                System.out.print(even[j]);
                if (String.valueOf(even[j]).length() < 8) {
                    System.out.print("\t\t");
                } else {
                    System.out.print("\t");
                }
            } else {
                System.out.print("\t\t");
            }

            if (j < oddCount) {
                System.out.println(odd[j]);
            } else {
                System.out.println();
            }
        }
    }
}
