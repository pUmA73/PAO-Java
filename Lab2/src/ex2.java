import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter three numbers");

        int a = reader.nextInt();
        int b = reader.nextInt();
        int c = reader.nextInt();

        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        if(a < b) {
            System.out.print(a + " < " + b);
        } else {
            System.out.print(a + " = " + b);
        }

        if(b < c) {
            System.out.print(" < " + c);
        } else {
            System.out.print(" = " + b);
        }
    }
}
