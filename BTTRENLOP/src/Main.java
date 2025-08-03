import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Class Student
        Student st=new Student("Duyn",19);
        st.sayHello();

        st.setName("Mỳ Duýn");
        st.setAge(18);

        System.out.println("Tên và tuổi mới là: "+st.getName()+" "+ st.getAge());
        //Class Car
        Car c=new Car("MEO MEO",190);
        c.run();
    }
}