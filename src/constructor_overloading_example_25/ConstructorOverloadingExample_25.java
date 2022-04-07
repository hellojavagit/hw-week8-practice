package constructor_overloading_example_25;
//java program to overload constructors

public class ConstructorOverloadingExample_25 {
    int id;
    String name;
    int age;

    //creating two arg constructor
    ConstructorOverloadingExample_25(int i, String n) {
        id = i;
        name = n;
    }

    //creating 3 arg constructor
    ConstructorOverloadingExample_25(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    public void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        ConstructorOverloadingExample_25 s1 = new ConstructorOverloadingExample_25(111, "karan");
        ConstructorOverloadingExample_25 s2 = new ConstructorOverloadingExample_25(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}


