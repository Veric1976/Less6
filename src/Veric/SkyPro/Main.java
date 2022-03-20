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
// Task-5
        System.out.println();
        int[][] firstMatrix = new int [3][3];
        for ( int i = 0; i < 3; i++ ){
            firstMatrix[i][i] = 1;
            firstMatrix[2-i][i] = 1;
        }
        for (int[] row : firstMatrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
// Task-6
        int[] sourceArray = {5,4,3,2,1};
        int[] copySourceArray = new int[5];
        for (int i = 0; i < copySourceArray.length; i++) {
            copySourceArray[copySourceArray.length-1-i] = sourceArray[i];
        }
        System.out.println(Arrays.toString(sourceArray));
        System.out.println(Arrays.toString(copySourceArray));
// Task-7
        int halfLengthSourceArray = sourceArray.length / 2;
        int tmpValueArray;
        System.out.println("Task-7");
        System.out.println(Arrays.toString(sourceArray));
        for (int i = 0; i <= halfLengthSourceArray; i++) {
            tmpValueArray = sourceArray[i];
            sourceArray[i] = sourceArray[sourceArray.length-1-i];
            sourceArray[sourceArray.length-1-i] = tmpValueArray;
        }
        System.out.println(Arrays.toString(sourceArray));
// Task-8
        System.out.println("Task-8");
        int[] taskArray = {-6,2,5,-8,8,10,4,-7,12,1};
        boolean pairIsFinded = false;
        for (int i = 0; i < taskArray.length && !pairIsFinded; i++) {
            for (int j = taskArray.length-1; j > i; j--) {
                if (taskArray[i]+taskArray[j] == -2 ) {
                    System.out.print(taskArray[i] + "'" + i + "' ");
                    System.out.print(taskArray[j] + "'" + j + "'\n");
                    pairIsFinded = true;
                    break;
                }
            }
        }
// Task-9
        System.out.println("Task-9");
        for (int i = 0; i < taskArray.length; i++) {
            for (int j = taskArray.length-1; j > i; j--) {
                if (taskArray[i]+taskArray[j] == -2 ) {
                    System.out.print(taskArray[i] + "'" + i + "' ");
                    System.out.print(taskArray[j] + "'" + j + "'\n");
                }
            }
        }
    }
}
