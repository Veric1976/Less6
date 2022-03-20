package Veric.SkyPro;
import java.util.Arrays;
public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
// Task-1
        int[] arraySumPerDay = generateRandomArray();
        int sumAllDays=0;
        for ( int i : arraySumPerDay ) {
            sumAllDays += i;
        }
        System.out.println("Сумма трат за месяц составила " +
                sumAllDays + " рублей");
// Task-2
        int minPayPerDay=500_000;
        int maxPayPerDay=0;
        for ( int i :  arraySumPerDay ) {
            if ( i < minPayPerDay && i != 0) {
                minPayPerDay = i;
            }
            if ( i > maxPayPerDay) {
                maxPayPerDay = i;
            }
        }
        System.out.print("Минимальная сумма трат за день составила " +
                minPayPerDay + " рублей.");
        System.out.print(" Максимальная сумма трат за день составила " +
                maxPayPerDay + " рублей.\n");
// Task-3
        float averagePayPerDay;
        averagePayPerDay = (float) sumAllDays / (float) arraySumPerDay.length;
        System.out.println("Средняя сумма трат за месяц составила " +
                averagePayPerDay + " рублей.");
// Task-4
        char[] reverseFullName = {'n','a','v','I',' ','v','o','n','a','v','I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
