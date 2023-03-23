import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Enter weight of person- " + i + ": ");
            int weight = sc.nextInt();
            System.out.println("Enter height of person- " + i + ": ");
            double height = sc.nextDouble();

            if (weight < 60 && height > 5.5) {
                count++;
            }
        }

        System.out.println("Count of persons is: " + count);
    }
}
