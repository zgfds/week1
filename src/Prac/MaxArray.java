package Prac;

public class MaxArray {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 20, 40, 50};
        int max = numbers[0];

        for (int i=1; i<numbers.length; i++) {
            System.out.println((i+1)+"입력 "+" 값"+ numbers[i]);
            if (numbers[i] > max) {
                max = numbers[i];
                System.out.println(numbers[i] + "/" + max);
            }
        }
        System.out.println("최대값 = " +max);
    }
}
