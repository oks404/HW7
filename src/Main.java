public class Main {
    public static void main(String[] args) {
//  Задание 1
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000){
            total = total + total/100;
            total = total + salary;
            month = month + 1;
        }
        if (total >= 2_459_000){
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
//  Задание 2
        int a = 0;
        while (a < 10){
            a = a + 1;
            System.out.print(a + " ");
        }
        System.out.println("");
        for (int b = 10; b >= 1; b--){
            System.out.print(b + " ");
        }
//  Задание 3
        int populationY = 12_000_000;
        int birthRateInYear = 17 * (populationY / 1_000);
        int deathRateInYear = 8 * (populationY / 1_000);
        int increaceInYear = birthRateInYear - deathRateInYear;
        int totalPopulation = 0;
        for (int i = 1; i <= 10; i++) {
            totalPopulation = totalPopulation + increaceInYear;
            System.out.print("\n Год " + i + ", численность населения составляет " + (totalPopulation + populationY));
        }
    }
}