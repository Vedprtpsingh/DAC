package javaCityApp;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        // List
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println("ArrayList: " + al);
        List<Integer> ll = new LinkedList<>();
        ll.add(40);
        ll.add(50);
        ll.add(60);
        System.out.println("LinkedList: " + ll);
        Stack<Integer> s = new Stack<>();
        s.push(100);
        s.push(200);
        s.push(300);
        System.out.println("Stack: " + s);
        System.out.println("Stack Pop: " + s.pop());
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        System.out.println("Vector: " + v);
        Deque<Integer> lld = new LinkedList<>();
        lld.addFirst(5);
        lld.addLast(10);
        System.out.println("Deque LinkedList: " + lld);
        // Set
        Set<Integer> hs = new HashSet<>();
        hs.add(3);
        hs.add(1);
        hs.add(2);
        System.out.println("HashSet: " + hs);
        Set<Integer> lhs = new LinkedHashSet<>();
        lhs.add(3);
        lhs.add(1);
        lhs.add(2);
        System.out.println("LinkedHashSet: " + lhs);
        Set<Integer> ts = new TreeSet<>();
        ts.add(3);
        ts.add(1);
        ts.add(2);
        System.out.println("TreeSet: " + ts);
        SortedSet<Integer> sts = new TreeSet<>();
        sts.add(9);
        sts.add(7);
        sts.add(8);
        System.out.println("SortedSet: " + sts);
        // Queue
        Queue<Integer> ad = new ArrayDeque<>();
        ad.add(10);
        ad.add(20);
        ad.add(30);
        System.out.println("ArrayDeque Queue: " + ad);
        System.out.println("Queue Poll: " + ad.poll());
        Deque<Integer> add = new ArrayDeque<>();
        add.addFirst(100);
        add.addLast(200);
        System.out.println("ArrayDeque Deque: " + add);
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println("PriorityQueue: " + pq);
        System.out.println("PriorityQueue Poll: " + pq.poll());
    }
}