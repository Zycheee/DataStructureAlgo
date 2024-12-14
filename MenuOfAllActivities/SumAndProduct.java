import java.util.Scanner;
class SumAndProduct {
    public void sumAndProduct() {
        int sum = 0, num , product = 1, product2 = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Number " + (i+1) +": " );
            num = scan.nextInt();

            if (num > 0) {
                sum = sum + num;
                product = product * num;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.print("Product: " + product);

    }
}