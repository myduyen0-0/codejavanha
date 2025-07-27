import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Nhap so phan tu n:");
        int n = scn.nextInt();
        scn.nextLine();
        int[] arr = new int[n];
        System.out.println("Nhap so phan tu cua mang:");
        int sum=0;
        for (int i=0;i<n;i++){
            arr[i]=scn.nextInt();
            sum+=arr[i];
        }
        System.out.println("Tong cac phan tu trong mang la: "+ sum);
    }
}