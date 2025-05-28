import java.sql.SQLOutput;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Задача 1");
        int [] salary = new int [5];
        salary [0] = 50000;
        salary [1] = 60000;
        salary [2] = 70000;
        salary [3] = 80000;
        salary [4] = 90000;
        int sum = 0;
        for (int index = 0; index < salary.length; index++) {
            sum = sum + salary[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");


        System.out.println("Задача 2");
        int [] expense = new int [5];
        expense [0] = 3785;
        expense [1] = 55785;
        expense [2] = 200;
        expense [3] = 30000;
        expense [4] = 7585;
        int maxExpense = 3785;
        int minExpense = 3785;
        for (int i = 0; i < expense.length; i++) {
            if (expense [i] > maxExpense) {
                maxExpense = expense[i];
            }
            if (expense [i] < minExpense) {
                minExpense = expense[i];
            }
                    }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей. Максимальная сумма трат за неделю составила " + maxExpense + " рублей");


       /*  Вариант 2 решения Задачи 2
       int [] expense = new int [5];
        expense [0] = 3785;
        expense [1] = 55785;
        expense [2] = 200;
        expense [3] = 30000;
        expense [4] = 7585;
        int maxExpense = 3785;
        int minExpense = 3785;
        for (final int current : expense) {
            if (current > maxExpense) {
                maxExpense = current;
            }
            if (current < minExpense) {
                minExpense = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpense + " рублей. Максимальная сумма трат за неделю составила " + maxExpense + " рублей");
*/


        System.out.println("Задача 3");
        int [] expenses = new int [5];
        expenses [0] = 1500;
        expenses [1] = 2300;
        expenses [2] = 1700;
        expenses [3] = 3220;
        expenses [4] = 5505;
        int weeks = 4;
        int allExpenses = 0;
        for (int i : expenses) {
            allExpenses += i;
                    }
        double averageExpenses = (double) allExpenses / weeks;
        System.out.println("Средняя сумма трат за месяц составила " + averageExpenses + " рублей");



        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
            }




    }
}