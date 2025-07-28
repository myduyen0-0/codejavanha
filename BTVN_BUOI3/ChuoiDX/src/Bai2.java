import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ChuoiDX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Chuoi can kiem tra: ");
        String st=sc.nextLine();
        String xoa=st.trim();
        String dao="";
        for(int i=xoa.length()-1;i>=0;i--){
            dao+=xoa.charAt(i);
        }
    if(xoa.equalsIgnoreCase(dao)){
        System.out.println(xoa.toUpperCase());
        System.out.println("-->Day la chuoi doi xung!");
    }else{
        System.out.println(xoa.toLowerCase());
        System.out.println("-->Day khong phai chuoi doi xung!");
    }
    }
}