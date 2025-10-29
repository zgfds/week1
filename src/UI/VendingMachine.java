package UI;

import java.util.ArrayList;
import java.util.Scanner;

class Drink {
    String name;  // 음료 이름
    int price;    // 가격

    Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class VendingMachine {
    ArrayList<Drink> drinks = new ArrayList<>();
    int money = 0;
    Scanner sc = new Scanner(System.in);

    // 생성자 (초기 음료 목록 설정)
    public VendingMachine() {
        drinks.add(new Drink("코카콜라", 2500));
        drinks.add(new Drink("칠성사이다", 2000));
        drinks.add(new Drink("TOP", 2500));
        drinks.add(new Drink("물", 1000));
    }

    // 메뉴 출력
    public void showMenu() {
        System.out.println("\n--- 음료 목록 ---");
        for (int i = 0; i < drinks.size(); i++) {
            Drink d = drinks.get(i);
            String status = (money >= d.price) ? "✅" : "❌";
            System.out.println((i + 1) + ". " + d.name + " (" + d.price + "원) " + status);
        }
        System.out.println("----------------");
        System.out.println("현재 투입 금액: " + money + "원");
    }

    // 돈 넣기
    public void insertMoney(int amount) {
        if (amount <= 0) {
            System.out.println("올바른 금액을 입력하세요!");
            return;
        }
        money += amount;
        System.out.println(amount + "원을 넣었습니다. 현재 금액: " + money + "원");
    }

    // 음료 구매
    public void buyDrink(int choice) {
        if (choice < 1 || choice > drinks.size()) {
            System.out.println("잘못된 선택입니다!");
            return;
        }
        Drink d = drinks.get(choice - 1);
        if (money >= d.price) {
            money -= d.price;
            System.out.println(d.name + "를(을) 구매했습니다! 남은 금액: " + money + "원");
        } else {
            System.out.println("잔액이 부족합니다!");
        }
    }

    // 잔돈 반환
    public void returnMoney() {
        if (money > 0) {
            System.out.println("거스름돈 " + money + "원을 반환합니다.");
            money = 0;
        } else {
            System.out.println("반환할 금액이 없습니다.");
        }
    }
}
