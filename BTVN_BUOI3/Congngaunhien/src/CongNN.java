import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CongNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int a = rd.nextInt(101);
        int b = rd.nextInt(101);
        int correctSum = a + b;
        int c;
        Boolean Correct = rd.nextBoolean();
        if (Correct) {
            c = correctSum;
        } else {
            do {
                c = rd.nextInt(201);

            } while (c == correctSum);
        }
        System.out.println("Phep tinh: " + a + "+" + b + "=" + c);
        System.out.print("Day la phep tinh dung hay sai?(nhap phep tinh): ");
        String Ptoan = sc.nextLine();
        Boolean UserCorrect = Ptoan.equalsIgnoreCase("Phep tinh dung");
        if (UserCorrect == Correct) {
            System.out.println("Ban da tra loi dung!");
        } else {
            System.out.println("Ban da tra loi sai!");
        }

        sc.close();
    }
}