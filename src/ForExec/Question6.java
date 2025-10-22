package ForExec;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("1번 숫자 입력 :");
        int a =  sc.nextInt();
        System.out.println("2번 숫자 입력 :");
        int b =  sc.nextInt();

        while(b != 0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        System.out.println("최대공약수는 " + a);

    }
}
