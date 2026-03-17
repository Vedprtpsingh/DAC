package simpleInheritanceExample;
class A {
    int add(int a, int b) {
        return a + b;
    }
}
class B extends A {
    int mul(int a, int b) {
        return a * b;
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("Addition: " + b.add(2, 6));
        System.out.println("Multiplication: " + b.mul(2, 6));
    }
}