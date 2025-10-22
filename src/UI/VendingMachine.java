package UI;

import java.util.ArrayList;


class Drink {
    String name;     // 음료 이름
    int price;       // 가격
    String size;     // 용량
    String category; // 종류

    Drink(String name, int price, String size, String category) {
        this.name = name;
        this.price = price;
        this.size = size;
        this.category = category;
    }

    void displayInfo(int index) {
        System.out.printf("%d. %s - %s (%s) : %d원\n", index, name, size, category, price);
    }
}


class VendingMachine {
    private ArrayList<Drink> drinks = new ArrayList<>();
    private int insertedMoney = 0;
    private boolean lightOn = false;


    public VendingMachine() {
        drinks.add(new Drink("코카콜라", 2000, "355ml", "탄산음료"));
        drinks.add(new Drink("커피", 1500, "250ml", "카페인음료"));
        drinks.add(new Drink("물", 1000, "500ml", "생수"));
        drinks.add(new Drink("칠성사이다",1700,"355ml","탄산음료"));
    }


    public void showMenu() {
        System.out.println("\n===  자판기 메뉴  ===");
        for (int i = 0; i < drinks.size(); i++) {
            drinks.get(i).displayInfo(i + 1);
        }
        System.out.println("----------------------------");
        System.out.println("현재 투입된 금액: " + insertedMoney + "원");
        System.out.println("[불빛 상태] : " + (lightOn ? "ON  (구매 가능)" : "OFF  (금액 부족)"));
    }


    public void insertMoney(int money) {
        insertedMoney += money;
        System.out.println( money + "원을 넣었습니다.");
        updateLight();
    }


    private void updateLight() {
        for (Drink d : drinks) {
            if (insertedMoney >= d.price) {
                lightOn = true;
                return;
            }
        }
        lightOn = false;
    }

    // 음료 구매
    public void buyDrink(int choice) {
        if (choice < 1 || choice > drinks.size()) {
            System.out.println(" 잘못된 선택입니다.");
            return;
        }

        Drink selected = drinks.get(choice - 1);

        if (insertedMoney < selected.price) {
            System.out.println(" 금액이 부족합니다! (" + selected.price + "원 필요)");
            updateLight();
            return;
        }

        insertedMoney -= selected.price;
        System.out.println( selected.name + "이(가) 나왔습니다!");
        System.out.println("남은 잔돈: " + insertedMoney + "원");
        updateLight();
    }


    public void returnMoney() {
        System.out.println("거스름돈 " + insertedMoney + "원을 반환합니다.");
        insertedMoney = 0;
        updateLight();
    }
}

