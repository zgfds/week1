package ForExec;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("숫자 입력 :");
        int a =  sc.nextInt();
        int result = 1;
        for( int i=1 ; i<=a ; i++ ) {
            result *= i;
        }
        System.out.println("팩토리얼 값 " + result);
    }
}