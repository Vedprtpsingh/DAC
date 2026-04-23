package Day02;
import java.util.Scanner;
public class StackUsingArray {
    public static void main(String[] args) {
        s.push();
        s.pop();
        s.peek();
        System.out.println(s.isEmpty());
        System.out.println("Stack size is: " + s.length());
    }
}
class s {
    static int top = -1;
    static int[] arr = new int[11];
    public s() {
    }
    public static void push() {
        if (top == arr.length) {
            System.out.println("Stack is full !");
        }
        top++;
        Scanner sc = new Scanner(System.in);
        arr[top] = sc.nextInt();
    }

    public static int length() {
        if (isEmpty()) {
            return 0;
        }
        return top + 1;
    }

    public static boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    public static void peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }else{

            System.out.println(arr[top]);
        }
    }

    public static void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        top--;
    }

}
