class A {
    void display() {
        System.out.println("This is Parent Class");
    }
}

class B extends A {
    void show() {
        System.out.println("This is Child Class");
    }
}

public class pro13 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.show();
    }
}