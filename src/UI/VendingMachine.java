package UI;

import java.util.ArrayList;
import java.util.Scanner;

// 음료 클래스
class Drink {
    String name;      // 음료 이름
    int price;        // 가격
    int capacity;     // 용량 (ml)

    Drink(String name, int price, int capacity) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
    }
}

// 자판기 클래스
public class VendingMachine {
    ArrayList<Drink> drinks = new ArrayList<>();
    int money = 0;
    Scanner sc = new Scanner(System.in);

    // 생성자 (초기 음료 목록 설정)
    public VendingMachine() {
        drinks.add(new Drink("코카콜라", 1200, 355));
        drinks.add(new Drink("칠성사이다", 1200, 355));
        drinks.add(new Drink("TOP", 1000, 250));
        drinks.add(new Drink("물", 1000, 500));
    }

    // 메뉴 출력
    public void showMenu() {
        System.out.println("\n--- 음료 목록 ---");
        for (int i = 0; i < drinks.size(); i++) {
            Drink d = drinks.get(i);
            String status = (money >= d.price) ? "✅" : "❌";
            System.out.println(
                    (i + 1) + ". " + d.name + " (" + d.capacity + "ml, " + d.price + "원) " + status
            );
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
            System.out.println(" 잘못된 선택입니다! 다시 입력해주세요.");
            return;
        }
        Drink d = drinks.get(choice - 1);
        if (money >= d.price) {
            money -= d.price;
            System.out.println(d.name + "(" + d.capacity + "ml)을(를) 구매했습니다! 남은 금액: " + money + "원");
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
