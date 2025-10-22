package Exec;


import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("1번 숫자 입력 :");
        int first =  sc.nextInt();

        System.out.println("+-*/ 중 입력 :");
        String operation1 =  sc.next();

        System.out.println("2번 숫자 입력 :");
        int second =  sc.nextInt();

        System.out.println("+-*/ 중 입력 :");
        String operation2 =  sc.next();

        System.out.println("3번 숫자 입력 :");
        int third =  sc.nextInt();

        double result = 0.0;

        switch (operation1){
            case "*":
                switch(operation2){
                    case "*": result = first * second * third;break;
                    case "/": result = first * second / third;break;
                    case "+" : result = first * second + third;break;
                    case "-": result = first * second - third;break;
                }
                break;
            case  "/":
                switch(operation2){
                    case "*": result = first / second * third;break;
                    case "/": result = first / second / third;break;
                    case "+": result = first / second + third;break;
                    case "-": result = first / second - third;break;
                }
                break;
            case  "+":
                switch(operation2){
                    case "*": result = first + second * third;break;
                    case "/": result = first + second / third;break;
                    case "+": result = first + second + third;break;
                    case "-": result = first + second - third;break;
                }
                break;
            case "-":
                switch(operation2){
                    case "*": result = first - second * third;break;
                    case "/": result = first - second / third;break;
                    case "+": result = first - second + third;break;
                    case "-": result = first - second - third;break;
                }
                break;
        }
        System.out.println("정답은 : "+result);
    }
}
