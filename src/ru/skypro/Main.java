package ru.skypro;

public class Main {

    public static void main(String[] args) {
        int age = 19;
        int salary = 58_000;
        double limit;
        if (age < 23) {
            limit = salary * 2;
        } else {
            limit = salary * 3;
        }
        if (salary >= 50_000) {
            limit = limit * 1.2;
        } else if (salary >= 80_000) {
            limit = limit * 1.5;
        }
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
        System.out.println();
        int age2 = 25;
        int salary2 = 60_000;
        int wantedSum = 330_000;
        int credit = 12;
        int paymentMax = salary2 / 2;
        double rate = 10;
        if (age2 < 23) {
            rate++;
        } else if (age2 < 30) {
            rate = rate + 0.5;
        }
        if (salary2 > 80_000) {
            rate = rate - 0.7;
        }
        double maxCredit = wantedSum * (1 + (rate / 100));
        double payment = maxCredit / credit;
        System.out.println("Максмальный платеж " + paymentMax + " платеж по кредиту: " + payment);
        if (payment > paymentMax) {
            System.out.println("В кредите отказано");
        } else {
            System.out.println("Кредит одобрен");

        }

    }
}

