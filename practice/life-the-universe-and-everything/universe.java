import java.util.Scanner;

public class Universe {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int num = stdin.nextInt();
        while(num != 42) {
            System.out.println(num);
            num = stdin.nextInt();
        }
        stdin.close();
    }
}