package UI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachine vm = new VendingMachine();

        System.out.println("===  자판기에 오신 걸 환영합니다  ===");

        while (true) {
            vm.showMenu();
            System.out.println("1. 돈 넣기 | 2. 음료 선택 | 3. 거스름돈 반환 | 0. 종료");
            System.out.print("선택 >> ");
            int menu = sc.nextInt();

            if (menu == 0) {
                System.out.println("이용해주셔서 감사합니다 ");
                break;
            }

            switch (menu) {
                case 1:
                    System.out.print("투입할 금액: ");
                    int money = sc.nextInt();
                    vm.insertMoney(money);
                    break;
                case 2:
                    System.out.print("음료 번호를 선택하세요: ");
                    int choice = sc.nextInt();
                    vm.buyDrink(choice);
                    break;
                case 3:
                    vm.returnMoney();
                    break;
                default:
                    System.out.println("️ 올바른 메뉴를 선택하세요.");
            }
        }

        sc.close();
    }
}