import java.util.Scanner;

public class S_Gach {
    public static final String Square="Square";
    public static final String Triangle="Triangle";
    public static final String Circle="Circle";
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        System.out.print("Nhap hinh dang(Vuong,Tam giac,Tron): ");
        String type=sca.nextLine();

    if(type.equalsIgnoreCase("Square")){
        System.out.print("Nhap canh cua hinh vuong: ");
        double side = sca.nextDouble();
        double area= TinhSquarearea(side);
        System.out.println("Dien tich hinh vuong: "+ area);
    }
     else if(type.equalsIgnoreCase("Triangle")){
        System.out.print("Nhap canh day cua tam giac: ");
        double day = sca.nextDouble();
        System.out.print("Nhap chieu cao cua tam giac: ");
        double cao = sca.nextDouble();
        double area= tinhTrianglearea(day,cao);
        System.out.println("Dien tich tam giac: "+ area);
    }
     else if(type.equalsIgnoreCase("Circle")){
        System.out.print("Nhap ban kinh cua hinh tron: ");
        double bankinh = sca.nextDouble();
        double area= tinhCirclearea(bankinh);
        System.out.println("Dien tich hinh tron: "+ area);
    }
     else{
         System.out.println("Hinh dang khong dung!");
     }
     sca.close();
    }

    private static double tinhCirclearea(double bankinh) {
        return Math.PI * bankinh * bankinh;
    }

    private static double tinhTrianglearea(double day, double cao) {
        return day*cao*0.5;
    }

    private static double TinhSquarearea(double side) {
 return side*side;
    }

}