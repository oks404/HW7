import java.util.Date;

public class Main {
    public static void main(String[] args) {
//  Задание 1.1
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + salary;
            month = month + 1;
            if (total >= 2_459_000) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
//  Задание 1.2
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println("");
        for (int b = 10; b >= 1; b--) {
            System.out.print(b + " ");
        }
//  Задание 1.3
        int populationY = 12_000_000;
        int birthRateInYear = 17 * (populationY / 1_000);
        int deathRateInYear = 8 * (populationY / 1_000);
        int increaceInYear = birthRateInYear - deathRateInYear;
        int totalPopulation = 0;
        for (int i = 1; i <= 10; i++) {
            totalPopulation = totalPopulation + increaceInYear;
            System.out.print("\n Год " + i + ", численность населения составляет " + (totalPopulation + populationY));
        }
//  Задание 2.1 - 2.3
        int vasyaSaveMoneyinMonth = 15_000;
        int totalVasyaSave = 0;
        int monthVasya = 0;
//        while (totalVasyaSave <= 12_000_000){    Задание 2.1 - 2.2
        while (monthVasya <= 9 * 12) {
            totalVasyaSave = totalVasyaSave + (totalVasyaSave / 100 * 7);
            totalVasyaSave = totalVasyaSave + vasyaSaveMoneyinMonth;
            monthVasya++;
            if (monthVasya % 6 == 0) {
                System.out.print("\n Месяц " + monthVasya + ", сумма накоплений равна " + totalVasyaSave + " рублей");
            }
        }
//  Задание 2.4
        int firstFriday = 5;
        for (; firstFriday <= 31; firstFriday = firstFriday + 7)
            System.out.print("\n Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
//  Задание 3.1
        int currentYear = 2022;
        int previousYears = currentYear - 200;
        int futureYears = currentYear + 100;
        while (previousYears < 2022){
            previousYears = previousYears + 1;
            if (previousYears % 79 == 0) {
                System.out.print("\n" + previousYears);
            }
        }
        while ( futureYears > 2022){
            futureYears = futureYears - 1;
            if (futureYears % 79 == 0){
                System.out.println("\n" + futureYears);
            }
        }
//  Задание 3.2
        int multiplicand = 2;
        int multiplier = 0;
        int multiplicationResult = 0;
        while (multiplier < 10){
            multiplier = multiplier + 1;
            multiplicationResult = multiplicand * multiplier;
            System.out.print("\n" + multiplicand + "*" + multiplier + "=" + multiplicationResult);
        }
    }
}