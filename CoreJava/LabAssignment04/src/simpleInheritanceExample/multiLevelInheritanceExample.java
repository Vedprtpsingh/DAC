package simpleInheritanceExample;
//class A {
//    int add(int a, int b) {
//        return a + b;
//    }
//}
//class B extends A {
//    int mul(int a, int b) {
//        return a * b;
//    }
//}
class C extends B{
	int div(int a,int b) {
		return a/b;
	}
}
public class multiLevelInheritanceExample {
    public static void main(String[] args) {
        C c = new C();
        System.out.println("Addition: " + c.add(32, 6));
        System.out.println("Multiplication: " + c.mul(32, 6));
        System.out.println("Div: " + c.div(32, 6));
    }
}