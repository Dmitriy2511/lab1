import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = Math.max(a, b);

        int max = Math.max(d, c);

        System.out.println("Max is " + max);

        in.close();

    }
}
