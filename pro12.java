interface A {
    void show();
}

interface B extends A {
    void print();
}

class Demo implements B {
    public void show() {
        System.out.println("Show Method");
    }

    public void print() {
        System.out.println("Print Method");
    }
}

public class pro12 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        d.print();
    }
}