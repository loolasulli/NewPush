package mentor10;

import static mentor10.HeapAndStackDemo.factorial;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial(" + n + ")=" + factorial(n));
        HeapAndStackDemo demo = new HeapAndStackDemo();
        demo.createObjects();
    }
}