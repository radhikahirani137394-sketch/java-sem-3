class A {
    void display() {
        System.out.println("Parent Class");
    }
}

class B extends A {
    void show() {
        System.out.println("Child Class B");
    }
}

class C extends A {
    void print() {
        System.out.println("Child Class C");
    }
}

public class pro15 {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.display();
        obj1.show();

        C obj2 = new C();
        obj2.display();
        obj2.print();
    }
}