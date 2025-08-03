import java.util.Calendar;
import java.util.Scanner;

public class Student {
   private String name, address;;
   private int birthYear,absentDays;
   private double TX1,TX2,KTHP;
   public Student(){

   }
public Student(String name,int birthYear,String address,double TX1,double TX2,double KTHP,int absentDays){
this.name=name;
    this.birthYear=birthYear;
this.address=address;
this.TX1=TX1;
this.TX2=TX2;
this.KTHP=KTHP;
this.absentDays=absentDays;
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
public int getBirthYear(){
    return  birthYear;
}
public void setBirthYear(int birthYear){
    this.birthYear=birthYear;
}
public String getAddress(){
    return address;
}
public void setAddress(String address){
    this.address=address;
}
public double getTX1() {
    return TX1;
}
public void setTX1(double TX1){
    this.TX1=TX1;
}
public double getTX2(){
    return TX2;
}
public void setTX2(double TX2){
    this.TX2=TX2;
}
public double getKTHP(){
    return KTHP;
}
public void setKTHP(double KTHP){
    this.KTHP=KTHP;
}
public int getAbsentDays(){
    return absentDays;
}
public void setAbsentDays(int absentDays){
    this.absentDays=absentDays;
}
public int getAge(){
    int currentYear=java.util.Calendar.getInstance().get(Calendar.YEAR);
    return extracted(currentYear);
}

    private int extracted(int currentYear) {
        return currentYear - birthYear;
    }

    public double getGPA(){
    return TX1*0.2+TX2*0.3+KTHP*0.5;
}
public void infoTable(){
  /*  Scanner sc=new Scanner(System.in);
    System.out.print("Nhập tên,Năm Sinh, địa chỉ,điểm thành phần, số tiết nghỉ của sinh viên :");
   name=sc.nextLine();
    birthYear=sc.nextInt();
    sc.nextLine();
     address=sc.nextLine();
     TX1=sc.nextDouble();
   TX2=sc.nextDouble();
    KTHP=sc.nextDouble();
    absentDays=sc.nextInt();
    sc.nextLine();*/
    System.out.printf("|%-15s|%-5s|%-15s|%-5s|%-5s|%-5s|%-5s|%-5s|\n","Tên","Tuổi","Địa chỉ","Điểm TX1","Điểm TX2","Điểm KTHP","Điểm GPA","Số tiết nghỉ");//dùng printf,%-...s(căn lề chuỗi bên trái trong cột rộng ... kí tự), %-d(số nguyên),%-__._f(số thực,__ kí tự,_ chữ số thập phân),%n
    System.out.printf("|%-15s|%-5d|%-15s|%-5.2f|%-5.2f|%-5.2f|%-5.2f|%-5d|\n",name,getAge(),address,TX1,TX2,KTHP,getGPA(),absentDays);
}
}
