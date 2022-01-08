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
    
    int tage = s1.age;
    s1.age = s2.age;
    s2.age = tage;

    s1 = new Student();

    String tname = s1.name;
    s1.name = s2.name;
    s2.name = tname;

    s1.sayHi();
    s2.sayHi();

    s2 = new Student();
  }

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.age = 10;
    s1.name = "A";

    Student s2 = new Student();
    s2.age=20;
    s2.name = "B";

    s1.sayHi();
    s2.sayHi();
    swap(s1, s2);
    s1.sayHi();
    s2.sayHi();

  }
}
