package mentor4;

public class DrawingTree {
    public static void main(String[] args) {
        int n = 5;
        int spaces = n - 1;
        int ast;
        for (int i = 0; i < n; i++) {
            ast = 2 * i + 1;
            for (int j = 1; j <= spaces + ast; j++) {
                if (j <= spaces)
                    System.out.print(' ');
                else
                    System.out.print('*');
            }
            System.out.println();
            spaces--;
        }
    }
}
