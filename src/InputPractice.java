import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫 번쨰 숫자: ");
        int first=sc.nextInt();

        System.out.println("두 번쨰 숫자: ");
        int second=sc.nextInt();
        System.out.println("연산자(+,-,*,/):");
        System.out.println("결과: " +first + "," + second);

    }
}
