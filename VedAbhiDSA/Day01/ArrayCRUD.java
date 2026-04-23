package Day01;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayCRUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The size of An Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter The Elements of Array: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        while (true) {
            System.out.println("\nEntered Array: " + Arrays.toString(arr));
            System.out.println("Select The Option: ");
            System.out.println("1. Update Element By Index\n" + //
                    "2. Replace Element\n" + //
                    "3. Remove Element\n" + //
                    "4. Size Of Array\n" + //
                    "5. Display Array\n" + //
                    "6. Search In a Array\n" + //
                    "7. Sort Of Array\n" +
                    "0. Exit\n");
            int choise = sc.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Enter The Index for Update: ");
                    int u = sc.nextInt();
                    System.out.println("Enter The Element: ");
                    arr[u] = sc.nextInt();
                    break;
                case 2:
                    System.out.println("Enter The old Element: ");
                    int oe = sc.nextInt();
                    System.out.println("Enter The New Element: ");
                    int ne = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == oe) {
                            arr[i] = ne;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter The Element: ");
                    int r = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == r) {
                            arr[i] = 0;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Array size:");
                    System.out.println(n);
                    break;
                case 5:
                    System.out.println("Array is " + Arrays.toString(arr));
                    break;
                case 6:
                    System.out.println("Enter The Element For the search");
                    int ele = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        if (arr[i] == ele) {
                            System.out.println("The " + ele + " is At the Index " + i);
                            break;
                        }
                        if (i == n - 1) {
                            System.out.println("Element is not present At the Array: ");
                        }
                    }
                    break;
                case 7:
                    int arrr[]=Arrays.copyOf(arr,n);
                    Arrays.sort(arrr);
                    System.out.println("Sorted Array is " + Arrays.toString(arrr));
                    break;
                case 0:
                    System.exit(0);
                    sc.close();
                    break;
            }
        }
    }
}