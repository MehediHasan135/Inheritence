package Q6;

class A {
    public void method() { System.out.println("A"); }
}

class B extends A {
    public void method() { System.out.println("B"); }
}

class C extends B {
    public void method() { System.out.println("C"); }
}

public class Main {
    public static void main(String[] args) {
        A a = new C();
        B b = (B) a;
        C c = (C) b;
        a.method(); // Prints "C"
        b.method(); // Prints "C"
        c.method(); // Prints "C"
    }
}

