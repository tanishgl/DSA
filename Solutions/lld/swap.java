import java.util.*;

public class Main {

  static class Student{
    int age;
    String name;

    void sayHi(){
      System.out.println(this.name + " " + this.age);
    }
  }

  public static void swap(Student s1, Student s2){
    Student temp = s1;
    s1 = s2;
    s2 = temp;
  }

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.age = 20;
    s1.name = "A";

    Student s2 = new Student();
    s2.age=30;
    s2.name = "B";

    s1.sayHi();
    s2.sayHi();
    swap(s1, s2);
    s1.sayHi();
    s2.sayHi();

  }
}
