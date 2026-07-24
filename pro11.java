interface Test {
    void display();
}

class Demo implements Test {
    public void display() {
        System.out.println("Hello Interface");
    }
}

public class pro11 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}