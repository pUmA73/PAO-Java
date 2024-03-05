import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N: ");

        int N = scanner.nextInt();

        System.out.println(fibonacci(N));
    }

    public static int fibonacci(int n) {
        if(n <= 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else if(n == 2) {
            return 2;
        }

        // Aici ne asumam ca incepem fibonacci cu primul termen 1
        // si al doilea termen 2 -> (1, 2, 3 ...)
        // diferit de fibonacci care incepe cu (1, 1, 2) sau (0, 1, 1)
        int first = 1;
        int second = 2;
        int sum = 0;
        for(int i = 3; i <= n; ++i) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
