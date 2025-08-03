import java.util.Scanner;

public class Student {
   private String name;
   private int age;
   public Student(String name,int age){
       this.name=name;
       this.age=age;
   }
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   }
   public int getAge(){
       return age;
   }
   public void setAge(int age){
       this.age=age;
   }
public void sayHello() {
    Scanner sc=new Scanner(System.in);
    /*System.out.print("Nhập tên: ");
    name=sc.nextLine();
    System.out.print("Nhập tuổi: ");
    age=sc.nextInt();*/
    System.out.println("Xin chao,toi ten la "+name+",nam nay "+age+" tuoi.");
}
}
